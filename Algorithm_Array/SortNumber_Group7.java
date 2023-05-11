/*Sortnumber Group7
  Member:
  1. Mr.Xaisana
  2. Mr.Peter  
*/

import java.util.Scanner;

public class SortNumber_Group7 {

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = input.nextInt();
        }

        selectionSort(arr);

        System.out.println("\nSorting Number of Array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " " );
        }
    }
}
