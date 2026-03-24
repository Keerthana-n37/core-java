class TollgateStore
{
    Tollgate[] tollList;
    int currentIndex=0;

    TollgateStore(Tollgate[] tollList)
    {
        this.tollList=tollList;
    }

    void saveTollgate(Tollgate toll)
    {
        System.out.println("Running saveTollgate method");

        if(this.tollList!= null && toll!= null)
        {
            System.out.println("Tollgate array is ready");

            int lastIndex =this.tollList.length-1;

            if(currentIndex <=lastIndex)
            {
                this.tollList[this.currentIndex] =toll;
                System.out.println("Tollgate saved at index: "+this.currentIndex);
                this.currentIndex++;
                toll.displayTollgateDetails();
            }
            else
            {
                System.out.println("Tollgate storage is full");
            }
        }
        else
        {
            System.out.println("Tollgate array or object is null");
        }
    }
}