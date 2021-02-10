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
	}
}
