package uk.co.dev.java8.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Hello world!
 *
 */
public class App {
	private static int[] A = { 2, 4, 1, 7, 4, 8, 3, 8, 2, 6, 3, 8 };

	public static void main(String[] args) {
		IntStream intStream = Arrays.stream(A);
		intStream.forEach((x) -> System.out.println(x * 2));
		// Consumer<String> c = (x) -> System.out.println(x.toLowerCase());
		// c.accept("Java2s.com");
	}
}
