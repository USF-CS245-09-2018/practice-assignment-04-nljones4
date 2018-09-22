public class SelectionSort implements SortingAlgorithm{

	public void sort(int [] a){
		for (int i = 0; i < a.length;i++){
			swap(i, find_min(i, a), a);
		}
	}
	
	public void swap(int b, int c, int [] a){
		int temp = a[b];
		a[b] = a[c];
		a[c] = temp;
	}
	
	public int find_min(int i, int [] a){
		int min = i;
		for(int k = i+1; k < a.length;k++){
			if(a[k] < a[min]){
				min = k;
			}
		}
		return min;
	}
}