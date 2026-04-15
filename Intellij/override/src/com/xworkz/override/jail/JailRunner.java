package com.xworkz.override.jail;

public class JailRunner {

    public static void main(String[] args) {

        String[] rules = {"No Escape", "No Weapons", "Strict Discipline"};

        Prisoner prisoner = new Prisoner("John", 35);

        Jail jail= new Jail("Central Jail", 500, rules, SecurityLevel.HIGH, prisoner);

        HighSecurityJail highSecurityJail = new HighSecurityJail("Super Max Jail", 1000, rules, SecurityLevel.HIGH, prisoner, true, "Mr. Sharma"
        );

        jail.openGate();
        jail.closeGate();
        System.out.println(jail);

        System.out.println("-------------------");

        highSecurityJail.openGate();
        highSecurityJail.closeGate();
        highSecurityJail.showWarden();
        System.out.println(highSecurityJail);
    }
}
