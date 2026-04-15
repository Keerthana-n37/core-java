package com.xworkz.override.language;

public class LanguageRunner {

    public static void main(String[] args) {
        String[] features = {"Fast", "Secure", "Portable"};

        Creator creator = new Creator("James Gosling", "Canada");

        Language language = new Language("Java", 17, 9.5, features, LangType.JAVA, creator);
        ProgrammingLanguage programmingLanguage = new ProgrammingLanguage("Python", 3, 9.8, features, LangType.PYTHON, creator, true, "Multi-paradigm");

        language.compile();
        language.execute();
        System.out.println(language);

        programmingLanguage.compile();
        programmingLanguage.execute();
        programmingLanguage.showParadigm();
        System.out.println(programmingLanguage);
    }
}
