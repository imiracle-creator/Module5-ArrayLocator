//Isaiah Miracle Module 5 - ArrayLocator 04/13/2025

public class ArrayLocator {

    // Locate the largest element in a double 2D array
    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = new int[2];
        double max = arrayParam[0][0];
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Locate the largest element in an int 2D array
    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = new int[2];
        int max = arrayParam[0][0];
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Locate the smallest element in a double 2D array
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = new int[2];
        double min = arrayParam[0][0];
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Locate the smallest element in an int 2D array
    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = new int[2];
        int min = arrayParam[0][0];
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Main method to test the above functions
    public static void main(String[] args) {
        double[][] doubleArray = {
                {1.2, 3.5, 2.8},
                {7.9, 6.1, 4.3},
                {5.4, 0.2, 8.8}
        };

        int[][] intArray = {
                {4, 8, 3},
                {1, 9, 6},
                {7, 2, 5}
        };

        int[] largestDouble = locateLargest(doubleArray);
        int[] smallestDouble = locateSmallest(doubleArray);
        int[] largestInt = locateLargest(intArray);
        int[] smallestInt = locateSmallest(intArray);

        System.out.printf("Largest in double[][]: [%d][%d]\n", largestDouble[0], largestDouble[1]);
        System.out.printf("Smallest in double[][]: [%d][%d]\n", smallestDouble[0], smallestDouble[1]);
        System.out.printf("Largest in int[][]: [%d][%d]\n", largestInt[0], largestInt[1]);
        System.out.printf("Smallest in int[][]: [%d][%d]\n", smallestInt[0], smallestInt[1]);
    }
}
