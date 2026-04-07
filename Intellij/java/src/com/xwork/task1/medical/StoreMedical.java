package com.xwork.task1.medical;

public class StoreMedical {

    Medical[] medicines;
    int currentIndex;

    StoreMedical(Medical[] medicines)
    {
        this.medicines = medicines;
    }

    void storeMedical(Medical medical) {
        System.out.println("Executing storeMedical in StoreMedical");

        if (this.medicines != null) {
            int size = this.medicines.length - 1;

            if (this.currentIndex <= size) {
                this.medicines[currentIndex] = medical;

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
            System.out.println("Searching for medicine: " + name);

            if (this.medicines != null)
            {
                for (Medical med : this.medicines) {
                    if (med != null && med.name.equals(name)) {
                        System.out.println("Found at index: " + this.currentIndex);
                        med.displayInfo();
                        return true;
                    }
                    this.currentIndex++;
                }
                System.out.println("Medicine not found");
            }
        }
        return false;
    }

    boolean update(String oldName, String newName)
    {
        if(this.medicines != null)
        {
            if(oldName != null && newName != null)
            {
                for(Medical med : this.medicines)
                {
                    if(med != null && med.name.equals(oldName))
                    {
                        med.name = newName;
                        System.out.println("Updated at index: " + this.currentIndex);
                        return true;
                    }
                    this.currentIndex++;
                }
                System.out.println("Old medicine not found");
            }
        }
        return false;
    }
}
