class OfficeRunner {

    public static void main(String[] args) {

        Office office1 = new Office(1,"Head Office","Bangalore",
                500,"Ravi Kumar",true,"Corporate",10,20000,true,true,
                5,"9 AM - 6 PM","TechSoft", true,8,"High","2005", 4.5,"Active");
        office1.aboutOffice();

        Office office2 = new Office(2,"Branch Office","Hyderabad",
                200,"Anita Rao",true,"Branch",6,12000,true,true,
                3,"9 AM - 6 PM","TechSoft",true,4,"Medium","2010",4.2,"Active");
        office2.aboutOffice();

        Office office3 = new Office(3,"Sales Office","Chennai",
                150,"Suresh",true,"Sales", 4,8000,false,true,
                2,"10 AM - 7 PM","MarketPro", true,3,"Medium","2012",4.0,"Active");
        office3.aboutOffice();

        Office office4 = new Office(4,"IT Hub","Pune",
                300,"Neha",true,"IT",8,15000,true,true,
                4,"9 AM - 6 PM","InnovaTech",true,6,"High","2015",4.6,"Active");
        office4.aboutOffice();

        Office office5 = new Office(5,"Support Center","Delhi",
                250,"Arjun",true,"Support", 5,10000,true,false,
                3,"24 Hours","HelpDesk Ltd",true,5,"High","2018",4.1,"Active");
        office5.aboutOffice();

        Office office6 = new Office(6,"Design Studio","Mumbai",
                120,"Priya",true,"Creative",3,7000,false,true,
                2,"10 AM - 6 PM","CreativeWorks",true,2,"Medium","2016",4.3,"Active");
        office6.aboutOffice();

        Office office7 = new Office(7,"Finance Office","Kolkata",
                180,"Manoj",true,"Finance",4,9000,true,true,
                3,"9 AM - 5 PM","FinServe", true,4,"High","2011",4.4,"Active");
        office7.aboutOffice();

        Office office8 = new Office(8,"HR Office","Jaipur",
                90,"Lakshmi",true,"HR",2,5000,false,false,
                1,"9 AM - 6 PM","PeopleFirst",true,2,"Medium","2019",4.0,"Active");
        office8.aboutOffice();

        Office office9 = new Office(9,"Research Center","Ahmedabad",
                220,"Vikas",true,"Research", 6,14000,true,true,
                4,"9 AM - 6 PM","FutureLabs", true,5,"High","2013",4.7,"Active");
        office9.aboutOffice();

        Office office10 = new Office(10,"Training Center","Mysore",
                100,"Sneha",true,"Training",3,6000,true,false,
                2,"9 AM - 4 PM","SkillUp",true,3,"Medium","2020",4.2,"Active");
        office10.aboutOffice();
    }
}