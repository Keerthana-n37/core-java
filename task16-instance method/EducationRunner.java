class EducationRunner {

    public static void main(String[] args) {

        Education education1 = new Education(1,"Raj","B.E","Computer Science","BAMS College",
                "VTU","Bangalore",2018,2022,85.5,8.5,true,"Regular","A",false,
                "Java Programming",40,"Online Shopping System",92.0,"Completed");
        education1.aboutEducation();

        Education education2 = new Education(2,"Ria","B.Com",
                "Finance","Reva university","Bangalore University","Bangalore",
                2017,2020,78.2,7.8,true,"Regular","B",true,
                "Accounting",36,"Tax Management System",88.0,"Completed");
        education2.aboutEducation();

        Education education3 = new Education(3,"Amit","B.Tech","Mechanical","LMN Institute",
                "JNTU","Hyderabad",2016,2020,82.0,8.2,true,"Regular","A",false,
                "AutoCAD",42,"Engine Design",85.0,"Completed");
        education3.aboutEducation();

        Education education4 = new Education(4,"Sneha","MBA","HR","PQR Business School",
                "Mumbai University","Mumbai",2019,2021,88.5,8.9,true,
                "Regular","A+",true,"Leadership",30,"Employee Engagement",90.0,"Completed");
        education4.aboutEducation();

        Education education5 = new Education(5,"Vikram","B.Sc","Physics","RST College",
                "Delhi University","Delhi",2015,2018,75.0,7.5,true,
                "Regular","B",false,"Research Skills",35,"Quantum Study",80.0,"Completed");
        education5.aboutEducation();

        Education education6 = new Education(6,"Ananya","BCA","Computer Applications","Tech College",
                "Mysore University","Mysore",2020,2023,89.0,9.0,true,
                "Regular","A+",false,"Full Stack Development",38, "Library Management System",95.0,"Completed");
        education6.aboutEducation();

        Education education7 = new Education(7,"Rahul","Diploma","Civil","Govt Polytechnic",
                "State Board","Chennai", 2017,2020,70.5,7.0,true,"Regular","B",false,
                "Building Design",32, "Bridge Model",78.0,"Completed");
        education7.aboutEducation();

        Education education8 = new Education(8,"Pooja","B.A","English","Arts College",
                "Kolkata University","Kolkata", 2018,2021,84.0,8.4,true,
                "Regular","A",true,"Communication Skills",30,"Literature Review",87.0,"Completed");
        education8.aboutEducation();

        Education education9 = new Education(9,"Karan","M.Tech","Electronics","Engineering College",
                "Anna University","Chennai",2021,2023,90.0,9.1,true, "Regular","A+",false,
                "Embedded Systems",28,"IoT Based Project",93.0,"Completed");
        education9.aboutEducation();

        Education education10 = new Education(10,"Isha","BBA","Marketing","Business College",
                "Osmania University","Hyderabad", 2019,2022,86.0,8.6,true,
                "Regular","A",false,"Digital Marketing",34,"Market Analysis",89.0,"Completed");
        education10.aboutEducation();
    }
}