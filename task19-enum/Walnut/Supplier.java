class Supplier{
     String name;
     String location;
     
     Supplier(String name, String location)
     {
        this.name=name;
        this.location=location;
     }
    void aboutSupplier() {
        System.out.println("Supplier Name: " + this.name);
        System.out.println("Location: " + this.location);
    }
}
