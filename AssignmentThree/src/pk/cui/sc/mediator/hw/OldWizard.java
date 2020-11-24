package pk.cui.sc.mediator.hw;

public class OldWizard extends PartyMemberBase {
	private int healthh = 20; 
	
	public int getHealth() {
		return healthh;
	}
	
	public void setHealth(int health) {
		healthh = healthh-health;
	}
	@Override
	public String toString() {
		return "Old Wizard [" + getHealth() +"]";
	}
}
