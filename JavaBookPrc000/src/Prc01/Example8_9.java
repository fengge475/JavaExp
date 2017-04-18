package Prc01;

import java.util.Scanner;

public class Example8_9 {

	public static void main(String[] args) {
		String regex = "[a-zA-X]+";
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
			System.out.println(str.replaceAll(regex, "您好"));
		scanner.close();
	}

}
