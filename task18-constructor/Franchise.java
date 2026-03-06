class Franchise {
    String franchiseTitle;

    Franchise(String franchiseTitle) {
        System.out.println("Executing Franchise Constructor");
        this.franchiseTitle = franchiseTitle;
    }

    void getFranchise() {
        System.out.println("Ipl franchise title is: " + this.franchiseTitle);
    }
}