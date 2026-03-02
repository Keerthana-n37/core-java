class Cell {
    int cellId;
    String cellType;
    String organismType;
    double size;
    String shape;
    boolean nucleusPresent;
    String function;
    String location;
    String cellWallType;
    boolean multicellular;
    int chromosomeCount;
    String energySource;
    boolean divides;
    String color;
    String discoveryYear;
    String discoveredBy;
    double lifespan;
    boolean harmful;
    String disease;
    String healthStatus;

    Cell(int cellId, String cellType, String organismType, double size,
         String shape, boolean nucleusPresent, String function,
         String location, String cellWallType, boolean multicellular,
         int chromosomeCount, String energySource, boolean divides,
         String color, String discoveryYear, String discoveredBy,
         double lifespan, boolean harmful, String disease,
         String healthStatus) {

        this.cellId = cellId;
        this.cellType = cellType;
        this.organismType = organismType;
        this.size = size;
        this.shape = shape;
        this.nucleusPresent = nucleusPresent;
        this.function = function;
        this.location = location;
        this.cellWallType = cellWallType;
        this.multicellular = multicellular;
        this.chromosomeCount = chromosomeCount;
        this.energySource = energySource;
        this.divides = divides;
        this.color = color;
        this.discoveryYear = discoveryYear;
        this.discoveredBy = discoveredBy;
        this.lifespan = lifespan;
        this.harmful = harmful;
        this.disease = disease;
        this.healthStatus = healthStatus;
    }

    void aboutCell() {

        System.out.println("Cell ID: " + cellId);
        System.out.println("Cell Type: " + cellType);
        System.out.println("Organism Type: " + organismType);
        System.out.println("Size: " + size + " micrometers");
        System.out.println("Shape: " + shape);
        System.out.println("Nucleus Present: " + nucleusPresent);
        System.out.println("Function: " + function);
        System.out.println("Location: " + location);
        System.out.println("Cell Wall Type: " + cellWallType);
        System.out.println("Multicellular: " + multicellular);
        System.out.println("Chromosome Count: " + chromosomeCount);
        System.out.println("Energy Source: " + energySource);
        System.out.println("Divides: " + divides);
        System.out.println("Color: " + color);
        System.out.println("Discovery Year: " + discoveryYear);
        System.out.println("Discovered By: " + discoveredBy);
        System.out.println("Lifespan: " + lifespan);
        System.out.println("Harmful: " + harmful);
        System.out.println("Disease: " + disease);
        System.out.println("Health Status: " + healthStatus);
        System.out.println("----------------------------");
    }
}