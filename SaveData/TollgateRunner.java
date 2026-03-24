class TollgateRunner
{
    public static void main(String[] args)
    {
        Tollgate[] tolls = new Tollgate[10];
        TollgateStore store = new TollgateStore(tolls);

        Tollgate toll1 = new Tollgate("Sheshagirihalli Plaza","NH275",180,"Bengaluru‑Mysuru",true,4);
        Tollgate toll2 = new Tollgate("Sadahalli Plaza","NH44",120,"Devanahalli",true,4);
        Tollgate toll3 = new Tollgate("Bangalore‑Nelamangala","NH48",30,"Nelamangala",true,5);
        Tollgate toll4 = new Tollgate("Hoskote Toll","NH75",15,"Hoskote",true,3);
        Tollgate toll5 = new Tollgate("Airport Road Toll","NH44",100,"Bengaluru Airport",true,4);
        Tollgate toll6 = new Tollgate("Electronic City Toll","NH44",40,"Electronic City",true,2);
        Tollgate toll7 = new Tollgate("Attibele Toll","NH44",50,"Attibele",true,3);
        Tollgate toll8 = new Tollgate("Tumakuru Expressway Toll","NH48",60,"Tumakuru Road",true,5);
        Tollgate toll9 = new Tollgate("Mysore Expressway Toll","NH275",50,"Bidadi",true,4);
        Tollgate toll10 = new Tollgate("Expressway Service Toll","NH44",35,"Bommasandra",true,2);

        store.saveTollgate(toll1);
        store.saveTollgate(toll2);
        store.saveTollgate(toll3);
        store.saveTollgate(toll4);
        store.saveTollgate(toll5);
        store.saveTollgate(toll6);
        store.saveTollgate(toll7);
        store.saveTollgate(toll8);
        store.saveTollgate(toll9);
        store.saveTollgate(toll10);
    }
}