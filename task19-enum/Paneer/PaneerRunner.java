class PaneerRunner{
    public static void main(String[] args){

        PaneerAttributes attribute1 = new PaneerAttributes("Cow", 18, "Fresh");
        Paneer paneer1 = new Paneer(500, attribute1, PaneerShape.RECTANGLE);
        paneer1.printInfo();

        PaneerAttributes attribute2 = new PaneerAttributes("Buffalo", 20, "Refrigerated");
        Paneer paneer2 = new Paneer(250, attribute2, PaneerShape.CUBE);
        paneer2.printInfo();

        PaneerAttributes attribute3 = new PaneerAttributes("Cow", 19, "Fresh");
		PaneerShape shape=PaneerShape.SLAB;
        Paneer paneer3 = new Paneer(300, attribute3,shape);
        paneer3.printInfo();

        PaneerAttributes attribute4 = new PaneerAttributes("Buffalo", 22, "Not fresh");
		PaneerShape shape1=PaneerShape.SQUARE;
        Paneer paneer4 = new Paneer(400, attribute4,shape1);
        paneer4.printInfo();
    }
}