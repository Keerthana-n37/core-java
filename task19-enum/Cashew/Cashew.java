class Cashew{

      int quantity;
      Supplier supplier;
      CashewType type;


     Cashew(int quantity,Supplier supplier,CashewType type)
    {
       this.quantity=quantity;
       this.supplier=supplier;
       this.type=type;
    }

    void printInfo()
    {
      System.out.println("Quantity:"+this.quantity);

      if(this.supplier!=null)
      {
        this.supplier.aboutSupplier();
      }
      else{
        System.out.println("Supplier is null");
      }
      System.out.println("Cashew Type:"+this.type);
      System.out.println("-----------------");
    }
}      
     
