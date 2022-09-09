package sortings;

public class Mergesort {

	void mainmerge(int arr[], int start, int middle, int end) {

		//System.out.println("L = " + p + "  m= " + q + "  r= " + r);
		int first = middle - start+ 1;
		int second= end - middle;
		//System.out.println("n1= " + n1 + "  n2= " + n2);
		int L[] = new int[first];
		int M[] = new int[second];

		for (int i = 0; i < first; i++) {
			L[i] = arr[start + i];
			//System.out.println("L = " + L[i]);
		}
		for (int j = 0; j < second; j++) {
			M[j] = arr[middle + 1 + j];
			//System.out.println("m = " + M[j]);
		}
		int i=0, j=0,k = start;

		while (i < first && j < second) {
			if (L[i] <= M[j]) {
				arr[k] = L[i];
				System.out.println("");
				i++;
			} else {
				arr[k] = M[j];
				j++;
			}
			k++;
		}

		while (i < first) {
			arr[k] = L[i];
			i++;
			k++;
		}

		while (j < second) {
			arr[k] = M[j];
			j++;
			k++;
		}
	}

	void sort(int arr[], int start, int end) {

		if (start < end) {

			int middle = (start + end) / 2;

			sort(arr, start, middle);

			sort(arr, middle + 1, end);

			mainmerge(arr, start, middle, end);
		}
	}


	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}


	public static void main(String args[]) {
		int arr[] = { 6, 5, 12, 10, 9, 1 };

	

		Mergesort ob = new Mergesort();
		ob.sort(arr, 0, arr.length - 1);

		System.out.println("Sorted array:");
		printArray(arr);
	}
}
