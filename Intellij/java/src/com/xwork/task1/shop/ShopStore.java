package com.xwork.task1.shop;

public class ShopStore {

    Shop[] shops;
    int currentIndex;

    ShopStore(Shop[] shops)
    {
        this.shops = shops;
    }

    void storeShop(Shop shop) {
        System.out.println("Executing storeShop in StoreShop");

        if (this.shops != null) {
            int size = this.shops.length - 1;

            if (this.currentIndex <= size) {
                this.shops[currentIndex] = shop;

                System.out.println("Shops stored at index: " + this.currentIndex);
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
            System.out.println("Searching for shop name: " + name);

            if (this.shops != null)
            {
                for (Shop shop : this.shops) {
                    if (shop != null && shop.name.equals(name)) {
                        System.out.println("Found at index: " + currentIndex);
                        shop.displayInfo();
                        return true;
                    }
                    currentIndex++;
                }
                System.out.println("Shop not found");
            }
        }
        return false;
    }

    boolean update(String oldName, String newName)
    {
        if(this.shops != null)
        {
            if(oldName != null && newName != null)
            {
                for(Shop shop : this.shops)
                {
                    if(shop != null && shop.name.equals(oldName))
                    {
                        shop.name = newName;
                        System.out.println("updated at index: " + currentIndex);
                        return true;
                    }
                    currentIndex++;
                }
                System.out.println("Old name not found");
            }
        }
        return false;
    }
}
