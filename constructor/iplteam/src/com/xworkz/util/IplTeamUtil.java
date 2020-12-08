package com.xworkz.util;

import com.xworkz.IplTeam;

public class IplTeamUtil {
	public static void main(String[] args) {
		
		IplTeam iplteam=new IplTeam (8,11,"mumbaiteam","ishankishan");
		System.out.println(iplteam.noOfTeams+" "+iplteam.noOfPlayers+" "+iplteam.winnerTeam+" "+iplteam.favPlayer);
	}

}
