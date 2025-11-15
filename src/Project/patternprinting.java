package Project;

import java.util.Scanner;

public class patternprinting {
	public static void main(String[] args) {
		
	
	Scanner s = new Scanner(System.in);
	int num = s.nextInt();
	for(int i = 0;i<=num;i++) {
		for(int j = 1;j<=i;j++) {
			System.out.print("⭐");
		}
		System.out.println();
	}
	
	

}}
