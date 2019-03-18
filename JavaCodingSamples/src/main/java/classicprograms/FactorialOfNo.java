package classicprograms;

import java.util.Scanner;

public class FactorialOfNo {

	public static void main(String[] args) {
		System.out.println("Enter No:");
		
		int num= new Scanner(System.in).nextInt();
		int result = 1;
		while(num!=0){
			result = result * num;
			num--;
		}
		System.out.println(result);
	}

}
