//read data using scanner
package basic;

import java.util.Scanner;

public class ScanData {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name:");
		String nm=sc.next();
		System.out.println("Enter Age:");
		int age=sc.nextInt();
		System.out.println("Enter Profession:");
		String pf=sc.next();
		
		System.out.println("| Name | Age | Profession |");
		System.out.println("| "+nm+" | "+age+" | "+pf+" |");
	}

}
