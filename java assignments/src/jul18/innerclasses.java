package jul18;

public class innerclasses {

	static int salary = 1000;
	class PermEmployee{
		String code = "PE01";
		float hike = 0.45f;
		void new_salary(int salary){
			System.out.println("New salary = "+(salary+(salary * hike)));	
		}
		void display(){
			System.out.println("salary = "+salary+" "+"code = "+code+" "+"hike = "+hike);
		}
	}
	class TempEmployee{
		String code = "TE01";
		float hike = 0.30f;
		void new_salary(int salary){
			System.out.println("New salary = "+(salary+(salary * hike)));	
		}
		void display(){
			System.out.println("salary = "+salary+" "+"code = "+code+" "+"hike = "+hike);
		}
	}
	void role(){
		class ContractEmployee{
			String code = "CE01";
			float hike = 0.30f;
			void new_salary(int salary){
				System.out.println("New salary = "+(salary+(salary * hike)));	
			}
			void display(){
				System.out.println("salary = "+salary+" "+"code = "+code+" "+"hike = "+hike);
			}
		}
		ContractEmployee c = new ContractEmployee();
		c.new_salary(salary);
		c.display();
	}
	public static void main(String args[]){
		innerclasses e = new innerclasses();
		innerclasses.PermEmployee e1 = e.new PermEmployee(); 
		innerclasses.TempEmployee e2 = e.new TempEmployee(); 
		e.role();
		e1.new_salary(salary);
		e1.display();
		e2.new_salary(salary);
		e2.display();
		
	}
}