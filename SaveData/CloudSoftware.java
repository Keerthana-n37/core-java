class CloudSoftware
{
    String softwareName;
    String provider;
    double monthlyCost;
    int storageInGB;
    boolean supportsCollaboration;
    String supportedOS;

    CloudSoftware(String softwareName, String provider, double monthlyCost, int storageInGB, boolean supportsCollaboration, String supportedOS)
    {
        this.softwareName= softwareName;
        this.provider= provider;
        this.monthlyCost= monthlyCost;
        this.storageInGB= storageInGB;
        this.supportsCollaboration= supportsCollaboration;
        this.supportedOS= supportedOS;
    }

    void displaySoftwareDetails()
    {
        System.out.println("Executing displaySoftwareDetails in CloudSoftware");
        System.out.println("Software Name: " +this.softwareName);
        System.out.println("Provider: " +this.provider);
        System.out.println("Monthly Cost: " +this.monthlyCost);
        System.out.println("Storage: " +this.storageInGB);
        System.out.println("Supports Collaboration: " +this.supportsCollaboration);
        System.out.println("Supported OS: " +this.supportedOS);
        System.out.println("---------------------------");
    }
}