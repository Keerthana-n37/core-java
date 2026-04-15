package com.xworkz.override.jail;

public class HighSecurityJail extends Jail{

    boolean isMaximumSecurity;
    String chiefWarden;

    HighSecurityJail(String jailName, int capacity, String[] rules,
                     SecurityLevel level, Prisoner prisoner,
                     boolean isMaximumSecurity, String chiefWarden) {

        super(jailName, capacity, rules, level, prisoner);
        this.isMaximumSecurity = isMaximumSecurity;
        this.chiefWarden = chiefWarden;
    }

    void openGate() {
        System.out.println("High Security Jail gate opened");
    }

    void closeGate() {
        System.out.println("High Security Jail gate closed");
    }

    void showWarden() {
        System.out.println("Chief Warden: " + chiefWarden);
    }

    public String toString() {
        return "HighSecurityJail{isMaximumSecurity=" + isMaximumSecurity +
                ", chiefWarden='" + chiefWarden + "'} " + super.toString();
    }

}
