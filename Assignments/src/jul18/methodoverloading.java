package jul18;

public class methodoverloading {
		
		public int Calculate(int b, int h)
	    {
	         System.out.println("add two numbers: "+(b+h));
				return(b+h);

	         
	    }
	    
		public float Calculate(float m) 
	    {
	         System.out.println("Area of Circle : "+(3.14*m*m));
	 	
				return(m*m);

	    }
		
		public int calculate(int e,int w)
		{
			System.out.println("area of rectangle "+(e*w));
			return(e*w);

		}
		
		public int Calculate(int l)
		{
			System.out.println("area of square "+(l*l));
	    	return(l*l);
		}

	    public static void main(String args[])
	    {
	      methodoverloading ob=new methodoverloading();
	     
	      ob.Calculate(5.8f);  
	      ob.calculate(6,7);  
	      ob.Calculate(4,2);
	      ob.Calculate(9);
	    }
	}


