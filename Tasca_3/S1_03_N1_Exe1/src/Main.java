import java.util.*;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String nomeMes;
        List<Month> months = new ArrayList<Month>();

        for (int i = 1; i < 12; i++) {
            System.out.println(" Introduzca el Month " + i);
            nomeMes = input.nextLine().toLowerCase();
            months.add(new Month(nomeMes));
        }
        if (months.contains("agost")){
            months.remove("agost");
        }
        Collections.sort(months);

        System.out.println("meses ordenados");
        for (Month month: months) {
            System.out.println(month.getName());
        }

        months.set(1, new Month("Agost"));// inserting new object in the position

        for (Month month: months) {

            System.out.println(month.getName());
        }
    }
}