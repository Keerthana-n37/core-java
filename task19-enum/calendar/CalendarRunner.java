class CalendarRunner{
    public static void main(String[] args) {

        Publisher publisher1 = new Publisher("TimesPrint", 1995);
        Calendar calendar1 = new Calendar(2026, publisher1, CalendarType.WALL_CALENDAR);
        calendar1.printInfo();

        Publisher publisher2 = new Publisher("DeskWorks", 2000);
        Calendar calendar2 = new Calendar(2025, publisher2, CalendarType.DESK_CALENDAR);
        calendar2.printInfo();

        Publisher publisher3 = new Publisher("PocketPress", 2010);
		CalendarType type=CalendarType.POCKET_CALENDAR;
        Calendar calendar3 = new Calendar(2024, publisher3,type);
        calendar3.printInfo();

        Publisher publisher4 = new Publisher("DigitalMedia", 2015);
		CalendarType type1=CalendarType.POCKET_CALENDAR;
        Calendar calendar4 = new Calendar(2026, publisher4, type1);
        calendar4.printInfo();
    }
}