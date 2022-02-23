package forr;

import java.util.Scanner;

public class stupin {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 1;
		for (int i = 2; i < n; i++){
			a *= n;
		}
	
	System.out.print(a);
	}
	


}
