package jul18;

public class StringBufferProgram {
	public static void main(String args[]){  
				StringBuffer s = new StringBuffer("Started Java");
				s.append("Phase");
				System.out.println(s);
				s.delete(2,5);
				System.out.println(s);
				s.replace(5,9,"Python");
				System.out.println(s);
				s.insert(4, "language");
				System.out.println(s);
				s.reverse();
				System.out.println(s);
				System.out.println(s.charAt(9));
			}

			

		}


