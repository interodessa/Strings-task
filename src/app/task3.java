package app;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        String[] names = {"Bob", "Alice", "Tom", "Lucy", "Bob", "Lisa"};
        searchName(names);
    }
    public static void searchName(String[] names) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String searchName = scanner.nextLine();

        int count = 0;
        for (String name : names) {
            if (name.equals(searchName)) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("Name find: " + searchName);
            System.out.println("Count: " + count);
        } else {
            System.out.println("Name \"" + searchName + "\" not in the list.");
        }
    }
}


