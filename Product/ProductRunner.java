class ProductRunner
{
	public static void main(String[] args)
	{
		Product[] products = new Product[137];
		ProductStore store = new ProductStore(products);
		
		Product product1 = new Product("iPhone 15","Apple","12-09-2024",80000,ProductType.MOBILE,"Amazon",ProductWarranty.ONE_YEAR,false,101,"USA");
		Product product2 = new Product("Galaxy S24","Samsung","15-01-2024",75000,ProductType.MOBILE,"Flipkart",ProductWarranty.ONE_YEAR,false,102,"South Korea");
		Product product3 = new Product("Realme p4 pro","Realme","05-10-2025",72000,ProductType.MOBILE,"Flipkart",ProductWarranty.ONE_YEAR,false,103,"USA");
		Product product4 = new Product("Redmi Note 15","Xiaomi","20-02-2024",65000,ProductType.MOBILE,"Amazon",ProductWarranty.ONE_YEAR,false,104,"China");
		Product product5 = new Product("Redmi Note 13","Xiaomi","10-01-2025",18000,ProductType.MOBILE,"Amazon",ProductWarranty.ONE_YEAR,false,105,"China");

		Product product6 = new Product("MacBook Air M2","Apple","10-06-2026",115000,ProductType.LAPTOP,"Apple Store",ProductWarranty.ONE_YEAR,false,106,"USA");
		Product product7 = new Product("Dell Inspiron 15","Dell","02-02-2026",65000,ProductType.LAPTOP,"Dell Store",ProductWarranty.TWO_YEARS,false,107,"USA");
		Product product8 = new Product("HP Pavilion","HP","05-03-2026",62000,ProductType.LAPTOP,"HP Store",ProductWarranty.TWO_YEARS,false,108,"USA");
		Product product9 = new Product("Lenovo ThinkPad","Lenovo","11-02-2025",98000,ProductType.LAPTOP,"Lenovo Store",ProductWarranty.THREE_YEARS,false,109,"China");
		Product product10 = new Product("Asus ROG","Asus","15-03-2023",120000,ProductType.LAPTOP,"Amazon",ProductWarranty.THREE_YEARS,false,110,"Taiwan");

		Product product11 = new Product("TV","Sony","01-01-2025",90000,ProductType.ELECTRONICS,"Croma",ProductWarranty.TWO_YEARS,false,111,"Japan");
		Product product12 = new Product("TV","LG","11-02-2024",72000,ProductType.ELECTRONICS,"Reliance Digital",ProductWarranty.TWO_YEARS,false,112,"South Korea");
		Product product13 = new Product("TV","Samsung","08-03-2026",65000,ProductType.ELECTRONICS,"Flipkart",ProductWarranty.TWO_YEARS,false,113,"South Korea");
		Product product14 = new Product("Headphones","Boat","10-02-2024",2000,ProductType.ELECTRONICS,"Amazon",ProductWarranty.ONE_YEAR,false,114,"India");
		Product product15 = new Product("Speaker","JBL","03-02-2026",6000,ProductType.ELECTRONICS,"Amazon",ProductWarranty.ONE_YEAR,false,115,"USA");

		Product product16 = new Product("Shoes","Nike","01-01-2024",9000,ProductType.SPORTS,"Nike Store",ProductWarranty.NO_WARRANTY,false,116,"USA");
		Product product17 = new Product("Shoes","Puma","01-02-2025",7000,ProductType.SPORTS,"Myntra",ProductWarranty.NO_WARRANTY,false,117,"Germany");
		Product product18 = new Product("T Shirt","Adidas","02-02-2024",2500,ProductType.CLOTHING,"Myntra",ProductWarranty.NO_WARRANTY,false,118,"Germany");
		Product product19 = new Product("Jeans","Levis","10-02-2026",3500,ProductType.CLOTHING,"Myntra",ProductWarranty.NO_WARRANTY,false,119,"USA");
		Product product20 = new Product("Shirt","Raymond","14-02-2024",2800,ProductType.CLOTHING,"Reliance Trends",ProductWarranty.NO_WARRANTY,false,120,"India");

		Product product21 = new Product("Camera","Canon","05-01-2026",55000,ProductType.ELECTRONICS,"Amazon",ProductWarranty.TWO_YEARS,false,121,"Japan");
		Product product22 = new Product("Camera","Nikon","07-01-2025",60000,ProductType.ELECTRONICS,"Flipkart",ProductWarranty.TWO_YEARS,false,122,"Japan");
		Product product23 = new Product("Watch","Apple","02-02-2024",42000,ProductType.ELECTRONICS,"Apple Store",ProductWarranty.ONE_YEAR,false,123,"USA");
		Product product24 = new Product("Watch","Fossil","05-03-2023",12000,ProductType.ELECTRONICS,"Amazon",ProductWarranty.ONE_YEAR,false,124,"USA");
		Product product25 = new Product("Watch","Titan","08-03-2020",5000,ProductType.ELECTRONICS,"Titan Store",ProductWarranty.ONE_YEAR,false,125,"India");

		Product product26 = new Product("Aashirvaad Atta","ITC","01-01-2025",450,ProductType.GROCERY,"Reliance",ProductWarranty.NO_WARRANTY,false,126,"India");
		Product product27 = new Product("India Rice","KRBL","01-01-2024",1200,ProductType.GROCERY,"Reliance",ProductWarranty.NO_WARRANTY,false,127,"India");
		Product product28 = new Product("Amul Butter","Amul","01-01-2024",550,ProductType.GROCERY,"BigBasket",ProductWarranty.NO_WARRANTY,false,128,"India");
		Product product29 = new Product("Maggi Noodles","Nestle","01-01-2024",150,ProductType.GROCERY,"Amazon",ProductWarranty.NO_WARRANTY,false,129,"India");
		Product product30 = new Product("Parle G","Parle","01-01-2024",50,ProductType.GROCERY,"Reliance",ProductWarranty.NO_WARRANTY,false,130,"India");

		Product product31 = new Product("Table","Ikea","01-02-2025",7000,ProductType.FURNITURE,"Ikea Store",ProductWarranty.THREE_YEARS,false,131,"Sweden");
		Product product32 = new Product("Nilkamal Chair","Nilkamal","02-02-2024",2000,ProductType.FURNITURE,"Amazon",ProductWarranty.TWO_YEARS,false,132,"India");
		Product product33 = new Product("Urban Ladder Sofa","Urban Ladder","03-02-2025",35000,ProductType.FURNITURE,"Urban Ladder",ProductWarranty.FIVE_YEARS,false,133,"India");
		Product product34 = new Product("Sleepwell Bed","Sleepwell","05-02-2024",45000,ProductType.FURNITURE,"Pepperfry",ProductWarranty.FIVE_YEARS,false,134,"India");
		Product product35 = new Product("Sleepwell Mattress","Sleepwell","06-02-2024",18000,ProductType.FURNITURE,"Amazon",ProductWarranty.FIVE_YEARS,false,135,"India");

		Product product36 = new Product("Lakme Face Cream","Lakme","01-01-2025",350,ProductType.BEAUTY,"Nykaa",ProductWarranty.NO_WARRANTY,false,136,"India");
		Product product37 = new Product("Nivea Lotion","Nivea","01-01-2024",450,ProductType.BEAUTY,"Amazon",ProductWarranty.NO_WARRANTY,false,137,"Germany");
		Product product38 = new Product("Dove Soap","Dove","01-01-2026",120,ProductType.BEAUTY,"Flipkart",ProductWarranty.NO_WARRANTY,false,138,"UK");
		Product product39 = new Product("Razor","Gillette","01-01-2025",300,ProductType.BEAUTY,"Amazon",ProductWarranty.NO_WARRANTY,false,139,"USA");
		Product product40 = new Product("Colgate Toothpaste","Colgate","01-01-2025",220,ProductType.BEAUTY,"Reliance",ProductWarranty.NO_WARRANTY,false,140,"USA");
		
		
		Product product41 = new Product("Grinder","Bosch","02-02-2024",6500,ProductType.ELECTRONICS,"Amazon",ProductWarranty.TWO_YEARS,false,141,"Germany");
		Product product42 = new Product("Fan","Panasonic","03-02-2024",3200,ProductType.ELECTRONICS,"Flipkart",ProductWarranty.TWO_YEARS,false,142,"Japan");
		Product product43 = new Product("Refrigerator","Haier","04-02-2024",42000,ProductType.ELECTRONICS,"Reliance Digital",ProductWarranty.THREE_YEARS,false,143,"China");
		Product product44 = new Product("Oppo Reno 11","Oppo","05-02-2024",30000,ProductType.MOBILE,"Flipkart",ProductWarranty.ONE_YEAR,false,144,"China");
		Product product45 = new Product("Vivo V29","Vivo","06-02-2024",32000,ProductType.MOBILE,"Amazon",ProductWarranty.ONE_YEAR,false,145,"China");

		Product product46 = new Product("Motorola Edge 40","Motorola","07-02-2024",35000,ProductType.MOBILE,"Flipkart",ProductWarranty.ONE_YEAR,false,146,"USA");
		Product product47 = new Product("Acer Aspire 7","Acer","08-02-2024",62000,ProductType.LAPTOP,"Amazon",ProductWarranty.TWO_YEARS,false,147,"Taiwan");
		Product product48 = new Product("MSI Gaming Laptop","MSI","09-02-2024",110000,ProductType.LAPTOP,"Amazon",ProductWarranty.THREE_YEARS,false,148,"Taiwan");
		Product product49 = new Product("Smartwatch","Boat","10-02-2024",2500,ProductType.ELECTRONICS,"Flipkart",ProductWarranty.ONE_YEAR,false,149,"India");
		Product product50 = new Product("Smartwatch","Noise","11-02-2024",3000,ProductType.ELECTRONICS,"Amazon",ProductWarranty.ONE_YEAR,false,150,"India");

		Product product51 = new Product("Smartwatch","FireBoltt","12-02-2024",2800,ProductType.ELECTRONICS,"Flipkart",ProductWarranty.ONE_YEAR,false,151,"India");
		Product product52 = new Product("Air Fryer","Philips","13-02-2024",9000,ProductType.ELECTRONICS,"Amazon",ProductWarranty.TWO_YEARS,false,152,"Netherlands");
		Product product53 = new Product("Washing Machine","Samsung","14-02-2024",38000,ProductType.ELECTRONICS,"Croma",ProductWarranty.THREE_YEARS,false,153,"South Korea");
		Product product54 = new Product("Washing Machine","LG","15-02-2024",36000,ProductType.ELECTRONICS,"Reliance Digital",ProductWarranty.THREE_YEARS,false,154,"South Korea");
		Product product55 = new Product("Refrigerator","Godrej","16-02-2024",29000,ProductType.ELECTRONICS,"Amazon",ProductWarranty.THREE_YEARS,false,155,"India");

		Product product56 = new Product("Smart TV","TCL","17-02-2024",45000,ProductType.ELECTRONICS,"Flipkart",ProductWarranty.TWO_YEARS,false,156,"China");
		Product product57 = new Product("Buds","Realme","18-02-2024",2000,ProductType.ELECTRONICS,"Amazon",ProductWarranty.ONE_YEAR,false,157,"China");
		Product product58 = new Product("Soundbar","Sony","19-02-2024",15000,ProductType.ELECTRONICS,"Amazon",ProductWarranty.TWO_YEARS,false,158,"Japan");
		Product product59 = new Product("Soundbar","JBL","20-02-2024",17000,ProductType.ELECTRONICS,"Flipkart",ProductWarranty.TWO_YEARS,false,159,"USA");
		Product product60 = new Product("Mouse","Logitech","21-02-2024",1200,ProductType.ELECTRONICS,"Amazon",ProductWarranty.ONE_YEAR,false,160,"Switzerland");

		Product product61 = new Product("Keyboard","Logitech","22-02-2024",2200,ProductType.ELECTRONICS,"Amazon",ProductWarranty.ONE_YEAR,false,161,"Switzerland");
		Product product62 = new Product("Printer","HP","23-02-2024",9000,ProductType.ELECTRONICS,"Flipkart",ProductWarranty.TWO_YEARS,false,162,"USA");
		Product product63 = new Product("Printer","Epson","24-02-2024",11000,ProductType.ELECTRONICS,"Amazon",ProductWarranty.TWO_YEARS,false,163,"Japan");
		Product product64 = new Product("Monitor","Dell","25-02-2024",15000,ProductType.ELECTRONICS,"Amazon",ProductWarranty.THREE_YEARS,false,164,"USA");
		Product product65 = new Product("Monitor","LG","26-02-2024",14000,ProductType.ELECTRONICS,"Flipkart",ProductWarranty.THREE_YEARS,false,165,"South Korea");

		Product product66 = new Product("Hard Disk","Western Digital","27-02-2024",6500,ProductType.ELECTRONICS,"Amazon",ProductWarranty.THREE_YEARS,false,166,"USA");
		Product product67 = new Product("Hard Disk","Seagate","28-02-2024",6400,ProductType.ELECTRONICS,"Amazon",ProductWarranty.THREE_YEARS,false,167,"USA");
		Product product68 = new Product("Pen Drive","Sandisk","01-03-2024",900,ProductType.ELECTRONICS,"Flipkart",ProductWarranty.ONE_YEAR,false,168,"USA");
		Product product69 = new Product("Kingston RAM","Kingston","02-03-2024",3500,ProductType.ELECTRONICS,"Amazon",ProductWarranty.THREE_YEARS,false,169,"USA");
		Product product70 = new Product("Corsair RAM","Corsair","03-03-2024",4500,ProductType.ELECTRONICS,"Amazon",ProductWarranty.THREE_YEARS,false,170,"USA");

		Product product71 = new Product("Badminton Racket","Yonex","04-03-2024",3200,ProductType.SPORTS,"Amazon",ProductWarranty.NO_WARRANTY,false,171,"Japan");
		Product product72 = new Product("Cricket Bat","Cosco","05-03-2024",2500,ProductType.SPORTS,"Flipkart",ProductWarranty.NO_WARRANTY,false,172,"India");
		Product product73 = new Product("Cricket Ball","SG","06-03-2024",450,ProductType.SPORTS,"Amazon",ProductWarranty.NO_WARRANTY,false,173,"India");
		Product product74 = new Product("Football","Nivia","07-03-2024",900,ProductType.SPORTS,"Amazon",ProductWarranty.NO_WARRANTY,false,174,"India");
		Product product75 = new Product("Gym Bag","Decathlon","08-03-2024",1800,ProductType.SPORTS,"Decathlon",ProductWarranty.NO_WARRANTY,false,175,"France");

		Product product76 = new Product("Woodland Shoes","Woodland","09-03-2024",4500,ProductType.CLOTHING,"Amazon",ProductWarranty.NO_WARRANTY,false,176,"India");
		Product product77 = new Product("Formal Shoes","Bata","10-03-2024",3000,ProductType.CLOTHING,"Bata Store",ProductWarranty.NO_WARRANTY,false,177,"Switzerland");
		Product product78 = new Product("Reebok Shoes","Reebok","11-03-2024",5500,ProductType.CLOTHING,"Amazon",ProductWarranty.NO_WARRANTY,false,178,"USA");
		Product product79 = new Product("Allen Solly Shirt","Allen Solly","12-03-2024",2400,ProductType.CLOTHING,"Myntra",ProductWarranty.NO_WARRANTY,false,179,"India");
		Product product80 = new Product("Van Heusen Shirt","Van Heusen","13-03-2024",2600,ProductType.CLOTHING,"Myntra",ProductWarranty.NO_WARRANTY,false,180,"India");

		Product product81 = new Product("Shirt","Park Avenue","14-03-2024",2300,ProductType.CLOTHING,"Amazon",ProductWarranty.NO_WARRANTY,false,181,"India");
		Product product82 = new Product("Shirt","Peter England","15-03-2024",2100,ProductType.CLOTHING,"Myntra",ProductWarranty.NO_WARRANTY,false,182,"India");
		Product product83 = new Product("Face Wash","Himalaya","16-03-2024",250,ProductType.BEAUTY,"Amazon",ProductWarranty.NO_WARRANTY,false,183,"India");
		Product product84 = new Product("Sunscreen Cream","Mamaearth","17-03-2024",399,ProductType.BEAUTY,"Nykaa",ProductWarranty.NO_WARRANTY,false,184,"India");
		Product product85 = new Product("Shampoo","Garnier","18-03-2024",350,ProductType.BEAUTY,"Amazon",ProductWarranty.NO_WARRANTY,false,185,"France");
		
		Product product86 = new Product("Shampoo","Treasemme","19-03-2024",420,ProductType.BEAUTY,"Flipkart",ProductWarranty.NO_WARRANTY,false,186,"USA");
		Product product87 = new Product("Toothbrush","OralB","20-03-2024",250,ProductType.BEAUTY,"Amazon",ProductWarranty.NO_WARRANTY,false,187,"USA");
		Product product88 = new Product("Toothpaste","Sensodyne","21-03-2024",280,ProductType.BEAUTY,"Amazon",ProductWarranty.NO_WARRANTY,false,188,"UK");
		Product product89 = new Product("Biscuit","Britannia","22-03-2024",60,ProductType.GROCERY,"Reliance",ProductWarranty.NO_WARRANTY,false,189,"India");
		Product product90 = new Product("Cornflakes","Kelloggs","23-03-2024",450,ProductType.GROCERY,"Amazon",ProductWarranty.NO_WARRANTY,false,190,"USA");

		Product product91 = new Product("Salt","Tata","24-03-2024",30,ProductType.GROCERY,"Reliance",ProductWarranty.NO_WARRANTY,false,191,"India");
		Product product92 = new Product("Kissan Jam","Kissan","25-03-2024",150,ProductType.GROCERY,"Amazon",ProductWarranty.NO_WARRANTY,false,192,"India");
		Product product93 = new Product("Cheese","Amul","26-03-2024",500,ProductType.GROCERY,"BigBasket",ProductWarranty.NO_WARRANTY,false,193,"India");
		Product product94 = new Product("Fortune Oil","Fortune","27-03-2024",1700,ProductType.GROCERY,"Reliance",ProductWarranty.NO_WARRANTY,false,194,"India");
		Product product95 = new Product("Saffola Oil","Saffola","28-03-2024",1800,ProductType.GROCERY,"Amazon",ProductWarranty.NO_WARRANTY,false,195,"India");

		Product product96 = new Product("Wardrobe","Ikea","29-03-2024",25000,ProductType.FURNITURE,"Ikea Store",ProductWarranty.FIVE_YEARS,false,196,"Sweden");
		Product product97 = new Product("Locker","Godrej","30-03-2024",15000,ProductType.FURNITURE,"Amazon",ProductWarranty.FIVE_YEARS,false,197,"India");
		Product product98 = new Product("Chair","Nilkamal","01-04-2024",5000,ProductType.FURNITURE,"Amazon",ProductWarranty.THREE_YEARS,false,198,"India");
		Product product99 = new Product("Sofa","Nilkamal","02-04-2024",42000,ProductType.FURNITURE,"HomeTown",ProductWarranty.FIVE_YEARS,false,199,"India");
		Product product100 = new Product("Table","Nilkamal","03-04-2024",12000,ProductType.FURNITURE,"Pepperfry",ProductWarranty.THREE_YEARS,false,200,"India");

		Product product101 = new Product("Panasonic Microwave","Panasonic","04-04-2024",12000,ProductType.ELECTRONICS,"Amazon",ProductWarranty.TWO_YEARS,false,201,"Japan");
		Product product102 = new Product("Bajaj Mixer","Bajaj","05-04-2024",3500,ProductType.ELECTRONICS,"Flipkart",ProductWarranty.TWO_YEARS,false,202,"India");
		Product product103 = new Product("Havells Fan","Havells","06-04-2024",3200,ProductType.ELECTRONICS,"Amazon",ProductWarranty.TWO_YEARS,false,203,"India");
		Product product104 = new Product("Orient Fan","Orient","07-04-2024",3000,ProductType.ELECTRONICS,"Amazon",ProductWarranty.TWO_YEARS,false,204,"India");
		Product product105 = new Product("Voltas AC","Voltas","08-04-2024",42000,ProductType.ELECTRONICS,"Croma",ProductWarranty.THREE_YEARS,false,205,"India");

		Product product106 = new Product("AC","Blue Star","09-04-2024",45000,ProductType.ELECTRONICS,"Reliance Digital",ProductWarranty.THREE_YEARS,false,206,"India");
		Product product107 = new Product("AC","Daikin","10-04-2024",48000,ProductType.ELECTRONICS,"Amazon",ProductWarranty.THREE_YEARS,false,207,"Japan");
		Product product108 = new Product("TV","Realme","11-04-2024",30000,ProductType.ELECTRONICS,"Flipkart",ProductWarranty.TWO_YEARS,false,208,"China");
		Product product109 = new Product("TV","Xiaomi","12-04-2024",28000,ProductType.ELECTRONICS,"Amazon",ProductWarranty.TWO_YEARS,false,209,"China");
		Product product110 = new Product("Earbuds","Boat","13-04-2024",1500,ProductType.ELECTRONICS,"Flipkart",ProductWarranty.ONE_YEAR,false,210,"India");

		Product product111 = new Product("Earbuds","Noise","14-04-2024",1700,ProductType.ELECTRONICS,"Amazon",ProductWarranty.ONE_YEAR,false,211,"India");
		Product product112 = new Product("Earbuds","Sony","15-04-2024",9000,ProductType.ELECTRONICS,"Amazon",ProductWarranty.ONE_YEAR,false,212,"Japan");
		Product product113 = new Product("Earbuds","JBL","16-04-2024",7000,ProductType.ELECTRONICS,"Flipkart",ProductWarranty.ONE_YEAR,false,213,"USA");
		Product product114 = new Product("Earbuds","FireBoltt","17-04-2024",1800,ProductType.ELECTRONICS,"Amazon",ProductWarranty.ONE_YEAR,false,214,"India");
		Product product115 = new Product("AirPods","Apple","18-04-2024",26000,ProductType.ELECTRONICS,"Apple Store",ProductWarranty.ONE_YEAR,false,215,"USA");

		Product product116 = new Product("Printer","Canon","19-04-2024",9500,ProductType.ELECTRONICS,"Amazon",ProductWarranty.TWO_YEARS,false,216,"Japan");
		Product product117 = new Product("Nikon Lens","Nikon","20-04-2024",15000,ProductType.ELECTRONICS,"Amazon",ProductWarranty.TWO_YEARS,false,217,"Japan");
		Product product118 = new Product("Camera","GoPro","21-04-2024",32000,ProductType.ELECTRONICS,"Amazon",ProductWarranty.SIX_MONTHS,false,218,"USA");
		Product product119 = new Product("Drone","DJI","22-04-2024",85000,ProductType.ELECTRONICS,"Amazon",ProductWarranty.TWO_YEARS,false,219,"China");
		Product product120 = new Product("Projector","BenQ","23-04-2024",42000,ProductType.ELECTRONICS,"Amazon",ProductWarranty.THREE_YEARS,false,220,"Taiwan");

		Product product121 = new Product("Router","Asus","24-04-2024",5500,ProductType.ELECTRONICS,"Amazon",ProductWarranty.THREE_YEARS,false,221,"Taiwan");
		Product product122 = new Product("Router","TP-Link","25-04-2024",3200,ProductType.ELECTRONICS,"Amazon",ProductWarranty.THREE_YEARS,false,222,"China");
		Product product123 = new Product("Router","Netgear","26-04-2024",4500,ProductType.ELECTRONICS,"Amazon",ProductWarranty.THREE_YEARS,false,223,"USA");
		Product product124 = new Product("Mouse","Dell","27-04-2024",900,ProductType.ELECTRONICS,"Amazon",ProductWarranty.ONE_YEAR,false,224,"USA");
		Product product125 = new Product("Mouse","HP","28-04-2024",850,ProductType.ELECTRONICS,"Flipkart",ProductWarranty.ONE_YEAR,false,225,"USA");

		Product product126 = new Product("Monitor","Acer","29-04-2024",12000,ProductType.ELECTRONICS,"Amazon",ProductWarranty.THREE_YEARS,false,226,"Taiwan");
		Product product127 = new Product("Monitor","MSI","30-04-2024",18000,ProductType.ELECTRONICS,"Amazon",ProductWarranty.THREE_YEARS,false,227,"Taiwan");
		Product product128 = new Product("SSD","Samsung","01-05-2024",6500,ProductType.ELECTRONICS,"Amazon",ProductWarranty.SIX_MONTHS,false,228,"South Korea");
		Product product129 = new Product("SSD","Crucial","02-05-2024",6000,ProductType.ELECTRONICS,"Amazon",ProductWarranty.THREE_YEARS,false,229,"USA");
		Product product130 = new Product("Processor","Intel","03-05-2024",22000,ProductType.ELECTRONICS,"Amazon",ProductWarranty.THREE_YEARS,false,230,"USA");

		Product product131 = new Product("Processor","AMD","04-05-2024",21000,ProductType.ELECTRONICS,"Amazon",ProductWarranty.THREE_YEARS,false,231,"USA");
		Product product132 = new Product("Graphics Card","Nvidia","05-05-2024",75000,ProductType.ELECTRONICS,"Amazon",ProductWarranty.THREE_YEARS,false,232,"USA");
		Product product133 = new Product("Speaker","Zebronics","06-05-2024",3000,ProductType.ELECTRONICS,"Flipkart",ProductWarranty.SIX_MONTHS,false,233,"India");
		Product product134 = new Product("Speaker","Portronics","07-05-2024",2800,ProductType.ELECTRONICS,"Amazon",ProductWarranty.ONE_YEAR,false,234,"India");
		Product product135 = new Product("Power Bank","Ambrane","08-05-2024",1500,ProductType.ELECTRONICS,"Amazon",ProductWarranty.ONE_YEAR,false,235,"India");
		Product product136 = new Product("Power Bank","Xiaomi","09-05-2024",1800,ProductType.ELECTRONICS,"Flipkart",ProductWarranty.ONE_YEAR,false,236,"China");
		Product product137 = new Product("LED Bulb","Syska","10-05-2024",250,ProductType.ELECTRONICS,"Amazon",ProductWarranty.ONE_YEAR,false,237,"India");
		
		Product[] productsList = new Product[10];
		productsList[0] = product1;
		productsList[1] = product2;
		productsList[2] = product3;
		productsList[3] = product4;
		productsList[4] = product5;
		productsList[5] = product6;
		productsList[6] = product7;
		productsList[7] = product8;
		productsList[8] = product9;
		productsList[9] = product10;
		store.save(productsList);
		System.out.println("----------------------------------");
		
		store.save(product11);
		store.save(product12);
		store.save(product13);
		store.save(product14);
		store.save(product15);
		store.save(product16);
		store.save(product17);
		store.save(product18);
		store.save(product19);
		store.save(product20);
		store.save(product21);
		store.save(product22);
		store.save(product23);
		store.save(product24);
		store.save(product25);
		store.save(product26);
		store.save(product27);
		store.save(product28);
		store.save(product29);
		store.save(product30);
		store.save(product31);
		store.save(product32);
		store.save(product33);
		store.save(product34);
		store.save(product35);
		store.save(product36);
		store.save(product37);
		store.save(product38);
		store.save(product39);
		store.save(product40);
		store.save(product41);
		store.save(product42);
		store.save(product43);
		store.save(product44);
		store.save(product45);
		store.save(product46);
		store.save(product47);
		store.save(product48);
		store.save(product49);
		store.save(product50);
		store.save(product51);
		store.save(product52);
		store.save(product53);
		store.save(product54);
		store.save(product55);
		store.save(product56);
		store.save(product57);
		store.save(product58);
		store.save(product59);
		store.save(product60);
		store.save(product61);
		store.save(product62);
		store.save(product63);
		store.save(product64);
		store.save(product65);
		store.save(product66);
		store.save(product67);
		store.save(product68);
		store.save(product69);
		store.save(product70);
		store.save(product71);
		store.save(product72);
		store.save(product73);
		store.save(product74);
		store.save(product75);
		store.save(product76);
		store.save(product77);
		store.save(product78);
		store.save(product79);
		store.save(product80);
		store.save(product81);
		store.save(product82);
		store.save(product83);
		store.save(product84);
		store.save(product85);
		store.save(product86);
		store.save(product87);
		store.save(product88);
		store.save(product89);
		store.save(product90);
		store.save(product91);
		store.save(product92);
		store.save(product93);
		store.save(product94);
		store.save(product95);
		store.save(product96);
		store.save(product97);
		store.save(product98);
		store.save(product99);
		store.save(product100);
		store.save(product101);
		store.save(product102);
		store.save(product103);
		store.save(product104);
		store.save(product105);
		store.save(product106);
		store.save(product107);
		store.save(product108);
		store.save(product109);
		store.save(product110);
		store.save(product111);
		store.save(product112);
		store.save(product113);
		store.save(product114);
		store.save(product115);
		store.save(product116);
		store.save(product117);
		store.save(product118);
		store.save(product119);
		store.save(product120);
		store.save(product121);
		store.save(product122);
		store.save(product123);
		store.save(product124);
		store.save(product125);
		store.save(product126);
		store.save(product127);
		store.save(product128);
		store.save(product129);
		store.save(product130);
		store.save(product131);
		store.save(product132);
		store.save(product133);
		store.save(product134);
		store.save(product135);
		store.save(product136);
		store.save(product137);
		System.out.println("----------------------------------");
		
		System.out.println("Search by uniqueid");
		store.search(101);
		store.search(121);
		store.search(150);
		store.search(180);
		store.search(210);
		System.out.println("----------------------------------");
		
		System.out.println("Search by uniqueid and name");
		store.search(110, "Asus ROG");
		store.search(115, "Speaker");
		store.search(140, "Colgate Toothpaste");
		store.search(165, "Monitor");
		store.search(200, "Table");
		System.out.println("----------------------------------");
		
		System.out.println("Search by uniqueid, name and origin country");
		store.search(215, "AirPods", "USA");
		store.search(171, "Badminton Racket", "Japan");
		store.search(195, "Saffola Oil", "India");
		store.search(208, "TV", "China");
		store.search(147, "Acer Aspire 7", "Taiwan");
		System.out.println("----------------------------------");
		
		System.out.println("Get all origin countries");
        store.getAllOriginCountry();
		System.out.println("----------------------------------");
		
		System.out.println("Check warranty expired by unique id");
		store.checkWarrantyExpiredByUniqueId(110);
		store.checkWarrantyExpiredByUniqueId(125);
		store.checkWarrantyExpiredByUniqueId(170);
		store.checkWarrantyExpiredByUniqueId(102);
		store.checkWarrantyExpiredByUniqueId(137);
		System.out.println("----------------------------------");
		
		System.out.println("Displaying all products");
        store.displayAllProducts();
		System.out.println("----------------------------------");
		
		System.out.println("Get all MOBILE products");
		store.getAllByType(ProductType.MOBILE);

		System.out.println("Get all ELECTRONICS products");
		store.getAllByType(ProductType.ELECTRONICS);

		System.out.println("Get all FURNITURE products");
		store.getAllByType(ProductType.FURNITURE);
		System.out.println("----------------------------------");
		
		System.out.println("Get products with ONE YEAR warranty");
		store.getAllByWarrantyYears(ProductWarranty.ONE_YEAR);

		System.out.println("Get products with TWO YEARS warranty");
		store.getAllByWarrantyYears(ProductWarranty.TWO_YEARS);

		System.out.println("Get products with THREE YEARS warranty");
		store.getAllByWarrantyYears(ProductWarranty.THREE_YEARS);
		System.out.println("----------------------------------");
		
	}
}