import java.util.*;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String nomeMes;
        List<Month> monthList = new ArrayList<>();
        Set<Month> monthHashSet = new HashSet<>(monthList);


        /*for (int i = 1; i <= 12; i++) {
            System.out.println(" Introduzca el Month " + i);
            nomeMes = input.nextLine().toLowerCase();
            monthList.add(new Month(nomeMes));

        }*/
        Month month1 = new Month("enero");
        Month month2 = new Month("febrero");
        Month month3 = new Month("marzo");
        Month month4 = new Month("abril");
        Month month5 = new Month("maio");
        Month month6 = new Month("junio");
        Month month7 = new Month("julio");
        Month month8 = new Month("septiembre");
        Month month9 = new Month("octubre");
        Month month10 = new Month("noviembre");
        Month month11 = new Month("diciembre");

        // Agregar los objetos Month a la lista
        Collections.addAll(monthList, month1, month2, month3, month4, month5, month6, month7, month8, month9, month10, month11);

        // Agregar el objeto Month correspondiente a diciembre en la posición 12
        monthList.add(11, new Month("agosto"));
        // Ordenar la lista de meses
        Collections.sort(monthList);
        System.out.println(" Meses ordenados sin HashSet");
        for (Month month: monthList) {
            System.out.println(month.toString());
        }

        monthHashSet.addAll(monthList);
        monthHashSet.add(month11); // mes repetido para comprabar que no se repite

        System.out.println("Recorriendo con iterador con HashSet:");
        Iterator<Month> monthsIterator = monthHashSet.iterator();
        while (monthsIterator.hasNext()) {

            System.out.println(monthsIterator.next());
        }

        System.out.println("Recorriendo HashSet con bucle for:");
        // compruebo de lauw no haya repeticiones
        for (Month month: monthHashSet) {
            System.out.println(month.toString());
        }
    }
}