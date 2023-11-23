import java.util.*;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String nomeMes;
        List<Month> monthList = new ArrayList<>();
        Set<Month> months = new HashSet<>();
        Iterator<Month> monthsIterator = months.iterator();

        for (int i = 1; i <= 12; i++) {
            System.out.println(" Introduzca el Month " + i);
            nomeMes = input.nextLine().toLowerCase();
            monthList.add(new Month(nomeMes));

        }
        // Ordenar la lista de meses

        Collections.sort(monthList);

        months.addAll(monthList);


        System.out.println("Recorriendo con iterador:");
        while (monthsIterator.hasNext()) {

            System.out.println(monthsIterator.next());
        }

        System.out.println("Recorriendo con bucle for:");
        for (Month month: months) {
//            if(month.getName().charAt(1) != 'a'){
//                months.add(new Month("agosto"));
//            }

            System.out.println(month.getName());
        }
    }
}