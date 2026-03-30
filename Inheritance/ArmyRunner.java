class ArmyRunner{

    public static void main(String[] args) {

        System.out.println("Subclass Object Same Type");

        IndianArmy indianArmy1 = new IndianArmy();
        indianArmy1.country = "India";
        indianArmy1.noOfSoldiers = 1200000;
        indianArmy1.commander = "Manoj";
        indianArmy1.regimentName = "Rajput Regiment";
        indianArmy1.tanks = 500;
        indianArmy1.helicopters = 200;
        indianArmy1.baseLocation = "Delhi";
        indianArmy1.specialForces = true;

        indianArmy1.protectNation();
        indianArmy1.training();
        indianArmy1.warOperation();

        IndianArmy indianArmy2 = new IndianArmy();
        indianArmy2.country = "India";
        indianArmy2.noOfSoldiers = 900000;
        indianArmy2.commander = "General Singh";
        indianArmy2.regimentName = "Sikh Regiment";
        indianArmy2.tanks = 400;
        indianArmy2.helicopters = 150;
        indianArmy2.baseLocation = "Punjab";
        indianArmy2.specialForces = false;

        indianArmy2.protectNation();
        indianArmy2.training();
        indianArmy2.warOperation();

        System.out.println("Parent Reference Subclass Object");

        Army army1 = new IndianArmy();
        army1.country = "India";
        army1.noOfSoldiers = 1000000;
        army1.commander = "General Rawat";

        army1.protectNation();
        army1.training();

        Army army2 = new IndianArmy();
        army2.country = "India";
        army2.noOfSoldiers = 800000;
        army2.commander = "General Kapoor";

        army2.protectNation();
        army2.training();

        System.out.println("Parent Class Object");

        Army army3 = new Army();
        army3.country = "USA";
        army3.noOfSoldiers = 700000;
        army3.commander = "General Smith";

        army3.protectNation();
        army3.training();

        Army army4 = new Army();
        army4.country = "UK";
        army4.noOfSoldiers = 500000;
        army4.commander = "General John";

        army4.protectNation();
        army4.training();
    }
}