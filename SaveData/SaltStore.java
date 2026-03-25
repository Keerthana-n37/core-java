class SaltStore
{
    Salt[] saltArray;
    int currentIndex = 0;

    SaltStore(Salt[] saltArray)
    {
        this.saltArray = saltArray;
    }

    void saveSalt(Salt salt)
    {
        System.out.println("Running saveSalt method");

        if(this.saltArray!= null && salt!= null)
        {
            int lastIndex =this.saltArray.length-1;

            if(currentIndex <= lastIndex)
            {
                this.saltArray[this.currentIndex] =salt;
                System.out.println("Salt stored at index: " +this.currentIndex);
                this.currentIndex++;

                salt.displaySaltDetails();
            }
            else
            {
                System.out.println("Salt storage is full");
            }
        }
        else
        {
            System.out.println("Salt array or salt is null cannot do save operation");
        }
    }
}