package fall23;
public class Encap {
	/*
	 * Student Name: Rachelle Muyargas
	 * Student ID: 4533324
	 * Professor: Sumithra Chandrasekar
	 * 
	 * Topic: Encapsulation - hide any info from the user (data hiding)
	 * 
	 * */
	
	private String name; //use get method (storing)and set method 
	private int salary;
	
	public String getname() {
		return name;
	}
	
	public void setname(String x) { //passing x value
		name = x;
	}
	
	public int getsalary() {
		return salary;
	}
	public void setsalary(int sal) {
		salary = sal;
	}

	public static void main(String[] args) {
		Encap e = new Encap();
		e.setname("Rachelle");
		e.setsalary(1500);
		System.out.println(e.getname() + "'s salary" + " is " + e.getsalary() );
	}
}