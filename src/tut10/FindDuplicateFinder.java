package tut10;

import tut10.binary_search_tree.BinarySearchTree;

import java.util.Scanner;

public class FindDuplicateFinder {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = inp.nextInt();
        }

        BinarySearchTree bst = new BinarySearchTree();
        for (int num : a) {
            if (!bst.insert(num, bst))
                System.out.println("Duplicate found: " + num);
        }

        inp.close();
    }
}
