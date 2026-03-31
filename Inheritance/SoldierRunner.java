class SoldierRunner 
{
    public static void main(String[] args) 
	{

        System.out.println("Subclass Object Same Type");

        SpecialSoldier soldier = new SpecialSoldier();
        soldier.name = "Rahul";
        soldier.rank = "Major";
        soldier.experience = 12;
        soldier.active = true;
        soldier.mission = "Border";
        soldier.weapons = 4;
        soldier.trained = true;
        soldier.medals = 5;
        soldier.unit = "Alpha";

        System.out.println(soldier.name);
        System.out.println(soldier.rank);
        System.out.println(soldier.experience);
        System.out.println(soldier.active);
        System.out.println(soldier.mission);
        System.out.println(soldier.weapons);
        System.out.println(soldier.trained);
        System.out.println(soldier.medals);
        System.out.println(soldier.unit);

        soldier.patrol();
        soldier.rest();
        soldier.attack();
        soldier.rescue();


        System.out.println("Parent Reference Subclass Object");

        Soldier basic = new SpecialSoldier();
        basic.name = "Amit";
        basic.rank = "Captain";
        basic.experience = 8;
        basic.active = true;

        System.out.println(basic.name);
        System.out.println(basic.rank);
        System.out.println(basic.experience);
        System.out.println(basic.active);

        basic.patrol();
        basic.rest();


        System.out.println("Parent Class Object");

        Soldier soldier2 = new Soldier();
        soldier2.name = "Kiran";
        soldier2.rank = "Lieutenant";
        soldier2.experience = 5;
        soldier2.active = true;

        System.out.println(soldier2.name);
        System.out.println(soldier2.rank);
        System.out.println(soldier2.experience);
        System.out.println(soldier2.active);

        soldier2.patrol();
        soldier2.rest();
    }
}