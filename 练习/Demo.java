public class Demo{
	public static void main(String ages[]){
		int[] arr = {6,9};
		System.out.println("ǰ,��һ��"+ arr[0]+",�ڶ���"+ arr[1]);
		swap(arr,0,1);
		System.out.println("main,��һ��="+arr[0]+",�ڶ���="+arr[1]);
		}
		private static void swap(int[] arr,int a,int b){
			int temp = arr[a];
			arr[a] = arr[b];
			arr[b] = temp;
			System.out.println("swap,��һ��="+arr[0]+",�ڶ���="+ arr[1]);
	}
}