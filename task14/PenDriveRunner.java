class PenDriveRunner {
    public static void main(String[] args)
    {
        PenDrive penDrive1 = new PenDrive();
        penDrive1.brand = "SanDisk";
        penDrive1.model = "Ultra";
        penDrive1.price = 799;
        penDrive1.capacity = 64;
        penDrive1.color = "Black";
        penDrive1.type = "USB Flash";
        penDrive1.usbVersion = "USB 3.0";
        penDrive1.weight = 10;
        penDrive1.warranty = 5;
        penDrive1.encrypted = true;
        penDrive1.waterproof = true;
        penDrive1.shockproof = true;
        penDrive1.country = "India";
        penDrive1.serialNumber = "SD12345";
        penDrive1.fileSystem = "FAT32";
        penDrive1.working = true;
        penDrive1.manufactureDate = "01-01-2026";
        penDrive1.supportedOS = new String[]{"Windows", "Linux", "Mac"};
        penDrive1.features = new String[]{"High Speed", "Portable", "Compact"};
        penDrive1.compatibleDevices = new String[]{"Laptop", "Desktop", "Smart TV"};

        System.out.println("PenDrive1 Details:");
        System.out.println("Brand:" + penDrive1.brand);
        System.out.println("Model:" + penDrive1.model);
        System.out.println("Price:" + penDrive1.price);
        System.out.println("Capacity:" + penDrive1.capacity + "GB");
        System.out.println("Color:" + penDrive1.color);
        System.out.println("USB Version:" + penDrive1.usbVersion);
        System.out.println("Warranty:" + penDrive1.warranty);
        System.out.println("Working:" + penDrive1.working);

        System.out.println("Supported OS:");
        for(int index = 0; index < penDrive1.supportedOS.length; index++)
        {
            System.out.println(penDrive1.supportedOS[index]);
        }
        System.out.println("Features:");
        for(int index = 0; index < penDrive1.features.length; index++)
        {
            System.out.println(penDrive1.features[index]);
        }

        System.out.println("Compatible Devices:");
        for(int index = 0; index < penDrive1.compatibleDevices.length; index++)
        {
            System.out.println(penDrive1.compatibleDevices[index]);
        }

        System.out.println("-----------------");


        PenDrive penDrive2 = new PenDrive();
        penDrive2.brand = "HP";
        penDrive2.model = "X500";
        penDrive2.price = 699;
        penDrive2.capacity = 32;
        penDrive2.color = "Silver";
        penDrive2.type = "USB Flash";
        penDrive2.usbVersion = "USB 2.0";
        penDrive2.weight = 12;
        penDrive2.warranty = 3;
        penDrive2.encrypted = false;
        penDrive2.waterproof = false;
        penDrive2.shockproof = true;
        penDrive2.country = "India";
        penDrive2.serialNumber = "HP98765";
        penDrive2.fileSystem = "NTFS";
        penDrive2.working = true;
        penDrive2.manufactureDate = "05-01-2026";
        penDrive2.supportedOS = new String[]{"Windows", "Mac"};
        penDrive2.features = new String[]{"Lightweight", "Durable"};
        penDrive2.compatibleDevices = new String[]{"Laptop", "Desktop"};

        System.out.println("PenDrive2 Details:");
        System.out.println("Brand:" + penDrive2.brand);
        System.out.println("Model:" + penDrive2.model);
        System.out.println("Price:" + penDrive2.price);
        System.out.println("Capacity:" + penDrive2.capacity + "GB");
        System.out.println("Color:" + penDrive2.color);
        System.out.println("USB Version:" + penDrive2.usbVersion);
        System.out.println("Warranty:" + penDrive2.warranty);
        System.out.println("Working:" + penDrive2.working);
        System.out.println("Supported OS:");
        for(int index = 0; index < penDrive2.supportedOS.length; index++)
        {
            System.out.println(penDrive2.supportedOS[index]);
        }

        System.out.println("Features:");
        for(int index = 0; index < penDrive2.features.length; index++)
        {
            System.out.println(penDrive2.features[index]);
        }

        System.out.println("Compatible Devices:");
        for(int index = 0; index < penDrive2.compatibleDevices.length; index++)
        {
            System.out.println(penDrive2.compatibleDevices[index]);
        }

        System.out.println("-----------------");
    }
}