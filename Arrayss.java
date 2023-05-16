import java.util.Scanner;

public class Arrayss{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of the array: ");
		int size = sc.nextInt();
		
		int []numbers = new int[size];
		
		for(int i=0; i<numbers.length; i++){
			System.out.println("Enter numbers["+i+"]: ");
			numbers[i] = sc.nextInt();
		}
		
		//advanced for loop / for each loop
		for(int i:numbers) {
			System.out.println("i = " + i);
		}
		
		
	}
	
	
}
/*
Array is a type of collection where data of same type can be stored using one variable.

declaration:

datatype array_name[] = new datatype[size];
datatype []array_name = new datatype[size];
datatype[] array_name = new datatype[size];

initialization:

array_name[] = "asusgfnj";
array_name[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

usage:

array_name[8]

array_name.length();	//return length of the array


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