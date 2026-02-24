class FlightRunner {
    public static void main(String[] args) {

        Flight f1 = new Flight();
        System.out.println("Flight Number: " + f1.flightNumber);
        System.out.println("Airline Name: " + f1.airlineName);
        System.out.println("Source: " + f1.source);
        System.out.println("Destination: " + f1.destination);
        System.out.println("Re-initialising flight details");
        f1.flightNumber = "AI101";
        f1.airlineName = "Air India";
        f1.source = "Bangalore";
        f1.destination = "Delhi";
        System.out.println("Flight Number: " + f1.flightNumber);
        System.out.println("Airline Name: " + f1.airlineName);
        System.out.println("Source: " + f1.source);
        System.out.println("Destination: " + f1.destination);
        System.out.println("------------------------------");

        Flight f2 = new Flight();
		System.out.println("Flight Number: " + f2.flightNumber);
        System.out.println("Airline Name: " + f2.airlineName);
        System.out.println("Source: " + f2.source);
        System.out.println("Destination: " + f2.destination);
        System.out.println("Re-initialising flight details");
        f2.flightNumber = "6E202";
		f2.airlineName = "IndiGo"; 
		f2.source = "Mumbai";
		f2.destination = "Chennai";
        System.out.println("Flight Number: " + f2.flightNumber);
        System.out.println("Airline Name: " + f2.airlineName);
        System.out.println("Source: " + f2.source);
        System.out.println("Destination: " + f2.destination);
        System.out.println("------------------------------");

        Flight f3 = new Flight();
		System.out.println("Flight Number: " + f3.flightNumber);
        System.out.println("Airline Name: " + f3.airlineName);
        System.out.println("Source: " + f3.source);
        System.out.println("Destination: " + f3.destination);
        System.out.println("Re-initialising flight details");
        f3.flightNumber = "SG303"; 
		f3.airlineName = "SpiceJet"; 
		f3.source = "Delhi"; 
		f3.destination = "Kolkata";
        System.out.println("Flight Number: " + f3.flightNumber);
        System.out.println("Airline Name: " + f3.airlineName);
        System.out.println("Source: " + f3.source);
        System.out.println("Destination: " + f3.destination);
        System.out.println("------------------------------");

        Flight f4 = new Flight();
		System.out.println("Flight Number: " + f4.flightNumber);
        System.out.println("Airline Name: " + f4.airlineName);
        System.out.println("Source: " + f4.source);
        System.out.println("Destination: " + f4.destination);
        System.out.println("Re-initialising flight details");
        f4.flightNumber = "UK404"; 
		f4.airlineName = "Vistara";
		f4.source = "Bangalore";
		f4.destination = "Hyderabad";
        System.out.println("Flight Number: " + f4.flightNumber);
        System.out.println("Airline Name: " + f4.airlineName);
        System.out.println("Source: " + f4.source);
        System.out.println("Destination: " + f4.destination);
        System.out.println("------------------------------");

        Flight f5 = new Flight();
		System.out.println("Flight Number: " + f5.flightNumber);
        System.out.println("Airline Name: " + f5.airlineName);
        System.out.println("Source: " + f5.source);
        System.out.println("Destination: " + f5.destination);
        System.out.println("Re-initialising flight details");
        f5.flightNumber = "AI505";
		f5.airlineName = "Air India"; 
		f5.source = "Chennai"; 
		f5.destination = "Delhi";
        System.out.println("Flight Number: " + f5.flightNumber);
        System.out.println("Airline Name: " + f5.airlineName);
        System.out.println("Source: " + f5.source);
        System.out.println("Destination: " + f5.destination);
        System.out.println("------------------------------");
    }
}