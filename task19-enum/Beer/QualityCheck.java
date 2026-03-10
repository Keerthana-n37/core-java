class QualityCheck
{
    String batchNumber;
    String expiryDate;
    String inspectionStatus;

    QualityCheck(String batchNumber, String expiryDate, String inspectionStatus) 
	{
        this.batchNumber = batchNumber;
        this.expiryDate = expiryDate;
        this.inspectionStatus = inspectionStatus;
    }

    void showQuality()
	{
        System.out.println("Batch Number:" +this.batchNumber);
        System.out.println("Expiry Date:" +this.expiryDate);
        System.out.println("Inspection Status:" +this.inspectionStatus);
    }
}