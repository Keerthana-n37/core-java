package com.xworkz.override.chain;

public class Designer {
        String name;
        String brand;

        Designer(String name, String brand) {
            this.name = name;
            this.brand = brand;
        }

        public String toString() {
            return "Designer{name='" + name + "', brand='" + brand + "'}";
        }
}
