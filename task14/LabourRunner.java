class LabourRunner {
    public static void main(String[] args)
    {
        Labour labour1 = new Labour();
        labour1.name = "Ravi";
        labour1.salary = 18000;
        labour1.idProofs = new String[]{"Aadhar", "PAN", "Voter ID"};

        System.out.println("Labour1 Details:");
        System.out.println("Name:" + labour1.name);
        System.out.println("Salary:" + labour1.salary);
        System.out.println("ID Proofs:");
        for(int index = 0; index < labour1.idProofs.length; index++)
        {
            System.out.println(labour1.idProofs[index]);
        }
        System.out.println("-----------------");

        Labour labour2 = new Labour();
        labour2.name = "Kiran";
        labour2.salary = 22000;
        labour2.idProofs = new String[]{"Aadhar", "Driving License", "Passport"};

        System.out.println("Labour2 Details:");
        System.out.println("Name:" + labour2.name);
        System.out.println("Salary:" + labour2.salary);
        System.out.println("ID Proofs:");
        for(int index = 0; index < labour2.idProofs.length; index++)
        {
            System.out.println(labour2.idProofs[index]);
        }
        System.out.println("-----------------");
    }
}