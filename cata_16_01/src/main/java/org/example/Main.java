package org.example;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

//Crea una función que sea capaz  de detectar si existe un viernes 13 en el mes y el año indicado
//La funcion recibirá el mes Y el año y retornará verdadero o falso.
public class Main {
    public static void main(String[] args) {

            Calendar calendar = new GregorianCalendar();
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
            int month = calendar.getMaximum(Calendar.JANUARY);

    }
    private static boolean isViernes13(int mes, int anyo){

        return true;
    }
}