package tut6;

public class ArrayListApp {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(5);
        list.add(10);
        list.get(1); // Output: 10
        list.add(15);
        list.printAll(); // Output: 5 10 15

        list.add(1, 8);
        list.printAll(); // Output: 5 8 10 15

        list.remove(2);
        list.printAll(); // Output: 5 8 15

        System.out.println("Size of the list: " + list.size()); // Output: 3
        System.out.println("Is the list empty? " + list.isEmpty()); // Output: false
        System.out.println("Is the list full? " + list.isFull()); // Output: false
    }
}
