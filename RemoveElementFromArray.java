import java.util.Arrays;

public class RemoveElementFromArray {

    public static void main(String[] args) {
        int arr[] = {12, 3, 4, 4, 5, 7, 4}; 
        int number = 4;


        int[] newArr = removeElement(arr, number);
        for (int i=0 ; i<newArr.length;i++){
        	System.out.println(newArr[i]);
        }

    }

    public static int[] removeElement(int[] arr, int element) {
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

        return newArr; 
    }
}
