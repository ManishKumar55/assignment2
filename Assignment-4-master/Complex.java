class Complex
{
  int real;
  int  imaginary;
  public void getComplex(int r , int i)
  {
  	real= r;
  	imaginary=i;
  }
  public void Display()
  {
  	System.out.println("complex number= " + real + "+i" + imaginary);
  }
  public static void main(String[] args) {
  	Complex c = new Complex();
  	c.getComplex(4,5);
  	c.Display();
  }
}





























