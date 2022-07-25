package phase1.modifier.p2;

import phase1.modifier.p2.ClassX;
import phase1.modifier.p1.ClassM;
import phase1.modifier.p1.ClassN;

public class ClassY extends ClassN{

	public static void main(String[] args) {
		ClassX obje=new ClassX();
		ClassM ob=new ClassM();
		ClassN obj =new ClassN();
		ob.print();
		obj.printN();
		System.out.println("The variables of X:"+ obje.h);

	}

}
