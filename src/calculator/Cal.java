package calculator;
import java.util.Scanner;

public class Cal {
	

	public static void main(String[] args) {
		
		int n1,n2,n3,ch;
		Scanner input= new Scanner(System.in);		
		System.out.println("Enter First Number(Interger No only) : ");
		n1= input.nextInt();
		System.out.println("Enter Second Number(Integer No only) : ");
		n2=input.nextInt();
		System.out.println("Choices Are");
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multiple");
		System.out.println("4.Divide");
		System.out.println("5.Find Square Root");
		System.out.println("6.percentage");
		ch=input.nextInt();
		switch(ch)
		{
		case 1:
			n3=n1+n2;
			System.out.println("Addition = " +n3);
			break;
		case 2:
			n3=n1-n2;
			System.out.println("Substraction = " +n3);
			break;
		case 3:
			n3=n1*n2;
			System.out.println("Multiplication = " +n3);
			break;
		case 4:
			n3=n1/n2;
			System.out.println("Divide = " +n3);
			break;
			
		case 5:
			
			System.out.println("Square root of no 1 = " +Math.sqrt(n1));
			System.out.println("Square root of no 2 = " +Math.sqrt(n2));
			break;
			
		case 6:
			n3=(n1+n2)*100/200;
			System.out.println("Percentage out of 200 = " +n3);
			break;
		default:
			System.out.println("Invalid No");
			break;
		}
		
		

	}

}
