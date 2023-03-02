//Create a class Main with a main method

public class Main{
	
	public static void main(String[]args){
//Call method setRank
setRank(5);


//Create an instance of the Team class

Team myTeam = new Team();
}
//Create an entity class called Team

@Entity
public class Team{
	
@Id

//Private instance variable/attribute team name, Teams rank, name of the players in the team

private String teamName;
private int TeamsRank;
private String nameOfPlayersInTeam;

//Add constructor

public Team(String teamName){


}
//Add method setRank 	
public static void setRank(int TeamsRank){
}
}
}


	
