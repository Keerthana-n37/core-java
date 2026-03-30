class WarRunner
{

    public static void main(String[] args) {

        System.out.println("Subclass Object Same Type");

        ModernWar war = new ModernWar();
        war.warName = "Border Conflict";
        war.country = "India";
        war.year = 2024;
        war.soldiersCount = 50000;
        war.dronesUsed = 200;
        war.airStrike = true;
        war.commanderName = "Arjun";
        war.tanksUsed = 150;

        System.out.println("War Name : " + war.warName);
        System.out.println("Country : " + war.country);
        System.out.println("Year : " + war.year);
        System.out.println("Soldiers Count : " + war.soldiersCount);
        System.out.println("Drones Used : " + war.dronesUsed);
        System.out.println("Air Strike : " + war.airStrike);
        System.out.println("Commander Name : " + war.commanderName);
        System.out.println("Tanks Used : " + war.tanksUsed);
        war.startBattle();
        war.ceaseFire();
        war.launchMissile();


        ModernWar war1 = new ModernWar();
        war1.warName = "Sea Operation";
        war1.country = "Japan";
        war1.year = 2023;
        war1.soldiersCount = 30000;
        war1.dronesUsed = 120;
        war1.airStrike = false;
        war1.commanderName = "Kenji";
        war1.tanksUsed = 90;

        System.out.println("War Name : " + war1.warName);
        System.out.println("Country : " + war1.country);
        System.out.println("Year : " + war1.year);
        System.out.println("Soldiers Count : " + war1.soldiersCount);
        System.out.println("Drones Used : " + war1.dronesUsed);
        System.out.println("Air Strike : " + war1.airStrike);
        System.out.println("Commander Name : " + war1.commanderName);
        System.out.println("Tanks Used : " + war1.tanksUsed);
        war1.startBattle();
        war1.ceaseFire();
        war1.launchMissile();


        System.out.println("Parent Reference Subclass Object");

        War basicWar = new ModernWar();
        basicWar.warName = "Mountain War";
        basicWar.country = "Nepal";
        basicWar.year = 2022;

        System.out.println("War Name : " + basicWar.warName);
        System.out.println("Country : " + basicWar.country);
        System.out.println("Year : " + basicWar.year);
        basicWar.startBattle();
        basicWar.ceaseFire();

        War basicWar1 = new ModernWar();
        basicWar1.warName = "Desert War";
        basicWar1.country = "UAE";
        basicWar1.year = 2021;

        System.out.println("War Name : " + basicWar1.warName);
        System.out.println("Country : " + basicWar1.country);
        System.out.println("Year : " + basicWar1.year);
        basicWar1.startBattle();
        basicWar1.ceaseFire();


        System.out.println("Parent Class Object");

        War historyWar = new War();
        historyWar.warName = "Old War";
        historyWar.country = "France";
        historyWar.year = 1990;

        System.out.println("War Name : " + historyWar.warName);
        System.out.println("Country : " + historyWar.country);
        System.out.println("Year : " + historyWar.year);
        historyWar.startBattle();
        historyWar.ceaseFire();

        War historyWar1 = new War();
        historyWar1.warName = "Cold War";
        historyWar1.country = "USA";
        historyWar1.year = 1980;

        System.out.println("War Name : " + historyWar1.warName);
        System.out.println("Country : " + historyWar1.country);
        System.out.println("Year : " + historyWar1.year);
        historyWar1.startBattle();
        historyWar1.ceaseFire();
    }
}