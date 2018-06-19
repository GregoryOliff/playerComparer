package playerDB.model;

//Player class will represent a player with a collection of stats
//Starting with basketball, so stats will include basic stats, e.g.: 
//	Points, Rebounds, Assists, Blocks, Steals, TOs, Shooting %'s(FG, 3pt, FT), 
public class Player {
	//database fields
	private int playerID;
	private String team;
	
	//statistic fields (per game basis)
	private String name;
	private String position;
	private int age;
	private int gamesDressed;
	private int gamesStarted;
	private double personalFouls;
	private double minutesPlayed;
	private double points;
	private double offensiveRebounds;
	private double defensiveRebounds;
	private double totalRebounds;
	private double assists;
	private double blocks;
	private double steals;
	private double fieldGoals;
	private double fieldGoalsAttempted;
	private double fieldGoalPercentage;
	private double threePoints;
	private double threePointersAttempted;
	private double threePointPercentage;
	private double freeThrows;
	private double freeThrowsAttempted;
	private double freeThrowPercentage;
	private double twoPoint;
	private double twoPointersAttempted;
	private double twoPointPercentage;
	
	//Start of Getters and Setters
	
	public void setPlayerID(int playerID) {
		this.playerID = playerID;
	}
	
	public int getPlayerID() {
		return this.playerID;
	}
	
	public void setTeam(String team) {
		this.team = team;
	}
	
	public String getTeam() {
		return this.team;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setPosition(String pos) {
		this.position = pos;
	}
	
	public String getPosition() {
		return this.position;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setGamesDressed(int games) {
		this.gamesDressed = games;
	}
	
	public int getGamesDressed() {
		return this.gamesDressed;
	}
	
	public void setGamesStarted(int games) {
		this.gamesStarted = games;
	}
	
	public int getGamesStarted() {
		return this.gamesStarted;
	}
	
	public void setPoints(double points) {
		this.points = points;
	}
	
	public double getPoints() {
		return this.points;
	}
	
	public void setOffensiveRebounds(double rebounds) {
		this.offensiveRebounds = rebounds;
	}
	
	public double getOffensiveRebounds() {
		return this.offensiveRebounds;
	}
	
	public void setDefensiveRebounds(double rebounds) {
		this.defensiveRebounds = rebounds;
	}
	
	public double getDefensiveRebounds() {
		return this.defensiveRebounds;
	}
	
	public void setTotalRebounds(double rebounds) {
		this.totalRebounds = rebounds;
	}
	
	public double getTotalRebounds() {
		return this.totalRebounds;
	}
	
	public void setAssists(double assists) {
		this.assists = assists;
	}
	
	public double getAssists() {
		return this.assists;
	}
	
	public void setBlocks(double blocks) {
		this.blocks = blocks;
	}
	
	public double getBlocks() {
		return this.blocks;
	}
	
	public void setSteals(double steals) {
		this.steals = steals;
	}
	
	public double getSteals() {
		return this.steals;
	}
	
	public void setFieldGoals(double fg) {
		this.fieldGoals = fg;
	}
	
	public double getFieldGoals() {
		return this.fieldGoals;
	}
	
	public void setFieldGoalsAttempted(double fga) {
		this.fieldGoalsAttempted = fga;
	}
	
	public double getFieldGoalsAttempted() {
		return this.fieldGoalsAttempted;
	}
	
	public void setFieldGoalPercentage(double fgp) {
		this.fieldGoalPercentage = fgp;
	}
	
	public double getFieldGoalPercentage() {
		return this.fieldGoalPercentage;
	}
	
	public void setFreeThrows(double ft) {
		this.freeThrows = ft;
	}
	
	public double getFreeThrows() {
		return this.freeThrows;
	}
	
	public void setFreeThrowsAttempted(double fta) {
		this.freeThrowsAttempted = fta;
	}
	
	public double getFreeThrowsAttempted() {
		return this.freeThrowsAttempted;
	}
	
	public void setFreeThrowPercentage(double ftp) {
		this.freeThrowPercentage = ftp;
	}
	
	public double getFreeThrowPercentage() {
		return this.freeThrowPercentage;
	}
	
	public void setTwoPointers(double tp) {
		this.twoPoint = tp;
	}
	
	public double getTwoPointers() {
		return this.twoPoint;
	}
	
	public void setTwoPointersAttempted(double tpa) {
		this.twoPointersAttempted = tpa;
	}
	
	public double getTwoPointersAttempted() {
		return this.twoPointersAttempted;
	}
	
	public void setTwoPointPercentage(double tpp) {
		this.twoPointPercentage= tpp;
	}
	
	public double getTwoPointPercentage() {
		return this.twoPointPercentage;
	}
	
	public void setThreePointers(double tp) {
		this.threePoints = tp;
	}
	
	public double getThreePointers() {
		return this.threePoints;
	}
	
	public void setThreePointersAttempted(double tpa) {
		this.threePointersAttempted = tpa;
	}
	
	public double getThreePointersAttempted() {
		return this.threePointersAttempted;
	}
	
	public void setThreePointPercentage(double tpp) {
		this.threePointPercentage = tpp;
	}
	
	public double getThreePointPercentage() {
		return this.threePointPercentage;
	}
	
	public void setMinutesPlayed(double mp) {
		this.minutesPlayed = mp;
	}
	
	public double getMinutesPlayed() {
		return this.minutesPlayed;
	}
	
	public void setPersonalFouls(double pf) {
		this.personalFouls = pf;
	}
	
	public double getPersonalFouls() {
		return this.personalFouls;
	}
	//End of Getters and Setters
}