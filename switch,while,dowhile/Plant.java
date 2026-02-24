class Plant {

    static void waterPlant(String name) {
        System.out.println("Watering"+ name);
		giveSunlight(name)
    }
    static void giveSunlight(String name) {
        System.out.println("Giving sunlight to"+ name);
    }
    static void trimLeaves(String name) {
        System.out.println("Trimming leaves of"+ name);
		removeDryLeaves(name)
    }
    static void removeDryLeaves(String name) {
        System.out.println("Removing dry leaves from"+ name);
    }
}
