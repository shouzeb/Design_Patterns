package pk.cui.sc.mediator.hw;

public class BarbarianViking extends PartyMemberBase {
private int healthh = 20; 
	
	public int getHealth() {
		return healthh;
	}
	
	public void setHealth(int health) {
		healthh = healthh-health;
	}
	@Override
	public String toString() {
		return "Barbarian Viking [" + getHealth() +"]";
	}
}
