package epam.HTJava8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class StringPallindrome {

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
		mylist = pallin(mylist);
		System.out.println("Strings that are pallindrome are : ");
        for(String i : mylist)
            System.out.println(i);

	}
	static List<String> pallin(List<String> mylist)
    {
        List<String> list2=new ArrayList<String>();
           for(String i: mylist)
           {String t = i.replaceAll("\\s+", "").toLowerCase();
            if( IntStream.range(0,t.length()/2).noneMatch(j -> t.charAt(j)!= t.charAt(t.length()-j-1)))
                list2.add(i);}
            return list2;
    }

}
