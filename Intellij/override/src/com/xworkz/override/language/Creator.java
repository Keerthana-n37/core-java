package com.xworkz.override.language;

public class Creator {

        String name;
        String country;

        Creator(String name, String country) {
            this.name = name;
            this.country = country;
        }

        public String toString() {
            return "Creator{name='" + name + "', country='" + country + "'}";
        }
}
