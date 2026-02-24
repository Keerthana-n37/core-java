class President{
   static void govern()
   {
	   System.out.println("President is governing the country");
	   callstate();
   }
   
   static void callstate()
   {
	   System.out.println("Calling the state government");
	   rules();
   }
   
   static void rules()
   {
	   System.out.println("Rules are framed");
	   check();
   }
   
   static void check()
   {
	   System.out.println("Rules are being checked");
	   callAdmin();
   }
   
   static void callAdmin()
   {
	   System.out.println("Calling admins");
	   collect();
   }
   
   static void collect()
   {
	   System.out.println("Collecting reports");
	   apply();
   }
   
   static void apply()
   {
	   System.out.println("Applying the rules");
	   chain();
   }
   
   static void chain()
   {
	   System.out.println("Chain will continues");
	   citizen();
   }
   
   static void citizen()
   {
	   System.out.println("Citizen information are collected");
	   follow();
   }
   
   static void follow()
   {
	   System.out.println("Citizen must follow the rules");
   }
}