package epam.HTJava8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfListElements {

	public static void main(String[] args) {
		int n, j;
		List<Integer> list = new ArrayList();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of elements : ");
		n = scanner.nextInt();
		System.out.print("Enter " + n + " elements  : ");
		for(j = 0; j < n; j++) {
			list.add(scanner.nextInt());
		}
		System.out.println("Average of the values entered is = " + list.stream().mapToInt(i->i)
																				.average()
																				.getAsDouble());

	}
	

}
