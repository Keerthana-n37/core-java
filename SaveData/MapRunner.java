class MapRunner
{
    public static void main(String[] args)
    {
        Map[] maps = new Map[10];
        MapStore mapStore = new MapStore(maps);

        Map map1 = new Map("World Atlas","World","Political",1.5,2018,true);
        Map map2 = new Map("India Road Guide","India","Road",2.0,2020,false);
        Map map3 = new Map("Asia Overview","Asia","Geographical",1.2,2017,true);
        Map map4 = new Map("India Travel","India","Tourist",1.8,2019,false);
        Map map5 = new Map("Karnataka State Map","India","State",1.1,2021,true);
        Map map6 = new Map("India Regions","India","Guide Map",2.5,2016,false);
        Map map7 = new Map("Physical Map","Africa","Physical",1.4,2015,true);
        Map map8 = new Map("Tourist Map","Singapore","Tourist",1.9,2022,false);
        Map map9 = new Map("Railway Route Map","India","Transport",2.2,2018,true);
        Map map10 = new Map("World Map","World","Historical",1.0,2014,false);

        mapStore.saveMap(map1);
        mapStore.saveMap(map2);
        mapStore.saveMap(map3);
        mapStore.saveMap(map4);
        mapStore.saveMap(map5);
        mapStore.saveMap(map6);
        mapStore.saveMap(map7);
        mapStore.saveMap(map8);
        mapStore.saveMap(map9);
        mapStore.saveMap(map10);
    }
}