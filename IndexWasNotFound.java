

import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[8];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;

        System.out.println("Search for? ");
        int searching = Integer.valueOf(scanner.nextLine());

        // Implement the search functionality here       
        boolean found = false;
        
        for (int i: array) {
            if (searching == i) {
                found = true;
            }
        }
        
        if (found == false) {
            System.out.println(searching + " was not found");
        } else {
            for (int index = 0; index < array.length; index++) {
                if (searching == array[index]) {
                    System.out.println(searching + " is at index " + index + ".");
                }
            }
        }
        
    }

}
