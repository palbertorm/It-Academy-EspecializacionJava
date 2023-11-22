import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String nomeMes;
        ArrayList<Month> months = new ArrayList<Month>();

        for (int i = 1; i < 12; i++) {
            System.out.println(" Introduzca el Month " + i);
            nomeMes = input.nextLine();
            months.add(new Month(nomeMes));
        }
        Collections.sort(months);
      //  System.out.println(months.get());
        for (Month month: months) {
            System.out.println(month.getName());
        }
    }
}