class FloatSwitch {
    static void cold() {
        System.out.println("Temperature: Cold");
        comfortAdvice(15.0f);
    }
    static void cool() {
        System.out.println("Temperature: Cool");
        comfortAdvice(20.0f);
    }
    static void warm() {
        System.out.println("Temperature: Warm");
        comfortAdvice(25.0f);
    }
    static void hot() {
        System.out.println("Temperature: Hot");
        comfortAdvice(35.0f);
    }
    static void extremeHeat() {
        System.out.println("Temperature: Extreme Heat");
        comfortAdvice(45.0f);
    }
    static void comfortAdvice(float temp) {
        if (temp < 18)
		{
            System.out.println("Advice: Wear warm clothes");
			return;
		}
        if (temp <= 25)
		{
            System.out.println("Advice: Enjoy outdoor activities");
			return;
		}
        if (temp <= 35)
		{
            System.out.println("Advice: Stay hydrated");
			return;
		}
        System.out.println("Advice: Avoid going outside, stay cool");
		return;
    }
}


