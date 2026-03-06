class BellRunner{
    public static void main(String[] args){
        SoundDesigner designer = new SoundDesigner("Arjun");
        Audience audience = new Audience("Sanya");
        Tone tone = new Tone("Chime");
        Support support = new Support("Wall Hook");
        Enhancer enhancer = new Enhancer("Clapper");

        Bell bell = new Bell(12.5, 'L', true, 7, 95.75,
                designer, audience, tone, support, enhancer);
        bell.getBell();
	}
}