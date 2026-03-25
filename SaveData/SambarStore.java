class SambarStore
{
    Sambar[] list;
    int index = 0;

    SambarStore(Sambar[] list)
    {
        this.list = list;
    }

    void save(Sambar sambar)
    {
        System.out.println("Saving sambar in list array");

        if(this.list!= null && sambar!= null)
        {
            int last=this.list.length -1;

            if(index <= last)
            {
                this.list[this.index] = sambar;
                System.out.println("Saved at position:" + this.index);
                this.index++;

                sambar.showDetails();
            }
            else
            {
                System.out.println("List storage is full");
            }
        }
        else
        {
            System.out.println("List array or sambar is null");
        }
    }
}