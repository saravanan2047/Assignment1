package assignment11.sort;

public class MainApp {

	public static void main(String[] args) 
	{
		System.out.println("Bubble Sort");
		int []arr= {7,6,99,3,2,1,5};
		BubbleSort bs= new BubbleSort();
		int res[]=bs.sort(arr);
		for(int i:res) {
			System.out.print(i+" ");
		}
		
		System.out.println("\nMerge sort:\n");
		MergeSort ms= new MergeSort();
		int res1[]=ms.sort(arr);
		for(int i:res1) {
			System.out.print(i+" ");
		}
		
		System.out.println("\nQuick Sort:\n");
		QuickSort qs= new QuickSort();
		int res2[]=qs.sort(arr);
		for(int i:res2) {
			System.out.print(i+" ");
		}

	}

}
