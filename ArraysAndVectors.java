//ArraysandVectors.java
//Gerardo Solis
//8/24/23
public class ArraysAndVectors {
    public static void main(String[] args) {

        System.out.println("Welcome to the Array Program!");

        //Create an int array
        int[] magicNumbers = new int[5];

        //Fill the array with ints
        magicNumbers[0] = 1;
        magicNumbers[1] = 8;
        magicNumbers[2] = 14;
        magicNumbers[3] = 22;
        magicNumbers[4] = 35;


        // output the array
        System.out.println("magicNumbers[4] = " + magicNumbers[4]);

        System.out.println("\n\n");

        for (int i = 0; i < 5; i++) {
            // print the elements of the array
            System.out.println("magicNumbers[" + i + "] is: " + magicNumbers[i]);
        }

        //fill array with 5, 10, 15, etc.
        int myFiveContainer = 0;
        for (int i = 0; i < 5; i++) {
            // print the elements of the array
            magicNumbers[i] = myFiveContainer += 5;
        }
        System.out.println("\n\n This array should be the 5s");
        for (int i = 0; i < 5; i++) {
            // print the elements of the array
            System.out.println("magicNumbers[" + i + "] is: " + magicNumbers[i]);
        }
        System.out.println("\n\n");

        //Nested loops and 2D arrays

        int[][] numberGrid = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {0}
        };
        System.out.println(numberGrid[1][2]);

        myFiveContainer = 0;
        for (int i = 0; i < numberGrid.length; i++) {
            for (int j = 0; j < numberGrid[i].length; j++) {
            }
            System.out.println();
        }
        System.out.println("\n\n");
        //Create a 2D array
        int[][] myNumnberGrid = new int[4][3];
        //fill the array with a for() loop

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                myNumnberGrid[i][j] = myFiveContainer += 5;
                System.out.print(myNumnberGrid[i][j] + " ");
            }
            System.out.println();

        }

    }

}
