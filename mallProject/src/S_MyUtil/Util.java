package S_MyUtil;

import java.util.Scanner;

public class Util {
	static public  Scanner scan = new Scanner(System.in);
	
	public String getValue(String msg) {
		System.out.println(msg+">>");
		String value = scan.next();
		return value;
	}
}
