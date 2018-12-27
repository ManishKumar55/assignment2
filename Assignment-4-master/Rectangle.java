public class Rectangle
{
	int length , breadth;
	public void getArea(int l , int b)
	{
		length=l;
		breadth=b;
	}
	public void CalculateArea()
	{
		System.out.println("area of rectangle is = " + (length*breadth));
	}
	public static void main(String[] args)
	{
	Rectangle r = new Rectangle();
	r.getArea(9,4);
	r.CalculateArea();
	}
}
