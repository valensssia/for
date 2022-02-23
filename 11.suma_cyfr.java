package forr;

import java.util.Scanner;

public class suma_cyfr {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int s = 0;
		for (int i = 0; x != 0; i++) {
			s = s + (x % 10);
			x /= 10;
	}
	
	System.out.println(s);
	}


}
