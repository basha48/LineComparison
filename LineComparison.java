public class LineComparison{


public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Wlecome to line copmarasion program");
		int x1 = 5;
		int x2 = 10;
		int x3 = 15;
		int x4 = 20;
		int y1 = 55;
		int y2 = 100;
		int y3 = 25;
		int y4 = 28;
		int Line_One = ((((x2 -x1)*(x2-x1))+((y2-y1)+(y2-y1))));
		int Line_Two = ((((x4 -x3)*(x4-x3))+((y4-y3)+(y4-y3))));
	
		System.out.println(Line_One); System.out.println(Line_Two); 
			if(Line_One>Line_Two){
		System.out.println("Line one is greater:" +Line_One);

		}
			else if(Line_Two>Line_One){

                                System.out.println("Line Two is greater:" +Line_Two);

                         }
                        else {
                                     System.out.println(" Both Lines are equal:");

			}

	}

}
