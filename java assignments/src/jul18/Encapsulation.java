package jul18;

public class Encapsulation {


		// TODO Auto-generated constructor stub
		private int securitycode;
		private String branchname;
		private int branchcode;
		private String deptname;
		private int deptcode;
		
		

		public int getSecuritycode() {
			return securitycode;
		}



		public void setSecuritycode(int securitycode) {
			this.securitycode = securitycode;
		}



		public String getBranchname() {
			return branchname;
		}



		public void setBranchname(String branchname) {
			this.branchname = branchname;
		}



		public int getBranchcode() {
			return branchcode;
		}



		public void setBranchcode(int branchcode) {
			this.branchcode = branchcode;
		}



		public String getDeptname() {
			return deptname;
		}



		public void setDeptname(String deptname) {
			this.deptname = deptname;
		}



		public int getDeptcode() {
			return deptcode;
		}



		public void setDeptcode(int deptcode) {
			this.deptcode = deptcode;
		}



		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Encapsulation e=new Encapsulation();
			e.setSecuritycode(1235);
			e.setBranchname("IT");
			e.setBranchcode(435);
			e.setDeptname("Production");
			e.setDeptcode(101);
			System.out.println("\nsecurity code is"+" "+e.getSecuritycode());
			System.out.println("\nBranch Name is"+" "+e.getBranchname());
			System.out.println("\nBranch code is"+" "+e.getBranchcode());
			System.out.println("\nDept name is"+" "+e.getDeptname());
			System.out.println("\nDept code is"+" "+e.getDeptcode());
			

		}

	
	}


