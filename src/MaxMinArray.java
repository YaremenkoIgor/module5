
public class MaxMinArray {

    public static  int minArray(Integer[] arr){

        int min = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (min >arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    public static int maxArray(Integer[] arr){

        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }

        return max;
    }


}
