package com.xworkz.override.language;

public class ProgrammingLanguage extends Language{

    boolean isOOP;
    String paradigm;

    ProgrammingLanguage(String name, int version, double popularity, String[] qarray, LangType type, Creator creator, boolean isOOP, String paradigm) {
        super(name, version, popularity, qarray, type, creator);
        this.isOOP = isOOP;
        this.paradigm = paradigm;
    }

    void compile() {
        System.out.println("Compiling programming language " + name);
    }

    void execute() {
        System.out.println("Executing programming language " + name);
    }

    void showParadigm() {
        System.out.println("Paradigm: " + paradigm);
    }

    public String toString() {
        return "ProgrammingLanguage{isOOP=" + isOOP + ", paradigm='" + paradigm + "'} " + super.toString();
    }

}
