import java.util.Arrays;

public class RemoveElementFromArray {

    public static void main(String[] args) {
        int arr[] = {5,12, 3, 12, 4, 4, 5}; 
        int number = 5;
        int n= arr.length;


        removeElement(arr, n, number);

        int []newArr = removeElement(arr, number,n);

        for (int i=0 ; i<newArr.length;i++){
        	System.out.println(newArr[i]);
        }

    }

    public static int[] removeElement(int[] arr, int n, int element) {
    	// int n = arr.length; 
        int count = 0;

        // finding the count
        for (int i = 0; i < n; i++) {
            if (arr[i] == element) {
                count++;
            }
        }

        //creating new array

        int[] newArr = new int[n - count];
        int j = 0;


        for (int i = 0; i < n; i++) {
            if (arr[i] != element) {
                newArr[j] = arr[i];
                j++;
            }
        }
        return newArr;

        //  for (int i = 0; i < newArr.length; i++) {
            
        //     System.out.println(newArr[i]);
        // }
    }
}
