class MissleRunner{

    public static void main(String[] args) {

        Missle missle1 = new Missle();
        missle1.launch();
        missle1.target();
        missle1.fly();
        missle1.track();
        missle1.accelerate();
        missle1.explode();
        missle1.fuel();
        missle1.arm();
        missle1.disarm();
        missle1.test();
        missle1.navigate();
        missle1.rotate();
        missle1.standby();
        missle1.reload();
        missle1.shutdown();
        System.out.println("-------------------");
        
		Missle missle2 = new Missle();
        missle2.launch();
        missle2.target();
        missle2.fly();
        missle2.track();
        missle2.accelerate();
        missle2.explode();
        missle2.fuel();
        missle2.arm();
        missle2.disarm();
        missle2.test();
        missle2.navigate();
        missle2.rotate();
        missle2.standby();
        missle2.reload();
        missle2.shutdown();
        System.out.println("-------------------");
		
        Missle.type();
        Missle.range();
        Missle.country();
        Missle.purpose();
        Missle.technology();
    }
}