import java.util.*;
public class LineComp {

	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		System.out.println("Enter x1 and Y1 values of First point");
		int X1 = data.nextInt();
		int Y1 = data.nextInt();
		System.out.println("Enter X2 and Y2 of Second Point");
		int X2 = data.nextInt();
		int Y2 = data.nextInt();
		int X = X2 - X1;
		int Y = Y2 - Y1;
		double A = Math.pow(X, 2) + Math.pow(Y,2);
		double S = Math.sqrt(A);
		System.out.println("The Length of The Line is =" + S);

		System.out.println("Enter X3 And Y3 Values Of Second Line");
		int X3 = data.nextInt();
		int Y3 = data.nextInt();
		System.out.println("Enter X4 And Y4 Values of Second Line");
		int X4 = data.nextInt();
		int Y4 = data.nextInt();
		int X11 = X4 - X3;
		int Y11 = Y4 - Y3;
		double A1 = Math.pow(X11, 2) + Math.pow(Y11, 2);
		double S1 = Math.sqrt(A1);
		System.out.println("The Length of Line is =" + S1);
		if (S == S1)
		{ 
			System.out.println("The Lines Are Equal");
		}
		else if (S < S1) 
		{
			System.out.println("The Line1 is less than Line2");
		}
		else if (S > S1)
		{
			System.out.println("The Line1 is greater than Line2");
		}
		else if (S1 < S)
		{
			System.out.println("The Line2 is less than Line1");
		}
		else if (S1 > S)
		{
			System.out.println("The Line2 is greater than Line1 ");
		}


      

	}
}
