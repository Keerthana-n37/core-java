class Bell{

    double weight;
    double volume;
    boolean isMusical;
    int ringCount;
    double price;

    SoundDesigner designer;
    Audience audience;
    Tone tone;
    Support support;
    Enhancer enhancer;

    Bell(double weight, double volume, boolean isMusical, int ringCount, double price,
         SoundDesigner designer, Audience audience, Tone tone, Support support, Enhancer enhancer) {

        System.out.println("Executing Bell Constructor");

        this.weight = weight;
        this.volume = volume;
        this.isMusical = isMusical;
        this.ringCount = ringCount;
        this.price = price;

        this.designer = designer;
        this.audience = audience;
        this.tone = tone;
        this.support = support;
        this.enhancer = enhancer;

        System.out.println("Weight: " + weight);
        System.out.println("Form Symbol: " +volume);
        System.out.println("Is Musical: " + isMusical);
        System.out.println("Ring Count: " + ringCount);
        System.out.println("Price:" + price);

        System.out.println("Sound Designer: " + designer.name);
        System.out.println("Audience: " + audience.name);
        System.out.println("Tone: " + tone.description);
        System.out.println("Support: " + support.type);
        System.out.println("Enhancer: " + enhancer.name);
    }
}