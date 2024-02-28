package org.example;

import java.sql.Time;
import java.util.Timer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Main {
    public static void main(String[] args) {

        final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        final Runnable runnable = new Runnable() {
            int countdownStarter = 20;

            public void run() {

                for (int i = 1; i < countdownStarter; i++) {
                    System.out.println("el valor de " + i + " "+ countdownStarter);
                    //System.out.println(countdownStarter);
                    if (i == countdownStarter){
                        scheduler.shutdown();
                        System.out.println("Timer Over!");
                    }
                    for (int j = 20; j < countdownStarter; j--) {
                        System.out.println("el + " + j);

                    }
                    countdownStarter--;
                }


                if (countdownStarter <= 0) {
                    System.out.println("Timer Over!");
                    scheduler.shutdown();
                }
            }
        };
        scheduler.scheduleAtFixedRate(runnable, 0, 1, SECONDS);
//        int entrada = 7;
//
//        int inicio = 1;
//        Timer timer = new Timer();
//        int entradaAux = entrada;
//
//
    }
    public static void cuentaDelante(int x){
        for (int i = 0; i < x; i++) {
            System.out.println("el valor de " + i);
        }
    }public static void cuentaAtras(int x){
        for (int i = x; i > 0; i--) {
            System.out.println("el valor de " + i);
        }
    }
    /*
    Crea una función que reciba dos parámetros para crear una cuenta atrás.
    El primero, representa el número en el que comienza la cuenta.
    El segundo, los segundos que tienen que transcurrir entre cada cuenta.
    Sólo se aceptan números enteros positivos.
    El programa finaliza al llegar a cero.
    Debes imprimir cada número de la cuenta atrás.
    */

}