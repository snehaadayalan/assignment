package jul18;

public class Constructorshape {

	int x;
	float y;
	double z,t,r;
	Constructorshape(){
		
	}
	Constructorshape(int s){
		x=(s*s);
	}
	Constructorshape(float l, float b){
		
		y=(l*b);
		
	}
	Constructorshape(double r){
		z=(3.14*r*r);
	}
	void displaySquare(){
		System.out.println("area of square is " +x);
	}
	void displayRect(){
		System.out.println("area of rectangle is " +y);
	}
	void displayCircle(){
		System.out.println("area of circle is " +z);
	}
	void area(float k, float l){
		t=(0.5*k*l);
		System.out.println("area of triangle is " +t);
	} 
	void area(double d1, double d2){
		r=(0.5*d1*d2);
		System.out.println("area of rhombus is " +r);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructorshape s1=new Constructorshape(20);
		Constructorshape s2=new Constructorshape(7,8);
		Constructorshape s3=new Constructorshape(6.5);
		Constructorshape s4=new Constructorshape();
		Constructorshape s5=new Constructorshape();
		s1.displaySquare();
		s2.displayRect();
		s3.displayCircle();
		s4.area(21.5,10.2);
		s5.area(21,10);
		
	}

}
