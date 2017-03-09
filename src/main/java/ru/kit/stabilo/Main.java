package ru.kit.stabilo;

import java.util.Arrays;

/**
 * Created by mikha on 28.12.2016.
 */
public class Main {

    public static void main(String[] args) {

        final StabiloController stabilo = new StabiloController();
        stabilo.onDynamicData();

        Thread thread = new Thread(new Runnable() {
            public void run() {
                try {
                    while (!Thread.currentThread().isInterrupted()) {
                        System.out.println("weight: " + stabilo.getWeight());
                        System.out.println("x=" + stabilo.getX() + " " + "y=" + stabilo.getY());
                        System.out.println("size " + Arrays.toString(stabilo.getSizePlatform()));
                        Thread.sleep(200);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });

        thread.start();

        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread.interrupt();
        stabilo.offDynamicData();
    }
}
