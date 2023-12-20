import java.util.*;

public class Main {
    public static void main(String[] args) {
       List<Integer> numbers = new ArrayList<Integer>();
       List<Integer> numbers2 = new ArrayList<Integer>();
       numbers.add(1);
       numbers.add(2);
       numbers.add(3);
       numbers.add(4);
       Iterator<Integer> it = numbers.iterator();
       while (it.hasNext()){
           int n = it.next();
           Collections.addAll(numbers2, n);
           //numbers2.add(n);
       }
        Collections.reverse(numbers2);
        System.out.println("array invers" + numbers2);
        System.out.println("array normal" + numbers);

    }
}