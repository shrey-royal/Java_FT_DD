import java.util.Scanner;
import java.util.Random;

class ArrayOP{

	public static void displayArray(int arr[]) {
		for(int i:arr){
			System.out.print(i + ", ");
		}
	}
	
	//Updation: Modify an element at a given position
	public int[] updateArray(int arr[], int position, int value) {
		position--;
		
		arr[position] = value;
		
		return arr;
	}
	
	//Deletion: Delete an element at a given position
	public int[] deleteArrayElement(int arr[], int position, int size) {
		position--;
		
		for(int i = position; i<size-1; i++) {
			arr[i] = arr[i+1];
		}
		arr[size-1] = '\0';
		
		return arr;
	}
	
	//Searching: Search an element in an array
	public boolean searchArray(int arr[], int key) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == key) {
				return true;
			}
		}
		return false;
	}
	
	//Sorting: Sort an array
	public int[] SortArray(int arr[]) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	
	//Merging: Merge two arrays
	public int[] MergeArray(int a1[], int a2[]) {
		int size = a1.length + a2.length, count=0;
		int	res[] = new int[size];
		
		count=0;
		for(int i=0; i<a1.length; i++, count++) {
			res[count] = a1[i];
		}
		for(int i=0; i<a2.length; i++, count++) {
			res[count] = a2[i];
		}
		
		return res;
	}
	
	//Union: Union of two arrays
	
	public void unionArray(int a1[], int a2[]) {
		int size = a1.length+a2.length, n1 = a1.length;
		int res[] = new int[size];
		
		for(int i=0; i<a1.length; i++) {
			res[i] = a1[i];
		}
		
		for(int i=0; i<a2.length; i++) {
			int flag = 0;
			for(int j=0; j<a1.length; j++) {
				if(a2[i] == a1[j]) {
					flag = 1;
					break;
				}
			}
			if(flag == 0) {
				res[n1] = a2[i];
				n1++;
			}
		}
		
		System.out.print("\nUnion Array: ");
		for(int i=0; i<n1; i++){
			System.out.print(res[i] + ", ");
		}
		
		//return res;
	}
	
	public void intersectionArray(int a1[], int a2[]) {
		int n1 = a1.length, count=0;
		int res[] = new int[n1];
		
		for(int i=0; i<a1.length; i++) {
			int flag = 0;
			for(int j=0; j<a2.length; j++) {
				if(a1[i] == a2[j]) {
					flag = 1;
					break;
				}
			}
			if(flag == 1) {
				res[count] = a1[i];
				//System.out.println(res[count] + "\n");
				count++;
			}
		}
		
		
		System.out.print("\nIntersection Array: ");
		for(int i=0; i<count; i++) {
			System.out.print(res[i] + ", ");
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		ArrayOP obj = new ArrayOP();
		
		/*
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		int[] arr1 = new int[size];
		
		//generating random array
		for(int i=0; i<size; i++) {
			arr[i] = random.nextInt(100);
			arr1[i] = random.nextInt(100);
		}
		
		
		System.out.print("\nOriginal Array: ");
		displayArray(arr);	
		*/
		
		/*
		System.out.print("\nEnter position and value to update in the array: ");
		int position = sc.nextInt();
		int value = sc.nextInt();
		
		System.out.print("\nUpdated Array: ");
		displayArray(obj.updateArray(arr, position, value));
		*/
		
		/*
		System.out.print("\nEnter the position of the element to be deleted: ");
		int position = sc.nextInt();
		
		System.out.print("\nArray after deleting "+arr[position-1]+": ");
		displayArray(obj.deleteArrayElement(arr, position, size));
		*/
		/*
		System.out.print("\nEnter the element to search: ");
		int key = sc.nextInt();
		
		System.out.println(obj.searchArray(arr, key));
		*/
		
		/*
		System.out.print("\n\nSorted Array: ");
		for(int i:obj.SortArray(arr)) {
			System.out.print(i + ", ");
		}
		*/
		/*
		System.out.print("\nOriginal Array1: ");
		displayArray(arr1);
		System.out.print("\n\nMerged Array: ");
		for(int i:obj.MergeArray(arr, arr1)) {
			System.out.print(i + ", ");
		}
		*/
		
		//Union & Intersection
		int []a1 = {1, 2, 3, 4, 5};
		int[] a2 = {3, 4, 5, 6, 7};
		/*
		System.out.print("\nUnion Array: ");
		for(int i:obj.unionArray(a1, a2)){
			System.out.print(i + ", ");
		}
		*/
		//obj.unionArray(a1, a2);
		
		obj.intersectionArray(a1, a2);
		
		
	}
}

/*
Array Operations:
1. Insertion: Insert an element at a given position
2. Deletion: Delete an element at a given position
3. Searching: Search an element in an array
4. Sorting: Sort an array
5. Merging: Merge two arrays
6. Reversing: Reverse an array
7. Copying: Copy an array
8. Splitting: Split an array into two arrays
9. Union: Union of two arrays
10. Intersection: Intersection of two arrays
11. Exit
*/