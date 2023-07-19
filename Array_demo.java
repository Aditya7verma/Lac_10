package Lac_10_Arrays;

public class Array_demo {
    public static void main(String[] args) {
        int a=9;
        int arr[]= new int [3]; // 5 represents the size.
        System.out.println(a);
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println("*********************");
        System.out.println(arr[0]=10);
        System.out.println(arr[1]=20);
        System.out.println(arr[2]=30);
        System.out.println(arr[4]=30);

        int []other= arr;
    }
}
