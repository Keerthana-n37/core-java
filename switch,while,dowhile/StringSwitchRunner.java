class StringSwitchRunner {
    public static void main(String[] args) {
        evaluateLanguage("Python");
        evaluateLanguage("C++");
    }

    static void evaluateLanguage(String lang) {
        switch (lang) {
            case "Java":
                StringSwitch.javaInfo();
                break;
            case "Python":
                StringSwitch.pythonInfo();
                break;
            case "C":
                StringSwitch.cInfo();
                break;
            case "C++":
                StringSwitch.cppInfo();
                break;
            case "JS":
                StringSwitch.jsInfo();
                break;
            default:
                System.out.println("Unknown Language");
        }
    }
}