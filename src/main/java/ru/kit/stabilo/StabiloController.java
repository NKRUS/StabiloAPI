package ru.kit.stabilo;

import com4j.EventCookie;
import wsh.ClassFactory;
import wsh.Istpl_drv;
import wsh.events.Istpl_drvEvents;

/**
 * Created by mikha on 28.12.2016.
 */
public class StabiloController {


    private volatile double weight;
    private volatile double x;
    private volatile double y;
    Thread t;

    private Runnable r = new Runnable() {
        public void run() {
            EventCookie cookie = null;
            try {
                Istpl_drv stabilo = ClassFactory.createstpl_drv();
//                stabilo.data_w_x_y();
                cookie = stabilo.advise(Istpl_drvEvents.class, new EventReceiver());
                stabilo.data_w_x_y();

                while (!Thread.currentThread().isInterrupted()) {
                    weight = EventReceiver.getWxy()[0];
                    x = EventReceiver.getWxy()[1];
                    y = EventReceiver.getWxy()[2];
                }

            } catch (Exception var01) {
                var01.printStackTrace();
            } finally {
                cookie.close();
            }
        }
    };

    /** Включает весы в отдельном потоке.
     * Вес записывается в переменную weight.
     **/
    public void onDynamicData() {
        if (t == null) {
            t = new Thread(r);
        }
        if (!t.isAlive()) {
            t.setDaemon(true);
            t.start();
        } else if (t.isInterrupted()) {
            System.err.println(t.getName() + " остановлена");
        }

    }

    public void dataZero() {
        t.interrupt();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Istpl_drv stabilo = ClassFactory.createstpl_drv();
        stabilo.data_zero();
        t = new Thread(r);
    }

    /** Выключает весы */
    public void offDynamicData() {
        t.interrupt();
    }

    public double getWeight() {
        return weight;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    /** sizePlatform[0] - min X */
    /** sizePlatform[1] - max X */
    /** sizePlatform[2] - min Y */
    /** sizePlatform[3] - max Y */
    public long[] getSizePlatform() {
        EventCookie cookie = null;
        long[] sizePlatform = null;

        try {
            Istpl_drv stabilo = ClassFactory.createstpl_drv();
//            stabilo.data_size_platformi();
            cookie = stabilo.advise(Istpl_drvEvents.class, new EventReceiver());
            stabilo.data_size_platformi();
            sizePlatform = EventReceiver.getSizePlatform();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return sizePlatform;
    }
}
