class ScannerRunner
 {
    public static void main(String[] args) 
	{

        short[] scanSpeeds = {20, 25, 30};

        Document[] documents = new Document[3];
        documents[0] = new Document("Report", 10);
        documents[1] = new Document("Invoice", 5);
        documents[2] = new Document("Letter", 2);

        Scanner scanner = new Scanner(scanSpeeds, documents);
        scanner.display();
    }
}