class Organizer {

    int organizerId;
    String organizerName;
    String eventType;
    String companyName;
    String location;
    int totalEventsHandled;
    double experienceYears;
    boolean certified;
    String specialization;
    String contactNumber;
    String email;
    int teamSize;
    double rating;
    boolean available;
    String eventDate;
    String clientName;
    double budgetHandled;
    String serviceType;
    boolean internationalEvents;
    String status;

    Organizer(int organizerId, String organizerName, String eventType,
              String companyName, String location, int totalEventsHandled,
              double experienceYears, boolean certified, String specialization,
              String contactNumber, String email, int teamSize,
              double rating, boolean available, String eventDate,
              String clientName, double budgetHandled, String serviceType,
              boolean internationalEvents, String status) {

        this.organizerId = organizerId;
        this.organizerName = organizerName;
        this.eventType = eventType;
        this.companyName = companyName;
        this.location = location;
        this.totalEventsHandled = totalEventsHandled;
        this.experienceYears = experienceYears;
        this.certified = certified;
        this.specialization = specialization;
        this.contactNumber = contactNumber;
        this.email = email;
        this.teamSize = teamSize;
        this.rating = rating;
        this.available = available;
        this.eventDate = eventDate;
        this.clientName = clientName;
        this.budgetHandled = budgetHandled;
        this.serviceType = serviceType;
        this.internationalEvents = internationalEvents;
        this.status = status;
    }

    void aboutOrganizer() {

        System.out.println("Organizer ID: " + organizerId);
        System.out.println("Organizer Name: " + organizerName);
        System.out.println("Event Type: " + eventType);
        System.out.println("Company Name: " + companyName);
        System.out.println("Location: " + location);
        System.out.println("Total Events Handled: " + totalEventsHandled);
        System.out.println("Experience: " + experienceYears);
        System.out.println("Certified: " + certified);
        System.out.println("Specialization: " + specialization);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Email: " + email);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Rating: " + rating);
        System.out.println("Available: " + available);
        System.out.println("Event Date: " + eventDate);
        System.out.println("Client Name: " + clientName);
        System.out.println("Budget Handled: " + budgetHandled);
        System.out.println("Service Type: " + serviceType);
        System.out.println("International Events: " + internationalEvents);
        System.out.println("Status: " + status);
        System.out.println("----------------------------");
    }
}