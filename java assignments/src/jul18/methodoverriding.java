package jul18;

class shape1{
	public void area(int a,int b)
	{
		
	}
	
}

class triangle extends shape1{
	public void area(int a, int b)
	{
		System.out.println("\nArea Of Triangle is "+(0.5*a*b));
	}
}

class rectangle extends shape1{
	public void area(int a, int b)
	{
		System.out.println("\nArea of Rectangle is "+(a*b));
	}
}

class square extends shape1{
	public void area(int a, int b)
	{
		System.out.println("\nArea of Square is "+(a*b));
	}
}

class rhombus extends shape1{
	public void area(int d1, int d2)
	{
		System.out.println("\nArea of Rhombus is "+(0.5*d1*d2));
	
	}
}


public class methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape1 s;
		
		s=new triangle();
		s.area(6,6);
		
		s=new rectangle();
		s.area(4, 4);
		
		s=new square();
		s.area(5,5);
		
		s=new rhombus();
		s.area(7, 7);
		
		
	}

}