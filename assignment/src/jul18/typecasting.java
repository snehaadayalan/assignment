package jul18;

public class typecasting {
	public static void main(String[] args) 
   
	{
		float f=78.9f;
		long l=(long)f;
		
		long l2=9875456;
		byte b=(byte) l2;
		
		double d=88896456.9753456;
		long l4=(long) d;
		int x1=(int) l4;
		char ch=(char) x1;
		
		
		int x=7;
		double d1=(double) x;
		long l3=(long) d1;
		
		
		System.out.println("Actual float value"+" "+ f);
		System.out.println("After convert float value to long"+" "+ l);
		
		System.out.println("Actual long value"+" "+ l2);
		System.out.println("After convert long value to byte"+" "+ b);
		
		System.out.println("Actual double value"+" "+ d);
		System.out.println("After convert double value to long"+" "+ l4);
		System.out.println("Actual long value to int"+" "+ x1);
		System.out.println("After convert int value to char"+" "+ ch);
		
		System.out.println("Actual int value"+" "+x);
		System.out.println("After int value to double"+" "+ d);
		System.out.println("After double value to long"+" "+ l3);
			
		
	}
} 



