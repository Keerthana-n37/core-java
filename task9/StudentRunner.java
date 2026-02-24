class StudentRunner{
	public static void main(String[] args){
		String name="Ananya";
		int age=21;
		String branch="ECE";
		String college="MIT college";
		String city="Mangalore";
		Student.details(name,age,branch);
		Student.details(name,age,college,city);
		Student.details(name,age);
		
		name="Rahul";
		age=22;
		branch="Mechanical";
		Student.details(name,age,branch);
		Student.details(name,age,college,city);
		
		name="Kiran";
		age=19;
		branch="Civil";
		city="Bengaluru";
		college="PES University";
		Student.details(name,age,branch);
		Student.details(name,age);
		Student.details(name,age,branch,city);
	}
}