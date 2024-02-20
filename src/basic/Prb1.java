//Addition of n numbers
package basic;

import java.util.Scanner;

public class Prb1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=sc.nextInt();
		int i=1, sum=0;
		while(i<=n) {
			sum=sum+i;
			i++;
		}
		System.out.println("Addition of 6"+n+" numbers :"+sum);
	}

}
