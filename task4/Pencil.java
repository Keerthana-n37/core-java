class Pencil{

   static void write()
   {
	   System.out.println("Writing a statement...");
	   breakPencil();
   }
   
   static void breakPencil()
   {
	   System.out.println("Pencil is broken...");
	   sharpen();
   }
   
   static void sharpen()
   {
	   System.out.println("Pencil is sharpened...");
	   write();
   }
}