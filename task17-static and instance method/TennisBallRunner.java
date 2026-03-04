class TennisBallRunner{

    public static void main(String[] args) {

        TennisBall tennis1=new TennisBall();
        tennis1.bounce();
        tennis1.roll();
        tennis1.spin();
        tennis1.hit();
        tennis1.serve();
        tennis1.crossNet();
        tennis1.land();
        tennis1.goOut();
        tennis1.stop();
        tennis1.compress();
        tennis1.travel();
        tennis1.glow();
        tennis1.getDirty();
        tennis1.dry();
        tennis1.replace();
        System.out.println("-------------------");

        TennisBall tennis2=new TennisBall();
        tennis2.bounce();
        tennis2.roll();
        tennis2.spin();
        tennis2.hit();
        tennis2.serve();
        tennis2.crossNet();
        tennis2.land();
        tennis2.goOut();
        tennis2.stop();
        tennis2.compress();
        tennis2.travel();
        tennis2.glow();
        tennis2.getDirty();
        tennis2.dry();
        tennis2.replace();
        System.out.println("-------------------");

        TennisBall.color();
        TennisBall.weight();
        TennisBall.material();
        TennisBall.sportName();
        TennisBall.brand();
    }
}