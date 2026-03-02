class Office {

    int officeId;
    String officeName;
    String location;
    int totalEmployees;
    String managerName;
    boolean open;
    String officeType;
    int totalDepartments;
    double area; 
    boolean cafeteriaAvailable;
    boolean parkingAvailable;
    int totalFloors;
    String workingHours;
    String companyName;
    boolean wifiAvailable;
    int meetingRooms;
    String securityLevel;
    String establishedYear;
    double rating;
    String status;

    Office(int officeId, String officeName, String location,
           int totalEmployees, String managerName, boolean open,
           String officeType, int totalDepartments, double area,
           boolean cafeteriaAvailable, boolean parkingAvailable,
           int totalFloors, String workingHours, String companyName,
           boolean wifiAvailable, int meetingRooms,
           String securityLevel, String establishedYear,
           double rating, String status) {

        this.officeId = officeId;
        this.officeName = officeName;
        this.location = location;
        this.totalEmployees = totalEmployees;
        this.managerName = managerName;
        this.open = open;
        this.officeType = officeType;
        this.totalDepartments = totalDepartments;
        this.area = area;
        this.cafeteriaAvailable = cafeteriaAvailable;
        this.parkingAvailable = parkingAvailable;
        this.totalFloors = totalFloors;
        this.workingHours = workingHours;
        this.companyName = companyName;
        this.wifiAvailable = wifiAvailable;
        this.meetingRooms = meetingRooms;
        this.securityLevel = securityLevel;
        this.establishedYear = establishedYear;
        this.rating = rating;
        this.status = status;
    }

    void aboutOffice() {

        System.out.println("Office ID: " + officeId);
        System.out.println("Office Name: " + officeName);
        System.out.println("Location: " + location);
        System.out.println("Total Employees: " + totalEmployees);
        System.out.println("Manager Name: " + managerName);
        System.out.println("Open: " + open);
        System.out.println("Office Type: " + officeType);
        System.out.println("Total Departments: " + totalDepartments);
        System.out.println("Area: " + area );
        System.out.println("Cafeteria Available: " + cafeteriaAvailable);
        System.out.println("Parking Available: " + parkingAvailable);
        System.out.println("Total Floors: " + totalFloors);
        System.out.println("Working Hours: " + workingHours);
        System.out.println("Company Name: " + companyName);
        System.out.println("WiFi Available: " + wifiAvailable);
        System.out.println("Meeting Rooms: " + meetingRooms);
        System.out.println("Security Level: " + securityLevel);
        System.out.println("Established Year: " + establishedYear);
        System.out.println("Rating: " + rating);
        System.out.println("Status: " + status);
        System.out.println("----------------------------");
    }
}