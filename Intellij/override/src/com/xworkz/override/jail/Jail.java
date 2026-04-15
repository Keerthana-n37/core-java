package com.xworkz.override.jail;

import java.util.Arrays;

public class Jail {

    String jailName;
    int capacity;
    String[] rules;
    SecurityLevel level;
    Prisoner prisoner;

    Jail(String jailName, int capacity, String[] rules, SecurityLevel level, Prisoner prisoner) {
        this.jailName = jailName;
        this.capacity = capacity;
        this.rules = rules;
        this.level = level;
        this.prisoner = prisoner;
    }

    void openGate() {
        System.out.println("Jail gate opened");
    }

    void closeGate() {
        System.out.println("Jail gate closed");
    }

    public String toString() {
        return "Jail{jailName='" + jailName + "', capacity=" + capacity + ", rules=" + Arrays.toString(rules) + ", level=" + level + ", prisoner=" + prisoner + "}";
    }
}
