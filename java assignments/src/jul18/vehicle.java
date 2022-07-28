package jul18;
abstract class parent{
	int speed=111;
	long distance=50;
	parent(){
		System.out.println(" Default parent constructor");
		
	}
	parent(int b,String c){
		System.out.println(" Parameterized parent constructor");
		
	}
	abstract void run();
	abstract void stop();
	public void fuel(int a){
		System.out.println(a);
	}
	public void fuel(float b,String c){
		System.out.println(b+" "+c);
		
		}
	public void fuel(char S, int d){
		System.out.println(S+" "+d);
		
		
	}
	
		
	}

public class vehicle extends parent {

	vehicle(){
		System.out.println("Child Default constructor");
	}
	int speed=4;
	long distance=3864;
	int no_tyre=2;
	void display(){
		System.out.println(speed+" "+ distance+" "+no_tyre+" "+super.speed+" "+super.distance);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vehicle d=new vehicle();
d.display();
 d.fuel(5);
 d.fuel(8.0f,"xxxx");
 d.fuel('M',3);
//parent s=new vehicle();
 
 //s.parent(4,"Hii");
	}

	
	@Override
	void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		
	}

}