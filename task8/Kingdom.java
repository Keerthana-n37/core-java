class Kingdom {

    static void save(
            boolean king,
            String name,
            String kingdomName,
            String queenName,
            String princessName,
            int populationOfKingdom,
            String territory,
            int yearOfBirth,
            int yearOfDeath,
            int armySize,
            int yearsRuled) {

        System.out.println("King: " + king);
        System.out.println("King Name: " + name);
        System.out.println("Kingdom Name: " + kingdomName);
        System.out.println("Queen Name: " + queenName);
        System.out.println("Princess Name: " + princessName);
        System.out.println("Population: " + populationOfKingdom);
        System.out.println("Territory: " + territory);
        System.out.println("Year Of Birth: " + yearOfBirth);
        System.out.println("Year Of Death: " + yearOfDeath);
        System.out.println("Army Size: " + armySize);
        System.out.println("Years Ruled: " + yearsRuled);

        if (king == false) {
            System.out.println("If it is false , it's a queen");
            return;
        }
        if (name == null) {
            System.out.println("Data is invalid, King Name is null");
            return;
        }
        if (kingdomName == null) {
            System.out.println("Data is invalid, Kingdom Name is null");
            return;
        }
        if (queenName == null) {
            System.out.println("Data is invalid, Queen Name is null");
            return;
        }
        if (princessName == null) {
            System.out.println("Data is invalid, Princess Name is null");
            return;
        }
        if (populationOfKingdom <= 0) {
            System.out.println("Data is invalid, Population must be > 0");
            return;
        }
        if (territory == null) {
            System.out.println("Data is invalid, Territory is null");
            return;
        }
        if (yearOfBirth <= 0) {
            System.out.println("Data is invalid, Year Of Birth");
            return;
        }
        if (yearOfDeath <= 0) {
            System.out.println("Data is invalid, Year Of Death");
            return;
        }
        if (armySize <= 0) {
            System.out.println("Data is invalid, Army Size");
            return;
        }
        if (yearsRuled <= 0) {
            System.out.println("Data is invalid, Years Ruled");
            return;
        }

        System.out.println("Data is Valid ");
    }
	
	

    static void saveArmy(
            int noOfSoldiers,
            int noOfElephants,
            int noOfHorses,
            String type,
            int noOfWeapons,
            String commanderName,
            boolean commanderMarried,
            String commanderWifeName,
            boolean commanderIsFather,
            String commanderChildName,
            int commanderExperience) {

        System.out.println("No Of Soldiers: " + noOfSoldiers);
        System.out.println("No Of Elephants: " + noOfElephants);
        System.out.println("No Of Horses: " + noOfHorses);
        System.out.println("Army Type: " + type);
        System.out.println("No Of Weapons: " + noOfWeapons);
        System.out.println("Commander Name: " + commanderName);
        System.out.println("Commander Married: " + commanderMarried);
        System.out.println("Commander Wife Name: " + commanderWifeName);
        System.out.println("Commander Is Father: " + commanderIsFather);
        System.out.println("Commander Child Name: " + commanderChildName);
        System.out.println("Commander Experience: " + commanderExperience);

        if (noOfSoldiers <= 0) {
            System.out.println("Data is invalid, Soldiers must be greater than 0");
            return;
        }
        if (noOfElephants < 0) {
            System.out.println("Data is invalid, Elephants count");
            return;
        }
        if (noOfHorses < 0) {
            System.out.println("Data is invalid, Horses count");
            return;
        }
        if (type == null) {
            System.out.println("Data is invalid, Army Type is null");
            return;
        }
        if (noOfWeapons <= 0) {
            System.out.println("Data is invalid, Weapons must be greater than 0");
            return;
        }
        if (commanderName == null) {
            System.out.println("Data is invalid, Commander Name is null");
            return;
        }

        if (commanderMarried == true) {
            if (commanderWifeName == null) {
                System.out.println("Data is invalid, Commander Wife Name is null");
                return;
            }
        }

        if (commanderIsFather == true) {
            if (commanderChildName == null) {
                System.out.println("Data is invalid, Commander Child Name is null");
                return;
            }
        }

        if (commanderExperience < 0) {
            System.out.println("Data is invalid, Commander Experience");
            return;
        }

        System.out.println("Army Data is Valid ");
		System.out.println("----------------------");
    }
}

