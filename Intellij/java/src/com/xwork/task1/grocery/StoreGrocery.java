package com.xwork.task1.grocery;

public class StoreGrocery {

    Grocery[] items;
    int currentIndex;

    StoreGrocery(Grocery[] items)
    {
        this.items = items;
    }

    void storeGrocery(Grocery item) {
        System.out.println("Executing storeGrocery in StoreGrocery");

        if (this.items != null) {
            int size = this.items.length - 1;

            if (this.currentIndex <= size) {
                this.items[currentIndex] = item;

                System.out.println("Stored at index: " + this.currentIndex);
                currentIndex++;
            } else {
                System.out.println("Array is full, cannot store");
            }
        } else {
            System.out.println("Array is not pointing to memory");
        }
    }

    boolean searchByName(String name)
    {
        if (name != null) {
            System.out.println("Searching for item: " + name);

            if (this.items != null)
            {
                for (Grocery item : this.items) {
                    if (item != null && item.itemName.equals(name)) {
                        System.out.println("Found at index: " + currentIndex);
                        item.displayInfo();
                        return true;
                    }
                    currentIndex++;
                }
                System.out.println("Item not found");
            }
        }
        return false;
    }

    boolean update(String oldName, String newName)
    {
        if(this.items != null)
        {
            if(oldName != null && newName != null)
            {
                for(Grocery item : this.items)
                {
                    if(item != null && item.itemName.equals(oldName))
                    {
                        item.itemName = newName;
                        System.out.println("Updated at index: " + currentIndex);
                        return true;
                    }
                    currentIndex++;
                }
                System.out.println("Old item not found");
            }
        }
        return false;
    }
}
