class AcidStore
{
    Acid[] acidList;
    int currentIndex =0;

    AcidStore(Acid[] acidList)
    {
        this.acidList = acidList;
    }

    void saveAcid(Acid acid)
    {
        System.out.println("Running saveAcid method");

        if(this.acidList!= null && acid!= null)
        {
            int lastIndex =this.acidList.length-1;

            if(currentIndex <=lastIndex)
            {
                this.acidList[this.currentIndex]= acid;
                System.out.println("Acid saved at index: "+this.currentIndex);
                this.currentIndex++;

                acid.displayAcidDetials();
            }
            else
            {
                System.out.println("Acid storage is full");
            }
        }
        else
        {
            System.out.println("Acid array or acid is null");
        }
    }
}