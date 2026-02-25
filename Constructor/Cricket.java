class Cricket {
    String format;
    int players;
    int overs;
    String teamA;
    String teamB;
    String venue;
    String captainA;
    String captainB;
    String umpire;
    String matchType;
    String tossWinner;
    String matchDate;
    String sponsor;
    int totalRuns;
    int wickets;
    double runRate;
    String manOfMatch;
    String seriesName;
    String country;
    String result;

    Cricket(String format,
        	int players, 
			int overs, 
			String teamA, String teamB,
            String venue, 
			String captainA, String captainB, 
			String umpire,
            String matchType,
			String tossWinner, 
			String matchDate,
			String sponsor,
            int totalRuns, int wickets, 
			double runRate, 
			String manOfMatch,
            String seriesName, 
			String country, 
			String result) {

        this.format = format;
        this.players = players;
        this.overs = overs;
        this.teamA = teamA;
        this.teamB = teamB;
        this.venue = venue;
        this.captainA = captainA;
        this.captainB = captainB;
        this.umpire = umpire;
        this.matchType = matchType;
        this.tossWinner = tossWinner;
        this.matchDate = matchDate;
        this.sponsor = sponsor;
        this.totalRuns = totalRuns;
        this.wickets = wickets;
        this.runRate = runRate;
        this.manOfMatch = manOfMatch;
        this.seriesName = seriesName;
        this.country = country;
        this.result = result;
    }
}
