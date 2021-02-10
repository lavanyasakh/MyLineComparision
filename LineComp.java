import java.util.*;
public class LineComp {

	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		System.out.println("Enter x1 and Y1 values of First point");
		int x1 = data.nextInt();
		int y1 = data.nextInt();
		System.out.println("Enter X2 and Y2 of Second Point");
		int x2 = data.nextInt();
		int y2 = data.nextInt();
		int x = x2 - x1;
		int y = y2 - y1;
		double sum = Math.pow(x, 2) + Math.pow(y,2);
		double length = Math.sqrt(sum);
		System.out.println("The Length of The Line is =" + length);
	}
}
