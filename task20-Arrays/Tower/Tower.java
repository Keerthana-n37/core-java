class Tower
{
    int[] totalRooms;        
    Security[] securities;   

    Tower(int[] totalRooms, Security[] securities)
    {
        this.totalRooms = totalRooms;
        this.securities = securities;
    }

    void display()
    {
        System.out.println("Tower Information:");

        if(this.totalRooms!= null)
        {
            System.out.println("Total Floors: " + this.totalRooms.length);
            for(int rooms : this.totalRooms)
            {
                System.out.println("Rooms on Floor: " +rooms);
            }
        }
        else
        {
            System.out.println("totalRooms is null");
        }

        if(this.securities != null)
        {
            System.out.println("Total Security Staff: " +this.securities.length);
            for(Security security: this.securities)
            {
                System.out.println("Name: " + security.name);
                System.out.println("Shift Hours: " + security.shiftHours);
            }
        }
        else
        {
            System.out.println("securities are null");
        }
    }
}