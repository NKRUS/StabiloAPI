package ru.kit.stabilo;

import wsh.events.Istpl_drvEvents;

import java.util.Date;

/**
 * Created by mikha on 28.12.2016.
 */
public class EventReceiver extends Istpl_drvEvents {

    private volatile static double[] wxy = new double[3];
    private volatile static long[] sizePlatform = new long[4];

    public static double[] getWxy() {
        return wxy;
    }

    public static long[] getSizePlatform() {
        return sizePlatform;
    }

    @Override
    public void onknopkadawn(long knop, boolean pressed) {
        super.onknopkadawn(knop, pressed);
    }

    @Override
    public void onerrors(long n_errore, String text_error) {
        super.onerrors(n_errore, text_error);
    }

    @Override
    public void onacp(long acp1, long acp2, long acp3, long acp4) {
        super.onacp(acp1, acp2, acp3, acp4);
    }

    @Override
    public void ondatawxy(double w, double x, double y, double ax, double ay, double az) {
//        System.out.println(String.format("%f %f %f", w, x, y));
        wxy[0] = w;
        wxy[1] = x;
        wxy[2] = y;
        super.ondatawxy(w, x, y, ax, ay, az);
    }

    @Override
    public void onsizeplatformi(long xmin, long xmax, long ymin, long ymax, long pid, long serial, Date date, long xparam) {

        sizePlatform[0] = xmin;
        sizePlatform[1] = xmax;
        sizePlatform[2] = ymin;
        sizePlatform[3] = ymax;
        super.onsizeplatformi(xmin, xmax, ymin, ymax, pid, serial, date, xparam);
    }

    @Override
    public void onclose() {
        super.onclose();
    }

    @Override
    public void onfound() {
        super.onfound();
    }

    @Override
    public void onlost() {
        super.onlost();
    }

    @Override
    public void onversproshivki(String ver) {
        super.onversproshivki(ver);
    }

    @Override
    public void ondatawxyfilter(double w, double x, double y) {
        super.ondatawxyfilter(w, x, y);
    }

    @Override
    public void oncalibrationend(boolean successful, String settings_filename) {
        super.oncalibrationend(successful, settings_filename);
    }

    @Override
    public void onlanguags(String installed_leng, String available_lang) {
        super.onlanguags(installed_leng, available_lang);
    }
}
