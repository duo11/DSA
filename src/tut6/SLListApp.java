package tut6;

public class SLListApp {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(new SLNode("Hello"));
        list.add(new SLNode("World"));
        list.add(new SLNode("Java"));

        list.print(); // Output: Java World Hello

        list.remove(1);
        list.print(); // Output: Java Hello

        list.addAt(1, new SLNode("Programming"));
        list.print(); // Output: Java Programming Hello

        System.out.println("Size of the list: " + list.size()); // Output: 3
        System.out.println("Is the list empty? " + list.isEmpty()); // Output: false

        System.out.println("Position of 'Java' in the list: " + list.search("Java")); // Output: 0
        System.out.println("Position of 'Python' in the list: " + list.search("Python")); // Output: -1
    }
}
