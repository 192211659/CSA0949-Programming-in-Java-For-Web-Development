import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        // Initializing the list with elements
        List<String> elements = new ArrayList<>();
        elements.add("C");
        elements.add("A");
        elements.add("E");
        elements.add("B");
        elements.add("D");
        elements.add("F");

        // Using ListIterator to append '+' symbol
        ListIterator<String> listIterator = elements.listIterator();
        while (listIterator.hasNext()) {
            String element = listIterator.next();
            listIterator.set(element + "+"); // Append '+' symbol
        }

        // Printing the elements in reverse order
        System.out.println("Elements in reverse order:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
