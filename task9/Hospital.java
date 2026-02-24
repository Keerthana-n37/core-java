class Hospital {

    static void patient(String name) {
        System.out.println("Executing patient method with name");
        System.out.println("Name: " + name);

        if(name == null){
            System.out.println("Invalid data: name cannot be null");
            return;
        }

        System.out.println("Data is valid");
        System.out.println("-------------------");
    }

    static void patient(String name, int age) {
        System.out.println("Executing overloaded patient method with name, age");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        if(name == null){
            System.out.println("Invalid data: name cannot be null");
            return;
        }
        if(age <= 0){
            System.out.println("Invalid data: age must be greater than 0");
            return;
        }

        System.out.println("Data is valid");
        System.out.println("-------------------");
    }

    static void patient(String name, int age, String disease, String doctor) {
        System.out.println("Executing overloaded patient method with name, age, disease, doctor");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Disease: " + disease);
        System.out.println("Doctor: " + doctor);

        if(name == null){
            System.out.println("Invalid data: name cannot be null");
            return;
        }
        if(age <= 0){
            System.out.println("Invalid data: age must be greater than 0");
            return;
        }
		if(disease == null){
            System.out.println("Invalid data: disease cannot be null");
            return;
        }
        if(doctor == null){
            System.out.println("Invalid data: doctor cannot be null");
            return;
        }
        System.out.println("Data is valid");
        System.out.println("-------------------");
    }
}
