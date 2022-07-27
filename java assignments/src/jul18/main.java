package jul18;

class product{
	int id=78;
	String name="Amul";
	
	void display()
	{
		System.out.println("\nProduct Id is"+" "+id);
		System.out.println("\nProduct name"+" "+name);
	}
	
}
class A extends product{
	int count=50;
	String category="butter";
	
	void display()
	{
		System.out.println("\nProduct Id is"+" "+id);
		System.out.println("\nProduct name"+" "+name);
		System.out.println("\nCount: "+count);
		System.out.println("\nCategory: "+category);
	}
}

class B extends product{
	int count=90;
	String category="Milk";
	
	void display()
	{
		System.out.println("\nProduct Id is"+" "+id);
		System.out.println("\nProduct name"+" "+name);
		System.out.println("\nCount: "+count);
		System.out.println("\nCategory: "+category);
	}
}

class c extends product{
	int count=56;
	String category="choco";
	
	void display()
	{
		System.out.println("\nProduct Id is"+" "+id);
		System.out.println("\nProduct name"+" "+name);
		System.out.println("\nCount: "+count);
		System.out.println("\nCategory: "+category);
	}
}

class suba extends A{
	int price=30;
	int total_price=count*price;
	
	void subadisplay()
	{
		System.out.println("\nID: "+id);
		System.out.println("\nTotal Price: "+total_price);
		System.out.println("\nProduct name: "+name);
		System.out.println("\nCategory: "+category);
	}
}

class subb extends B{
	int price=10;
int total_price=count*price;
	
	void subbdisplay()
	{
		System.out.println("\nID: "+id);
		System.out.println("\nTotal Price: "+total_price);
		System.out.println("\nProduct name: "+name);
		System.out.println("\nCategory: "+category);
	}
}
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1=new A();
		B b1=new B();
		c c1=new c();
		suba s1=new suba();
		subb s2=new subb();
		s1.subadisplay();
		System.out.println("=================");
		s2.subbdisplay();
		System.out.println("=================");
		s1.display();
		System.out.println("=================");
		s2.display();
		System.out.println("=================");
		a1.display();
		System.out.println("=================");
		b1.display();
		System.out.println("=================");
		c1.display();
		

	}

}