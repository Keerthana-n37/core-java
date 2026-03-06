class TeaRunner{

    public static void main(String[] args) {

        LeafExpert expert = new LeafExpert("Ananya");
        Patron patron = new Patron("Vikram");
        TeaMix mix = new TeaMix("Jasmine Green");
        MugType mugType = new MugType("Glass");
        Supplement supplement = new Supplement("Honey Drizzle");

        Tea tea = new Tea(1101, 95.75, 'L', true, 15,
                expert, patron, mix, mugType, supplement);
				
		tea.getTea();		
    }
}