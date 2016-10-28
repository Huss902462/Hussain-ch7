package homework;

import java.util.Scanner;



public class ch77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
			Scanner input = new Scanner(System.in);
			
			// Create an array of length 10
			double[] numbers = new double[10]; 

			//Ask the user to enter numbers
			System.out.print("Enter ten numbers: ");
			for (int i = 0; i < numbers.length ; i++)
				numbers[i] = input.nextDouble();

			// selectionSort
			selectionSort(numbers);

			// Display the sorted numbers
			for (double e: numbers) 
				System.out.print(e + " ");
			System.out.println();
		}

		/** selsctionSort sorts array in accending order */
		public static void selectionSort(double[] list) {
			for (int i = list.length - 1; i >= 0; i--) {
				// Find the maximum in the list[i+1...list.length]
				double currentMax = list[i];
				int currentMaxIndex = i;

				for (int j = i - 1; j >= 0; j--) {
					if (currentMax < list[j]) {
						currentMax = list[j];
						currentMaxIndex = j;
					}
				}

				// Swap lists
				if (currentMaxIndex != i) {
					list[currentMaxIndex] = list[i];
					list[i] = currentMax;
				}
			}
		}
	}