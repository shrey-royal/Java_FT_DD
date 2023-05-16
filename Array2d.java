public class Array2d {

	public static void main(String[] args) {
		//int arr[][] = new int[3][3];
		
		int arr[][] = { {1, 2, 3}, 
					{4, 5, 6}, 
					{7, 8, 9} };
					
		System.out.println("\nPrint Array: ");
		for(int[] i : arr) {
			for(int j : i) {
				System.out.print(j + ", ");
			}
			System.out.println("");
		}
		
		for(int i=0; i<arr.length; i++) {	//rows
			for(int j=0; j<arr[i].length-1; j++) {	//cols
				for(int k=0; k<arr[i].length-j-1; k++) {	//compare elements
					if(arr[i][k] < arr[i][k+1]) {
						int temp = arr[i][k];
						arr[i][k] = arr[i][k+1];
						arr[i][k+1] = temp;
					}
				}
			}
		}
		
		System.out.println("\nAfter Sorting: ");
		for(int[] i : arr) {
			for(int j : i) {
				System.out.print(j + ", ");
			}
			System.out.println("");
		}
	}
}
/*
declaration: 
	int arr[][] = new int[row_size][col_size];
	int[] []arr = new int[row_size][col_size];
	int[][] arr = new int[row_size][col_size];
	int [][]arr = new int[row_size][col_size];
	int[] arr[] = new int[row_size][col_size];
	int []arr[] = new int[row_size][col_size];
	
	
	


*/