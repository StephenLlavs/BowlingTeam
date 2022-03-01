
public class bowlingTeam_memebrs {

	private String teamNames;
	private String[] members = new String[4];

	public String getTeamNames() {
		return teamNames;
	}

	public void setTeamNames(String teamNames) {
		this.teamNames = teamNames;
	}

	public void setMembers(int number, String name) {
		members[number] = name;
	}

	public String getMembers(int number) {
		return members[number];
	}

}
