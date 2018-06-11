package co.uk.java8.examples;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
	private static ConsumerCalc cc = new ConsumerCalc();

	public static void main(String[] args) {
		// creating sample Collection
		List<Integer> myList = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++)
			myList.add(i);

		//myList.forEach(cc);
	}
}
