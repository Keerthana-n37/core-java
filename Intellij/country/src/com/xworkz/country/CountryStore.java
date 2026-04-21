package com.xworkz.country;

public class CountryStore {

    Country[] countries= new Country[10];
    int index=0;

    void save(Country country)
    {
        if(country!=null)
        {
            if(index<countries.length)
            {
                countries[this.index]=country;
                System.out.println("Country saved at index:"+this.index);
                this.index++;
            }else {
                System.out.println("countries array is full");
            }
        }else {
            System.out.println("Array or country is null, cannot save");
        }
    }


    Country findByName(String name)
    {
        System.out.println("Executing findByName in CountryStore");

        if(this.countries!=null && name!=null)
        {
            for(Country country:this.countries)
            {
                if(country!=null && country.name!=null)
                {
                    if(country.name.equals(name))
                    {
                        System.out.println("country found:"+name);
                        return country;
                    }
                }
            }
        }else {
            System.out.println("Array or name is null");
        }
        System.out.println("country not found");
        return null;
    }

    State findStateByStateName(String name)
    {
        System.out.println("Executing findStateByStateName...");

        if(this.countries!=null && name!=null)
        {
            for(Country country:this.countries){
                if(country!=null && country.states!=null)
                {
                    for(State state:country.states){
                        if(state!=null && state.name!=null){
                            if(state.name.equals(name)){
                                System.out.println("state found:"+name);
                                return state;
                            }
                        }
                    }
                }
            }
        }else {
            System.out.println("invalid input");
        }
        System.out.println("state not found");
        return null;
    }

    int findNoOfDistrictsByCityName(String name)
    {
        System.out.println("Executing findNoOfDistrictsByCityName...");

        if(this.countries!=null && name!=null)
        {
            for(Country country:this.countries) {
                if (country != null && country.states != null) {
                    for (State state : country.states) {
                        if (state != null && state.cities != null) {
                            for (City city : state.cities) {
                                if (city != null && city.name != null) {
                                    if (city.name.equals(name)) {
                                        System.out.println("city found:" + name);
                                        return city.noOfDistricts;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        else{
            System.out.println("invalid input");
        }
        System.out.println("City not found");
        return 0;
    }
}
