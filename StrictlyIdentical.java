//import Scanner Utility
import java.util.Scanner;
//Create a class named Strictly Identical, and create two arrays. Use for loop to check similarities between arrays and not == because they are reference variables.
public class StrictlyIdentical {
	public static boolean equals(int arr1[], int arr2[]){
		for(int i=0;i<arr1.length;i++){
		if(arr1[i]!=arr2[i]){
		//Return false if they are not the same.
		return false;
		}
		}
		//Return true if they are strictly identical.
		return true;
		}
	
	//Create a new method to allow user to enter values into two different arrays each with 5 numbers.
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter 5 elements of the list 1 : ");
		//Store entered values into new arrays.
		int l1[] = new int[5];
		int l2[] = new int[5];
		for(int i=0;i<5;i++){
		l1[i] = obj.nextInt();
		}
		//Prompt user for entry for the second array.
		System.out.print("Enter 5 elements of the list 2 : ");
		for(int i=0;i<5;i++){
		l2[i] = obj.nextInt();
		}
		boolean ans = equals(l1,l2);
		if(ans){
		//print line if arrays are identical.
		System.out.println("Two lists are strictly identical");
		}
		//if not use else to print otherwise.
		else{
		System.out.println("Two list are not strictly identical");
		}

		
		//Sample run for List 1:1,2,3,4,5 and List 2: 1,2,3,4,5
		//Out put is "Two list are strictly identical"
	}

}
