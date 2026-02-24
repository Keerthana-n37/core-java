class UniversityRunner {

 public static void main(String[] args) {
    String[] collegeName =  {"R V College of Engineering"};
    String[] courses= Universities.getCoursesByCollegeName(collegeName);
	
	if(course!=null){
	for(int index=0;index<courses.length;index++)
	   {
		 System.out.println("Courses offered by "+name+":"+courses[index]);
		 return;
	   }
	}
	
	courses= Universities.getCoursesByCollegeName("University of Mysore");
	if(course!=null){
	for(int index=0;index<courses.length;index++)
	   {
		 System.out.println("Courses offered by "+"University of Mysore"+":"+courses[index]);
		 return;
	   }
	}
	
	courses= Universities.getCoursesByCollegeName("PES University");
	if(course!=null){
	for(int index=0;index<courses.length;index++)
	   {
		 System.out.println("Courses offered by "+"PES University"+":"+courses[index]);
		 return;
	   }
	}
	
	courses= Universities.getCoursesByCollegeName("CMR Institute of Technology");
	if(course!=null){
	for(int index=0;index<courses.length;index++)
	   {
		 System.out.println("Courses offered by "+"CMR Institute of Technology"+":"+courses[index]);
		 return;
	   }
	}
	
	courses= Universities.getCoursesByCollegeName("Kuvempu University");
	if(course!=null){
	for(int index=0;index<courses.length;index++)
	   {
		 System.out.println("Courses offered by "+"Kuvempu University"+":"+courses[index]);
		 return;
	   }
	}
	
	courses= Universities.getCoursesByCollegeName("Manipal Academy of Higher Education");
	if(course!=null){
	for(int index=0;index<courses.length;index++)
	   {
		 System.out.println("Courses offered by "+"Manipal Academy of Higher Education"+":"+courses[index]);
		 return;
	   }
	}
	
	courses= Universities.getCoursesByCollegeName("Rao Bahadur Y Mahabaleshwarappa Engineering College");
	if(course!=null){
	for(int index=0;index<courses.length;index++)
	   {
		 System.out.println("Courses offered by "+"University of Mysore"+":"+courses[index]);
		 return;
	   }
	}
	
	courses= Universities.getCoursesByCollegeName("Shree Devi Institute of Technology");
	if(course!=null){
	for(int index=0;index<courses.length;index++)
	   {
		 System.out.println("Courses offered by "+"PES University"+":"+courses[index]);
		 return;
	   }
	}
	
	courses= Universities.getCoursesByCollegeName("Global Academy of Technology");
	if(course!=null){
	for(int index=0;index<courses.length;index++)
	   {
		 System.out.println("Courses offered by "+"CMR Institute of Technology"+":"+courses[index]);
		 return;
	   }
	}
	
	courses= Universities.getCoursesByCollegeName("Bangalore Institute of Technology");
	if(course!=null){
	for(int index=0;index<courses.length;index++)
	   {
		 System.out.println("Courses offered by "+"Kuvempu University"+":"+courses[index]);
		 return;
	   }
	}
	
	courses= Universities.getCoursesByCollegeName("Dayananda Sagar University");
	if(course!=null){
	for(int index=0;index<courses.length;index++)
	   {
		 System.out.println("Courses offered by "+"Manipal Academy of Higher Education"+":"+courses[index]);
		 return;
	   }
	}
	
	else{
	System.out.println("College not found in the database");
	return;
	}
    	 
  }
}
