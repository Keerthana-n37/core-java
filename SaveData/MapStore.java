class MapStore
{
    Map[] mapRecords;
    int storeIndex = 0;

    MapStore(Map[] mapRecords)
    {
        this.mapRecords = mapRecords;
    }

    void saveMap(Map map)
    {
        System.out.println("Running saveMap method");

        if(this.mapRecords!= null && map!= null)
        {
            System.out.println("Array and Map object are not null");

            int position = this.mapRecords.length - 1;
            if(storeIndex <= position)
            {
                this.mapRecords[this.storeIndex] = map;
                System.out.println("Map saved at position: " + this.storeIndex);
                this.storeIndex++;
                map.displayMapDetails();
            }
            else
            {
                System.out.println("Storage full, cannot add more maps");
            }
        }
        else
        {
            System.out.println("Map array or map object is null");
        }
    }
}