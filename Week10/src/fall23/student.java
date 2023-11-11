package fall23;

class NCT {
	/*
	 * Student Name: Rachelle Muyargas
	 * Student ID: 4533324
	 * Professor: Sumithra Chandrasekar
	 * 
	 * Topic: Inheritance
	 * 
	 * */
	
	public void details() {
		int grade = 89;
		String subj = "Object Oriented Software Development";
		System.out.println("Grade: " + grade + "\nSubject: " + subj);
	}
}

class student extends NCT{
	public void location() {
		System.out.println("Location: NCT");
	}
	
	public static void main(String[] args) {
		student s = new student();
		s.details();
		s.location();
	}
}