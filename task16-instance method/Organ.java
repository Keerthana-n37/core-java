class Organ{

    int organId;
    String organName;
    String bodySystem;
    double weight; 
    String function;
    boolean vital;
    String location;
    double length; 
    double width; 
    double height; 
    String bloodTypeSupport;
    boolean paired;
    String shape;
    String color;
    int cellCount; 
    boolean transplantable;
    String disease;
    String specialist;
    double efficiencyLevel;
    String healthStatus;

    Organ(int organId, String organName, String bodySystem, double weight,
          String function, boolean vital, String location, double length,
          double width, double height, String bloodTypeSupport, boolean paired,
          String shape, String color, int cellCount, boolean transplantable,
          String disease, String specialist, double efficiencyLevel,
          String healthStatus) {

        this.organId = organId;
        this.organName = organName;
        this.bodySystem = bodySystem;
        this.weight = weight;
        this.function = function;
        this.vital = vital;
        this.location = location;
        this.length = length;
        this.width = width;
        this.height = height;
        this.bloodTypeSupport = bloodTypeSupport;
        this.paired = paired;
        this.shape = shape;
        this.color = color;
        this.cellCount = cellCount;
        this.transplantable = transplantable;
        this.disease = disease;
        this.specialist = specialist;
        this.efficiencyLevel = efficiencyLevel;
        this.healthStatus = healthStatus;
    }

    void aboutOrgan() {

        System.out.println("Organ ID: " + organId);
        System.out.println("Organ Name: " + organName);
        System.out.println("Body System: " + bodySystem);
        System.out.println("Weight: " + weight );
        System.out.println("Function: " + function);
        System.out.println("Vital Organ: " + vital);
        System.out.println("Location: " + location);
        System.out.println("Length: " + length);
        System.out.println("Width: " + width );
        System.out.println("Height: " + height);
        System.out.println("Blood Type Support: " + bloodTypeSupport);
        System.out.println("Paired Organ: " + paired);
        System.out.println("Shape: " + shape);
        System.out.println("Color: " + color);
        System.out.println("Cell Count: " + cellCount);
        System.out.println("Transplantable: " + transplantable);
        System.out.println("Disease: " + disease);
        System.out.println("Specialist: " + specialist);
        System.out.println("Efficiency Level: " + efficiencyLevel );
        System.out.println("Health Status: " + healthStatus);
        System.out.println("----------------------------");
    }
}