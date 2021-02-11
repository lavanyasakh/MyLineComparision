import java.util.*;
public class LineComp {
	private final int x1;
	private final int x2;
	private final int y1;
	private final int y2;
	private final int x3;
	private final int x4;
	private final int y3;
	private final int y4;

	public LineComp(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		this.x3 = x3;
		this.x4 = x4;
		this.y3 = y3;
		this.y4 = y4;
	}

	public static void main(String[] args) {
		LineComp line1 = new LineComp(25, 45, 67, 89, 34, 56, 26, 48);
		System.out.println("Entered x1 and Y1 values of First point");
		System.out.println("Entered X2 and Y2 of Second Point");
		int x = line1.x2 - line1.x1;
		int y = line1.y2 - line1.y1;
		double sum = Math.pow(x, 2) + Math.pow(y,2);
		double length = Math.sqrt(sum);
		System.out.println("The Length of The Line is =" + length);


		System.out.println("Entered X3 And Y3 Values Of Second Line");
		System.out.println("Entered X4 And Y4 Values of Second Line");
		int x11 = line1.x4 - line1.x3;
		int y11 = line1.y4 - line1.y3;
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
