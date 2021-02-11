import java.util.*;
public class LineComp {
	private final double x1;
	private final double x2;
	private final double y1;
	private final double y2;

	public LineComp(double x1, double y1, double x2, double y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}

	public double calSqrtOfCor() {
		double result = Math.sqrt(Math.pow((this.x2 - this.x1),2) + Math.pow((this.y2 - this.y1),2));
		return result;
	}

	public static void compareTo(double line1Length, double line2Length) 
	{
		System.out.println("The Length Of Line1: " +line1Length);
		System.out.println("The Length Of Line2: " +line2Length);
		if (line1Length == line2Length)
			System.out.println("The Lines Are Equal");
		else if (line1Length < line2Length) 
			System.out.println("The Line1 is less than Line2");
		else 
			System.out.println("The Line1 is greater than Line2");
	}

	public static void main(String[] args)
	{
		LineComp line1 = new LineComp(3.2, 4.2, 5.2, 6.3);
		LineComp line2 = new LineComp(6.2, 8.2, 4.3, 7.2);
		double line1Length = line1.calSqrtOfCor();
		double line2Length = line2.calSqrtOfCor();
		compareTo(line1Length, line2Length);
	}
}
