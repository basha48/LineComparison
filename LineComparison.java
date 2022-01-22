

public class LineComparison{


public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Wlecome to line copmarasion program");
		int x1 = 5;
		int x2 = 10;
		int x3 = 5;
		int x4 = 2;
		int y1 = 5;
		int y2 = 10;
		int y3 = 5;
		int y4 = 2;
		int Line_One = ((((x2 -x1)*(x2-x1))+((y2-y1)+(y2-y1))));
		int Line_Two = ((((x4 -x3)*(x4-x3))+((y4-y3)+(y4-y3))));
		String Length_One = String.valueOf(Line_One);
		String Length_Two = String.valueOf(Line_Two);
		System.out.println(  "Length of first Line :"+Line_One);
		System.out.println( "Length of Second Line :" +Line_Two);
		System.out.println(Length_One.equals(Length_Two));
	}

}


