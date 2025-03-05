package style1_programming;
class RectangleMainClass 
{
	public static void main(String[] args) 
	{
	   Rectangle r1 = new Rectangle();
	   Rectangle r2 = new Rectangle();
	   r1.l=8;
	   r1.w=5;
	   r2.l=10;
	   r2.w=12;
	   int area1= r1.l*r1.w;
	   int area2= r2.l*r2.w;
	   double a1=(area1)/100.0;
	   double a2=(area2)/100.0;
	   System.out.println("--------------------------------Rectangle 1 Details--------------------------------------------");
	   System.out.println("color : "+ Rectangle.color);
	   System.out.println("length : "+ r1.l+ "mm");
	   System.out.println("Width : "+ r1.w + " mm");
	   System.out.println("Area : "+ area1 +" mm�");
	   System.out.println("Area in cm�: "+ a1 +"cm�");

	   System.out.println("--------------------------------Rectangle 2 Details--------------------------------------------");
	   System.out.println("color : "+ Rectangle.color);
	   System.out.println("length : "+ r2.l+ "mm");
	   System.out.println("Width : "+ r2.w + " mm");
	   System.out.println("Area : "+ area2 +" mm�");
	   System.out.println("Area in cm�: "+ a2 +"cm�");



	}
}
