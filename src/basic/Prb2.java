//Accept no. and print factorial
package basic;
import java.util.*;

public class Prb2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int fact=1;
		if(num==0 || num==1) {
			System.out.println("Factorial: 1");
		}
		else {
			while(num>=1) {
//				int fact=fact*num;
				fact=fact*num;
				num--;
			}
			System.out.println("Factorial:"+fact);
		}

	}

}
