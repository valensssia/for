package forr;

import java.util.Scanner;

public class parni_chysla {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		for(int i = a; i <= b; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
			}
		

}
