package com.xworkz.override.slipper;

public class SportSlipper extends Slipper{

    boolean isWaterproof;
    String type;

    SportSlipper(int size,String color,double price,String[] features,Brand brand,Manufacturer manufacturer,boolean isWaterproof,String type)
    {
        super(size,color,price,features,brand,manufacturer);
        this.isWaterproof=isWaterproof;
        this.type=type;
    }

    @Override
    void wear() {
        System.out.println("Executing wear method in SportSlipper");
    }

    @Override
    void remove() {
        System.out.println("Executing remove method in SportSlipper");
    }

    void showType()
    {
        System.out.println("Executing showType in SportSlipper,Type:"+type);
    }

    public String toString()
    {
        return "SportSlipper:"+"isWaterproof:"+isWaterproof+",type:"+type+super.toString();
    }
}
