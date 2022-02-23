package forr;

import java.util.Scanner;

public class stuupin {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int n = sc.nextInt();
		for (int i = 1; i < n; i++){
			a *= n;
		}
	
	System.out.print(a);
	}
	


}
