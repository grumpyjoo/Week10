package fall23;

class Manager { //Main function
	/*
	 * Student Name: Rachelle Muyargas
	 * Student ID: 4533324
	 * Professor: Sumithra Chandrasekar
	 * 
	 * Topic: Inheritance
	 * 
	 * */
	public void details() {
		
		String location = "Toronto";
		String candidate = "Rachelle";
		System.out.println(candidate + "'s location is " + location);
	}
}

class Candidate extends Manager { //Candidate is subclass
	public void project() {
		System.out.println("The project name is python");
	}
	
	public static void main(String[] args) {
		Candidate c = new Candidate();
		c.details();
		c.project();
	}
}