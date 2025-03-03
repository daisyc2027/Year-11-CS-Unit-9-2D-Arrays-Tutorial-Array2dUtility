
public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.

    public void print(int[][] arr){
        for(int i = 0;i<arr.length; i++){
            for(int j = 0; j<arr[i].length; i++){
                System.out.println(arr[i][j]);
            }
        }
    }

    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers
    public static int sum(int[][] arr){
        int returnInt = 0;
        for(int i = 0;i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                returnInt += (arr[i][j]);
            }
        }
        return returnInt;
    }

    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.

    public static double average(int[][] arr){
        return (double) sum(arr) / (arr.length * arr.length);
    }

    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.

    public static int minimum(int[][] arr){
        int smallest = arr[0][0];
        for(int i = 0;i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                if(arr[i][j] < smallest){
                    smallest = arr[i][j];
                }
            }
        }
        return smallest;
    }
    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.
    public static int maximum(int[][] arr){
        int largest = arr[0][0];
        for(int i = 0;i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                if(arr[i][j] > largest){
                    largest = arr[i][j];
                }
            }
        }
        return largest;
    }

    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.
    public static int evenCountStandard(int[][] arr){
        int count = 0;
        for(int i = 0;i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                if(arr[i][j]%2 == 0){
                    count++;
                }
            }
        }
        return count;
    }


    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.

    public static int evenCountEnhanced(int[][] arr){
        int count = 0;
        for(int[] i : arr){
            for(int j : i){
                if(j%2 == 0){
                    count++;
                }
            }
        }
        return count;
    }


    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.

    public static boolean allPositive(int[][] arr){
        for(int[] i : arr){
            for(int j : i){
                if(j <= 0){
                    return false;
                }
            }
        }
        return true;
    }


    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.

    public static int[] rowSums(int[][] arr){
        int[] returnArr = new int[arr.length];

        for(int i = 0;i<arr.length; i++){
            int sum = 0;
            for(int j = 0; j<arr[i].length; j++){
                sum += arr[i][j];
            }
            returnArr[i] = sum;
        }
        return returnArr;
    }


    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.
    public static int[] colSums(int[][] arr){
        int[] returnArr = new int[getHighestCount(arr)];

        for(int i = 0;i<arr.length; i++){
            int sum = 0;
            for(int j = 0; j<arr[i].length; j++){
                sum += arr[j][i];
            }
            returnArr[i] = sum;
        }
        return returnArr;
    }

    public static int getHighestCount(int[][] arr){
        int greatest = arr[0].length;
        for(int[] i: arr){
            if (i.length > greatest) greatest = i.length;
        }
        return greatest;
    }
}
