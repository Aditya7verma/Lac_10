package Lac_10_Arrays;

public class Swap_Array_1 {
    public static void main(String[] args) {
        int [] arr={10,23,42,21,50}; //Hard code
        System.out.println(arr[0] + " " + arr[1]);
        swap(arr[0], arr[1]);
        System.out.println(arr[0] + " " + arr[1]);

    }
    public static void swap(int a, int b){
        int temp = a;
        a=b;
        b= temp;
    }

}
