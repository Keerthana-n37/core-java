class Supplier{

      String companyName;
      String contactNumber;
      String city;

     Supplier(String companyName, String contactNumber, String city)
     {
           this.companyName=companyName;
           this.contactNumber=contactNumber;
           this.city=city;
     }
 
     void aboutSupplier()
     {
        System.out.println("Company name:"+this.companyName);
        System.out.println("Contact Number:"+this.contactNumber);
        System.out.println("City:"+this.city);
     }
}