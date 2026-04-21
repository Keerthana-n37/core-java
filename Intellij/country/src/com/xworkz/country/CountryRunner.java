package com.xworkz.country;

public class CountryRunner{

        public static void main(String[] args) {

            CountryStore store = new CountryStore();

            Collector collector1 = new Collector("Ravi Kumar", 2010);
            District district1 = new District("Bengaluru Urban", collector1);
            City city1 = new City("Bengaluru", 1, new District[]{district1});
            State state1 = new State("Karnataka", 68000000, new City[]{city1});
            Address address1 = new Address(101, 560001, state1);
            President president = new President("Droupadi Murmu", 66, address1);
            store.save(new Country("India", president, new State[]{state1}));

            Collector collector2 = new Collector("Amit Sharma", 2011);
            District district2 = new District("Mumbai", collector2);
            City city2 = new City("Mumbai", 1, new District[]{district2});
            State state2 = new State("Maharashtra", 120000000, new City[]{city2});
            Address address2 = new Address(102, 400001, state2);
            store.save(new Country("India", president, new State[]{state2}));

            Collector collector3 = new Collector("Suresh Iyer", 2012);
            District district3 = new District("Chennai", collector3);
            City city3 = new City("Chennai", 1, new District[]{district3});
            State state3 = new State("Tamil Nadu", 75000000, new City[]{city3});
            Address address3 = new Address(103, 600001, state3);
            store.save(new Country("India", president, new State[]{state3}));

            Collector collector4 = new Collector("Kiran Reddy", 2013);
            District district4 = new District("Hyderabad", collector4);
            City city4 = new City("Hyderabad", 1, new District[]{district4});
            State state4 = new State("Telangana", 40000000, new City[]{city4});
            Address address4 = new Address(104, 500001, state4);
            store.save(new Country("India", president, new State[]{state4}));

            Collector collector5 = new Collector("Anil Nair", 2014);
            District district5 = new District("Ernakulam", collector5);
            City city5 = new City("Kochi", 1, new District[]{district5});
            State state5 = new State("Kerala", 35000000, new City[]{city5});
            Address address5 = new Address(105, 682001, state5);
            store.save(new Country("India", president, new State[]{state5}));


            Collector collector6 = new Collector("Rahul Verma", 2015);
            District district6 = new District("New Delhi", collector6);
            City city6 = new City("Delhi", 1, new District[]{district6});
            State state6 = new State("Delhi", 20000000, new City[]{city6});
            Address address6 = new Address(106, 110001, state6);
            store.save(new Country("India", president, new State[]{state6}));

            Collector collector7 = new Collector("Vijay Patel", 2016);
            District district7 = new District("Ahmedabad", collector7);
            City city7 = new City("Ahmedabad", 1, new District[]{district7});
            State state7 = new State("Gujarat", 70000000, new City[]{city7});
            Address address7 = new Address(107, 380001, state7);
            store.save(new Country("India", president, new State[]{state7}));

            Collector collector8 = new Collector("Deepak Singh", 2017);
            District district8 = new District("Jaipur", collector8);
            City city8 = new City("Jaipur", 1, new District[]{district8});
            State state8 = new State("Rajasthan", 80000000, new City[]{city8});
            Address address8 = new Address(108, 302001, state8);
            store.save(new Country("India", president, new State[]{state8}));

            Collector collector9 = new Collector("Arindam Roy", 2018);
            District district9 = new District("Kolkata", collector9);
            City city9 = new City("Kolkata", 1, new District[]{district9});
            State state9 = new State("West Bengal", 90000000, new City[]{city9});
            Address address9 = new Address(109, 700001, state9);
            store.save(new Country("India", president, new State[]{state9}));

            Collector collector10 = new Collector("Manoj Yadav", 2019);
            District district10 = new District("Lucknow", collector10);
            City city10 = new City("Lucknow", 1, new District[]{district10});
            State state10 = new State("Uttar Pradesh", 230000000, new City[]{city10});
            Address address10 = new Address(110, 226001, state10);
            store.save(new Country("India", president, new State[]{state10}));

            System.out.println("-----------------------------------");

            Country country= store.findByName("India");
            if (country != null) {
                System.out.println("Result: " + country.name);
            }
            System.out.println("----------------------------------------");

            State state = store.findStateByStateName("Karnataka");
            if (state != null) {
                System.out.println("State Found: " + state.name);
            }
            System.out.println("-------------------------------------");

            int count = store.findNoOfDistrictsByCityName("Bengaluru");
            System.out.println("No of Districts in Bengaluru: " + count);
            System.out.println("---------------------------------------");

            Country country1 = store.findByCollectorName("Ravi Kumar");
            if (country1 != null) {
                System.out.println("Collector belongs to Country: " + country1.name);
            }
            System.out.println("-------------------------------------");


        }
}

