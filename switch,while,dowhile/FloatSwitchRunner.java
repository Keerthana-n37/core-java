class FloatSwitchRunner {
    public static void main(String[] args) {
        evaluateTemperature(15.0f);
        evaluateTemperature(22.5f);
        evaluateTemperature(36.0f);
        evaluateTemperature(45.0f);
    }

    static void evaluateTemperature(float temp) {
        int roundedTemp = (int) temp; 
        switch (roundedTemp) {
            case 15:
                FloatSwitch.cold();
                break;
            case 20:
                FloatSwitch.cool();
                break;
            case 25:
                FloatSwitch.warm();
                break;
            case 35:
                FloatSwitch.hot();
                break;
            case 45:
                FloatSwitch.extremeHeat();
                break;
            default:
                System.out.println("Temperature not categorized");
        }
    }
}