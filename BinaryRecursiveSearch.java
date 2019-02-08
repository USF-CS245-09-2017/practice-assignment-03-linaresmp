public class BinaryRecursiveSearch implements Practice03Search{
	
	public int search(int[] arr, int target){
		return binsearch(arr, target, 0, arr.length -1);


	}
	public int binsearch(int[] arr, int target, int start, int end){
		if(start > end){
			return -1;
		}
		int mid = (start + end)/2;
		if(arr[mid] == target){
			return mid;
		}
		else if(target < arr[mid]){
			return binsearch(arr, target, start, mid -1);
		}
		else{
			return binsearch(arr, target, mid + 1, end);
		}
	}
	public String searchName(){
		return "Binary Recursive Search";
	}
}