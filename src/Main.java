import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));
        intList.sort(Comparator.naturalOrder());

        Iterator<Integer> integerIterator = intList.iterator();
        while (integerIterator.hasNext()) {
            Integer integer = integerIterator.next();
            if (integer <= 0 || integer % 2 != 0) {
                integerIterator.remove();
            }
        }

        System.out.println(intList);
    }
}
