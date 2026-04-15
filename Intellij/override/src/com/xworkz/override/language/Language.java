package com.xworkz.override.language;

import java.util.Arrays;

public class Language {


    String name;
    int version;
    double popularity;
    String[] features;
    LangType type;
    Creator creator;

    Language(String name, int version, double popularity, String[] features, LangType type, Creator creator) {
        this.name = name;
        this.version = version;
        this.popularity = popularity;
        this.features = features;
        this.type = type;
        this.creator = creator;
    }

    void compile() {
        System.out.println("Compiling " + name);
    }

    void execute() {
        System.out.println("Executing " + name);
    }

    public String toString() {
        return "Language{name='" + name + "', version=" + version + ", popularity=" + popularity +",features=" +Arrays.toString(features) +", type=" + type + ", creator=" + creator + "}";
    }

}
