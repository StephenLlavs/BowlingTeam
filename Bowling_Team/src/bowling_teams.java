import java.util.Scanner;

public class bowling_teams {

	public static void main(String[] args) {
		
		String name;
		final int NUM_TEAM_MEMBERS = 4;
		
		bowlingTeam_memebrs bowlTeam = new bowlingTeam_memebrs();
		
		System.out.print("Enter a team Name >> ");
		Scanner input = new Scanner(System.in);
		name = input.nextLine();
		bowlTeam.setTeamNames(name);
		
		for(int i = 0 ; i < NUM_TEAM_MEMBERS; i++) {
			System.out.print("Enter Team member's name >> ");
			name = input.nextLine();
			bowlTeam.setMembers(i, name);
		}
		
		System.out.print("Memebers of the Team " + bowlTeam.getTeamNames() + " \n");
		for(int i = 0 ; i < NUM_TEAM_MEMBERS; i++) {
			System.out.print(bowlTeam.getMembers(i) + "");
			System.out.println();
		}

	}

}
