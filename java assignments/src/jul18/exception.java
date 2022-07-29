package jul18;

public class exception {
	
		
		public static void main(String[] args){
			int num1,num2,num3;
			num1=20;
			num2=0;
			
			try{
			  num3 = num1/num2;
			  System.out.println("Result is "+num3);		  
			}	
			catch(NullPointerException ae){  // child
				System.out.println("Numbers cannot be divided by zero");
				System.out.println(ae.getMessage());

			}
			catch(Exception ae1) // parent
			{
				System.out.println("i am before the subclass exception");
			}
			finally
			{
				System.out.println(" this block will always executed");
			}
			
		num3=num1+num2;               // normal flow after catching exception
		System.out.println("Result after addition is "+num3);
		}
	}	

