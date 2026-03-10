class Walnut{
     int weight;
     Supplier walnutSupplier;
     WalnutType type;

    Walnut(int weight, Supplier walnutSupplier,WalnutType type){
           this.weight=weight;
           this.walnutSupplier=walnutSupplier;
           this.type=type;
    }


    void printInfo(){
     System.out.println("Weight: "+this.weight);
		if(this.walnutSupplier!=null)
		{ 
		   this.walnutSupplier.aboutSupplier();
		} else{
		 System.out.println("Supplier is null");
		}

     System.out.println("Walnut Type:"+this.type);
     System.out.println("--------------------");
    }
}