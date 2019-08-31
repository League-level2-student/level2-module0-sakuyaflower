package arrays;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] ppl = {"Anya", "Jack", "Oliver", "Kevin", "Lily"};
		//2. print the third element in the array
		System.out.println(ppl[3]);
		//3. set the third element to a different value
		ppl[3] = "Potatoe";
		//4. print the third element again
		System.out.println(ppl[3]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i < ppl.length; i++) {
			System.out.println(ppl[i]);
		}
		//6. make an array of 50 integers
		 int[] bob = new int[51];
		//7. use a for loop to make every value of the integer array a random number
		for(int i = 0; i < bob.length; i++) {
			bob[i] = 51;
		}
		//8. without printing the entire array, print only the smallest number in the array
		System.out.println(bob[0]);
		int s = 0;
		for(int i = 0; i < bob.length; i++) {
			if(i == 0) {
				s = bob[0];
			}
			else if(s > bob[i]) {
				s = bob[i];
				
			}
		System.out.println(bob[i]);
		}
		System.out.println(s);
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
		
	}
}

