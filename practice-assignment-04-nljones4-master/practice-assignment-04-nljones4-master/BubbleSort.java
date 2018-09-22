public class BubbleSort implements SortingAlgorithm{
	
	public void sort (int[] a){
		for (int k = 0; k<a.length-1; k++){
			for (int i = 0; i < a.length-1; i++){
				if (a[i] > a[i+1]){
					swap(i, i+1, a);
				}
			}
		}
	}
	public void swap(int b, int c, int[] a){
		int temp= a[b];
		a[b] = a[c];
		a[c] = temp;
	}
	
}