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

		System.out.println("Enter X3 And Y3 Values Of Second Line");
		int x3 = data.nextInt();
		int y3 = data.nextInt();
		System.out.println("Enter X4 And Y4 Values of Second Line");
		int x4 = data.nextInt();
		int y4 = data.nextInt();
		int x11 = x4 - x3;
		int y11 = y4 - y3;
		double sum1 = Math.pow(x11, 2) + Math.pow(y11, 2);
		double length1 = Math.sqrt(sum1);
		System.out.println("The Length of Line is =" + length1);
		if (length == length1)
		{ 
			System.out.println("The Lines Are Equal");
		}
		else if (length < length1) 
		{
			System.out.println("The Line1 is less than Line2");
		}
		else if (length > length1)
		{
			System.out.println("The Line1 is greater than Line2");
		}

	}
}
