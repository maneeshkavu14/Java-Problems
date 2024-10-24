public class FindDuplicateArray{

	public static void main(String[] args) {

		int arr[]= {12,34,5};

		int n= arr.length;

		boolean result = duplicate(arr, n);

		System.out.println(result);

		
	}
	

	public static boolean duplicate(int []arr,int n) {
		
		// int duplicate=0;

		for(int i=0; i<n; i++){

			for(int j=i+1;j<n;j++){

				if(arr[i]==arr[j]){

					return true;

				}

			}

		}
		return false;
	}

}