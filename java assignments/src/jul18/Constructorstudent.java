package jul18;

public class Constructorstudent {
		String name;
		int age;
		char section;
		char gender;
		int sub1,sub2,sub3;
		float total;
		
		
		Constructorstudent(String name,int age,char section,char gender,int sub1,int sub2,int sub3)
		{
			this.name=name;
			this.age=age;
			this.section=section;
			this.gender=gender;
			this.sub1=sub1;
			this.sub2=sub2;
			this.sub3=sub3;
			total=(sub1+sub2+sub3);
			System.out.println("\nTotal marks obtained by student"+" "+total);
			float per=total/300*100;
			System.out.println("\nPercentage obtained by student"+" "+per);
		}
		
		Constructorstudent(String name,int age,char section,char gender,int sub2,int sub3)
		{
			this.name=name;
			this.age=age;
			this.section=section;
			this.gender=gender;
			this.sub2=sub2;
			this.sub3=sub3;
			total=(sub1+sub2+sub3);
			System.out.println("\nTotal marks obtained by student"+" "+total);
			float per=((total/300)*100);
			System.out.println("\nPercentage obtained by student"+" "+per);
		}
		void dislay()
		{
			System.out.println("\nStudent name: "+" "+name);
			System.out.println("\nStudent Age:"+" "+age);
			System.out.println("\nStudent section: "+" "+section);
			System.out.println("\nStudent Gender: "+" "+gender);
			System.out.println("\nSubject 1 marks: "+" "+sub1);
			System.out.println("\nSubject 2 marks: "+" "+sub2);
			System.out.println("\nSubject 3 marks: "+" "+sub3);
		
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Constructorstudent s1=new Constructorstudent("jj",20,'A','M',56,54,75);
			Constructorstudent s2=new Constructorstudent("hh",20,'B','F',35,67);
			Constructorstudent s3=new Constructorstudent("vv",21,'C','M',89,67);
			Constructorstudent s4=new Constructorstudent("cc",22,'D','M',80,56,68);
		    s1.dislay();
		    System.out.println("------------------------------------");
		    s2.dislay();
		    System.out.println("------------------------------------");
		    s3.dislay();
		    System.out.println("------------------------------------");
		    s4.dislay();
		    
			

		}

	}

