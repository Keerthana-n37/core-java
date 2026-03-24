class FestivalStore
{
    Festival[] festivalList;
    int startIndex=0;

    FestivalStore(Festival[] festivalList)
    {
        this.festivalList=festivalList;
    }

    void saveFestival(Festival festival)
    {
        System.out.println("Running saveFestival method");
        if(this.festivalList != null && festival!= null)
        {
            System.out.println("Festival array is ready");
            int lastIndex = this.festivalList.length - 1;
            if(startIndex <= lastIndex)
            {
                this.festList[this.startIndex] = festival;
                System.out.println("Festival stored at index: " + this.startIndex);
                this.startIndex++;

                festival.showFestivalDetails();
            }
            else
            {
                System.out.println("Festival storage is full");
            }
        }
        else
        {
            System.out.println("Festival array or object is null");
        }
    }
}