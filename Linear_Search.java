package Lac_10_Arrays;

public class Linear_Search {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 7, 8,5};
        int item = 5;
        System.out.println(Search(arr, item));
    }
    public static int Search(int[] arr, int item){
        for (int i=0;i< arr.length;i++){
            if (arr[i]==item){
                return i;
            }
        }
        return -1;
    }
}
