import java.util.Arrays;
public class Sorter<T extends Comparable<T>> {
    private T[] values;
    public Sorter(T[] values) {
        this.values = values;
    }
    public void sort() {
        Arrays.sort(values);
    }
    public T[] getSortedValues() {
        return values;
    }
    public static void main(String[] args) {
        // Sort integers
        Integer[] intValues = {5, 2, 8, 3, 1};
        Sorter<Integer> intSorter = new Sorter<>(intValues);
        intSorter.sort();
        System.out.println("Sorted integers: " + Arrays.toString(intSorter.getSortedValues()));
        // Sort strings
        String[] stringValues = {"Banana", "Apple", "Orange", "Grape"};
        Sorter<String> stringSorter = new Sorter<>(stringValues);
        stringSorter.sort();
        System.out.println("Sorted strings: " + Arrays.toString(stringSorter.getSortedValues()));
        // Sort doubles
        Double[] doubleValues = {3.14, 2.71, 1.61, 0.577};
        Sorter<Double> doubleSorter = new Sorter<>(doubleValues);
        doubleSorter.sort();
        System.out.println("Sorted doubles: " + Arrays.toString(doubleSorter.getSortedValues()));
    }
}
