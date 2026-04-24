enum BatteryType 
{ 
    AA(1.5, "Small"),
    AAA(1.5, "Very Small"),
    C(1.5, "Medium"),
    D(1.5, "Large");

    private double voltage;
    private String size;

    BatteryType(double voltage, String size){
        this.voltage = voltage;
        this.size = size;
    }

    public double getVoltage(){
        return voltage;
    }

    public String getSize(){
        return size;
    }

}