package sorting;

public class SelectionSort {

	public static void main(String[]arg){
		int[] arr= new int[5];
		arr[0]=1;arr[1]=5;arr[2]=3;arr[3]=10;arr[4]=0;
		arr=selectionSort(arr);
		for (int arr1:arr)
		System.out.println(arr1);
	}
	
	public static int[] selectionSort(int[]arr){
		for(int i=0;i< arr.length;i++){
			for(int j=i;j<arr.length;j++){
				if(arr[i]>arr[j]){
				int n= arr[j];
				arr[j]= arr[i];
				arr[i]=n;
				}
			}
		}
		return arr;
	}
	
}
