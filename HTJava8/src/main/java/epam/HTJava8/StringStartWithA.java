package epam.HTJava8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringStartWithA {

	public static void main(String[] args) {
		int n, j;
		List<String> mylist = new ArrayList();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of elements : ");
		n = scanner.nextInt();
		System.out.println("Enter " + n + " elements  : ");
		for(j = 0; j < n; j++) {
			mylist.add(scanner.next());
		}
		mylist=search(mylist);
		System.out.println("Strings that start with 'a' and have 3 characters are : ");
        for(String i : mylist)
            System.out.println(i);
	}
	static List<String> search(List<String> mylist)
    {
        return mylist.stream().filter(s -> s.startsWith("a")).filter(s -> s.length()==3).collect(Collectors.toList());
    }

}
