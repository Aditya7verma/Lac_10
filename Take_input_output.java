package Lac_10_Arrays;

import java.util.Scanner;

public class Take_input_output {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();  // Create arr of size n
        int arr[]= new int[n];
        // Input
        for (int i=0; i< arr.length; i++){
            arr[i]= sc.nextInt();
        }
        Display(arr);  // Output
    }
    public static void Display(int[] arr){
        for (int i=0; i< arr.length; i++) {
            System.out.print( arr[i] + " ");
        }
        System.out.println();
    }
}
