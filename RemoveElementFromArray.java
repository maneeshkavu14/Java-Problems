import java.util.Arrays;

public class RemoveElementFromArray {

    public static void main(String[] args) {
        int arr[] = {5,12, 3, 12, 4, 4, 5}; 
        int number = 5;


        removeElement(arr, number);

        // int newArr = removeElement(arr, number);

        // for (int i=0 ; i<arr.length;i++){
        // 	System.out.println(newArr[i]);
        // }

    }

    public static void removeElement(int[] arr, int element) {
    	int n = arr.length; 
        int count = 0;

        // finding the count
        for (int i = 0; i < n; i++) {
            if (arr[i] == element) {
                count++;
            }
        }

        int[] newArr = new int[n - count];
        int j = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != element) {
                newArr[j] = arr[i];
                j++;
            }
        }

         for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
}
