import java.util.Arrays;
public class Demo2{
	public static void main(String args []){
	int [] arr={13,11,1,2,3,55,67,7,8,9,10,22,133,99,36};
	for(int i = 0; i<arr.length;i++){
		System.out.print(arr[i]+","+"\t");
	}
	Arrays.sort(arr);
	for(int i = 0; i<arr.length;i++){
		System.out.print(arr[i]+","+"\t");
	}
	System.out.print(Arrays.binarySearch(arr,2)+"\n");
	Arrays.fill(arr,2);
	System.out.print(arr+","+"\n");
	int [] a = {1,2,3,4,6,5};
	Arrays.sort(a);
	int [] b = {6,3,2,5,4,1};
	System.out.print(Arrays.equals(a,b)+"\n");
	}
}