class CloudSoftwareRunner
{
    public static void main(String[] args)
    {
        CloudSoftware[] softwares = new CloudSoftware[10];
        CloudSoftwareStore store = new CloudSoftwareStore(softwares);

        CloudSoftware cloud1 =new CloudSoftware("DriveX","Google",10.0,100,true,"Windows/Mac");
        CloudSoftware cloud2 =new CloudSoftware("CloudBox","Dropbox",12.0,150,true,"Windows/Mac");
        CloudSoftware cloud3 =new CloudSoftware("OneSpace","Microsoft",15.0,200,true,"Windows/Mac");
        CloudSoftware cloud4 =new CloudSoftware("MegaCloud","MegaCorp",8.0,50,false,"Windows");
        CloudSoftware cloud5 =new CloudSoftware("SafeStore","Box",14.0,250,true,"Windows/Mac");
        CloudSoftware cloud6 =new CloudSoftware("SkyDrive","SkyTech",9.0,80,true,"Windows/Mac");
        CloudSoftware cloud7 =new CloudSoftware("WorkCloud","WorkSoft",20.0,500,true,"Windows/Mac/Linux");
        CloudSoftware cloud8 =new CloudSoftware("TeamDrive","TeamSoft",18.0,300,true,"Windows/Mac");
        CloudSoftware cloud9 =new CloudSoftware("FileHub","FileCorp",7.0,40,false,"Windows");
        CloudSoftware cloud10 =new CloudSoftware("DataVault","SecureInc",25.0,1000,true,"Windows/Mac/Linux");

        store.saveSoftware(cloud1);
        store.saveSoftware(cloud2);
        store.saveSoftware(cloud3);
        store.saveSoftware(cloud4);
        store.saveSoftware(cloud5);
        store.saveSoftware(cloud6);
        store.saveSoftware(cloud7);
        store.saveSoftware(cloud8);
        store.saveSoftware(cloud9);
        store.saveSoftware(cloud10);
    }
}