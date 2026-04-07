package com.xwork.task1.toy;

public class StoreToy {

    Toy[] toys;
    int currentIndex;

    StoreToy(Toy[] toys)
    {
        this.toys=toys;
    }

    void storeToy(Toy toy) {
        System.out.println("Executing storeTy in StoreToy");

        if (this.toys != null) {
            int size = this.toys.length - 1;

            if (this.currentIndex <= size) {
                this.toys[currentIndex] = toy;

                System.out.println("Toys stored at index: " + this.currentIndex);
                currentIndex++;
            } else {
                System.out.println("Array is full, cannot store");
            }
        } else {
            System.out.println("Array is not pointing to memory");
        }
    }

   boolean searchByTheme(String theme)
   {
        if (theme != null) {
            System.out.println("Searching for theme: " + theme);

            if (this.toys != null)
            {

                for (Toy toy : this.toys) {
                    if (toy != null &&  toy.theme==theme) {
                        System.out.println("Found at index: " + currentIndex);
                        toy.displayToy();
                        return true;
                    }
                    currentIndex++;
                }
                System.out.println("Theme not found");
            }
        }
        return false;
   }

  boolean update(String oldTheme,String newTheme)
  {
      if(this.toys!=null)
      {
          if(oldTheme !=null && newTheme !=null)
          {
              for(Toy  toys: this.toys)
              {
                  if(toys != null && toys.theme==oldTheme)
                  {
                      toys.theme= newTheme;
                      System.out.println("updated at index: "+currentIndex);
                      return true;
                  }
                  currentIndex++;
              }
              System.out.println("Old theme not found");
          }
      }return  false;
  }

}
