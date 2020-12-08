package com.xworkz;

public class IplTeam {
	public int noOfTeams;
	public int noOfPlayers;
	public String winnerTeam;
	public String favPlayer;
	public IplTeam()
	{ 
		System.out.println("T20 match");
	}
	  public IplTeam(int noOfTeams,int noOfPlayers,String winnerTeam,String favPlayer)
	  {
		  this. noOfTeams= noOfTeams;
		  this.noOfPlayers=noOfPlayers;
		  this.winnerTeam=winnerTeam;
		  this.favPlayer=favPlayer;
	  }
	  public int getnoOfTeams()
	  {
		  return noOfTeams;
	  }
	  public void setnoOfTeams( int noOfTeams)
	  {
            this.noOfTeams=noOfTeams;
	  }
	  public int getnoOfPlayers()
	  {
		  return noOfPlayers;
	  }
	  public void setnoOfPlayers( int noOfPlayers)
	  {
		  this.noOfPlayers=noOfPlayers;  
	  }
	  public String getwinnerTeam()
	  {
		  return winnerTeam;
	  }
	  public void setwinnerTeam(String winnerTeam)
	  {
		  this.winnerTeam=winnerTeam;
	  }
	  public String favPlayer()
	  {
		  return favPlayer;
	  }
	  public void setfavPlayer(String favPlayer)
	  {
		  this.favPlayer=favPlayer;
	  }
}
	  
	  
	  
	  
	  
