//Write a program to print the total number of one-D arrays in a two-D array and the number of elements in every one-D array present in the two-D arrays.
import java.util.Scanner;
class OneDTwoD{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int t, e; 
        System.out.print("Enter num of rows : ");
        t = scanner.nextInt(); 
        System.out.print("Enter num of col : ");
        e = scanner.nextInt(); 
        int counter=0;
        int[][] arr = new int[t][e]; 

        for (int i = 0; i < arr.length; i++) { 
            counter++;
            //e = scanner.nextInt(); 
            //arr[i] = new int[e]; 
            System.out.println("Enter elements of "+i+" row ");

            for (int j = 0; j < arr[i].length; j++) { 
                System.out.print("Enter element ");

                arr[i][j] = scanner.nextInt(); 
            } 
        } 
        System.out.println("======================================");

        System.out.println("Number of 1D array in 2D : "+counter);
        System.out.println("Array elements are as follows : ");


        for(int i=0; i < arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                System.out.print(arr[i][j]+" ");
            } 
            System.out.println("");
        }


    }
}