package Lac_10_Arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 7, 8,5};
        System.out.println(max(arr));
    }
    public static int max(int[] arr){
      int max = arr[0];
        for (int i=0;i< arr.length;i++) {
        if (max < arr[i]){
            max = arr[i];
        }
        }
    return max;
    }
}
