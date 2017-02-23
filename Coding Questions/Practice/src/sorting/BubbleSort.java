package sorting;

public class BubbleSort {

	public static void main(String[]arg){
		int[] arr= new int[5];
		arr[0]=1;arr[1]=5;arr[2]=3;arr[3]=10;arr[4]=0;
		arr=bubbleSort(arr);
		for (int arr1:arr)
		System.out.println(arr1);
	}
	
	public static int[] bubbleSort(int[]arr){
		for(int i=0;i< arr.length-1;i++){
			for(int j=0;j<arr.length-1;j++){
				if(arr[j]<arr[j+1]){
				int n= arr[j];
				arr[j]= arr[j+1];
				arr[j+1]=n;
				}
			}
		}
		return arr;
	}
	
}
