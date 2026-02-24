class Runner {
    public static void main(String[] args) {

        String suitcaseBrand;
        int suitcaseCapacity;
        String suitcaseColor;
        double suitcasePrice;
        boolean suitcaseWheels;
		
		suitcaseBrand = Suitcase.brand();
		suitcaseCapacity = Suitcase.capacity();
		suitcaseColor = Suitcase.color();
		suitcasePrice = Suitcase.price();
		suitcaseWheels = Suitcase.hasWheels();
		
        System.out.println("Information about the suitcase...");
        System.out.println("SuitcaseBrand"+suitcaseBrand);
        System.out.println("SuitcaseCapacity" +suitcaseCapacity);
        System.out.println("SuitcaseColor"+suitcaseColor);
        System.out.println("SuitcasePrice"+suitcasePrice);
        System.out.println("SuitcaseWheels"+suitcaseWheels);
		System.out.println("----------------------");

        String bulletType;
		double bulletWeight;
		String bulletMaterial;
		double bulletSpeed;
		boolean bulletExplosive;

		bulletType = Bullet.type();
		bulletWeight = Bullet.weight();
		bulletMaterial = Bullet.material();
		bulletSpeed = Bullet.speed();
		bulletExplosive = Bullet.isExplosive();

		System.out.println("Information about the Bullet...");
		System.out.println("BulletType " + bulletType);
		System.out.println("BulletWeight " + bulletWeight);
		System.out.println("BulletMaterial " + bulletMaterial);
		System.out.println("BulletSpeed " + bulletSpeed);
		System.out.println("BulletExplosive " + bulletExplosive);
		System.out.println("----------------------");

        String fireColor;
		int fireTemp;
		boolean fireHot;
		String fireSource;
		String fireUsage;

		fireColor = Fire.color();
		fireTemp = Fire.temperature();
		fireHot = Fire.isHot();
		fireSource = Fire.source();
		fireUsage = Fire.usage();

		System.out.println("Information about the Fire...");
		System.out.println("FireColor " + fireColor);
		System.out.println("FireTemperature " + fireTemp);
		System.out.println("FireHot " + fireHot);
		System.out.println("FireSource " + fireSource);
		System.out.println("FireUsage " + fireUsage);
		System.out.println("----------------------");
		
		
		String waterState;
		double waterBoiling;
		double waterFreezing;
		boolean waterDrink;
		String waterSource;

		waterState = Water.state();
		waterBoiling = Water.boilingPoint();
		waterFreezing = Water.freezingPoint();
		waterDrink = Water.isDrinkable();
		waterSource = Water.source();

		System.out.println("Information about the Water...");
		System.out.println("WaterState " + waterState);
		System.out.println("WaterBoilingPoint " + waterBoiling);
		System.out.println("WaterFreezingPoint " + waterFreezing);
		System.out.println("WaterDrinkable " + waterDrink);
		System.out.println("WaterSource " + waterSource);
		System.out.println("----------------------");

		String crownMaterial;
		double crownWeight;
		int crownJewels;
		String crownOwner;
		boolean crownValuable;

		crownMaterial = Crown.material();
		crownWeight = Crown.weight();
		crownJewels = Crown.jewelsCount();
		crownOwner = Crown.owner();
		crownValuable = Crown.isValuable();

		System.out.println("Information about the Crown...");
		System.out.println("CrownMaterial " + crownMaterial);
		System.out.println("CrownWeight " + crownWeight);
		System.out.println("CrownJewels " + crownJewels);
		System.out.println("CrownOwner " + crownOwner);
		System.out.println("CrownValuable " + crownValuable);
		System.out.println("----------------------");


		String towelMaterial;
		String towelColor;
		double towelLength;
		boolean towelSoft;
		String towelBrand;

		towelMaterial = Towel.material();
		towelColor = Towel.color();
		towelLength = Towel.length();
		towelSoft = Towel.isSoft();
		towelBrand = Towel.brand();

		System.out.println("Information about the Towel...");
		System.out.println("TowelMaterial " + towelMaterial);
		System.out.println("TowelColor " + towelColor);
		System.out.println("TowelLength " + towelLength);
		System.out.println("TowelSoft " + towelSoft);
		System.out.println("TowelBrand " + towelBrand);
		System.out.println("----------------------");
		
	    String ladderMaterial;
		int ladderSteps;
		double ladderHeight;
		boolean ladderFoldable;
		String ladderBrand;

		ladderMaterial = Ladder.material();
		ladderSteps = Ladder.steps();
		ladderHeight = Ladder.height();
		ladderFoldable = Ladder.isFoldable();
		ladderBrand = Ladder.brand();

		System.out.println("Information about the Ladder...");
		System.out.println("LadderMaterial " + ladderMaterial);
		System.out.println("LadderSteps " + ladderSteps);
		System.out.println("LadderHeight " + ladderHeight);
		System.out.println("LadderFoldable " + ladderFoldable);
		System.out.println("LadderBrand " + ladderBrand);
		System.out.println("----------------------");
	

        String benchMaterial;
		int benchCapacity;
		String benchColor;
		double benchPrice;
		boolean benchOutdoor;

		benchMaterial = Bench.material();
		benchCapacity = Bench.seatingCapacity();
		benchColor = Bench.color();
		benchPrice = Bench.price();
		benchOutdoor = Bench.isOutdoor();

		System.out.println("Information about the Bench...");
		System.out.println("BenchMaterial " + benchMaterial);
		System.out.println("BenchCapacity " + benchCapacity);
		System.out.println("BenchColor " + benchColor);
		System.out.println("BenchPrice " + benchPrice);
		System.out.println("BenchOutdoor " + benchOutdoor);
		System.out.println("----------------------");

 
		String tabletBrand;
		String tabletModel;
		int tabletStorage;
		boolean tabletStylus;
		double tabletPrice;

		tabletBrand = Tablet.brand();
		tabletModel = Tablet.model();
		tabletStorage = Tablet.storage();
		tabletStylus = Tablet.hasStylus();
		tabletPrice = Tablet.price();

		System.out.println("Information about the Tablet...");
		System.out.println("TabletBrand " + tabletBrand);
		System.out.println("TabletModel " + tabletModel);
		System.out.println("TabletStorage " + tabletStorage);
		System.out.println("TabletStylus " + tabletStylus);
		System.out.println("TabletPrice " + tabletPrice);
		System.out.println("----------------------");
		
		String grenadeType;
		double grenadeWeight;
		String grenadeColor;
		boolean grenadeReusable;
		String grenadeOrigin;

		grenadeType = Grenade.type();
		grenadeWeight = Grenade.weight();
		grenadeColor = Grenade.color();
		grenadeReusable = Grenade.isReusable();
		grenadeOrigin = Grenade.origin();

		System.out.println("Information about the Grenade...");
		System.out.println("GrenadeType " + grenadeType);
		System.out.println("GrenadeWeight " + grenadeWeight);
		System.out.println("GrenadeColor " + grenadeColor);
		System.out.println("GrenadeReusable " + grenadeReusable);
		System.out.println("GrenadeOrigin " + grenadeOrigin);
		System.out.println("----------------------");

		String stabilizerBrand;
		int stabilizerCapacity;
		boolean stabilizerAuto;
		double stabilizerPrice;
		String stabilizerUsage;

		stabilizerBrand = Stabilizer.brand();
		stabilizerCapacity = Stabilizer.capacity();
		stabilizerAuto = Stabilizer.isAutomatic();
		stabilizerPrice = Stabilizer.price();
		stabilizerUsage = Stabilizer.usage();

		System.out.println("Information about the Stabilizer...");
		System.out.println("StabilizerBrand " + stabilizerBrand);
		System.out.println("StabilizerCapacity " + stabilizerCapacity);
		System.out.println("StabilizerAutomatic " + stabilizerAuto);
		System.out.println("StabilizerPrice " + stabilizerPrice);
		System.out.println("StabilizerUsage " + stabilizerUsage);
		System.out.println("----------------------");

    }
}
