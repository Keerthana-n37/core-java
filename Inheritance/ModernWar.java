class ModernWar extends War{

    int soldiersCount;
    int dronesUsed;
    boolean airStrike;
    String commanderName;
    int tanksUsed;

    ModernWar(){
        super();
        System.out.println("ModernWar constructor...");
    }

    void launchMissile(){
        System.out.println("executing launchMissile in ModernWar...");
    }
}