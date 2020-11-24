package pk.cui.sc.mediator.hw;

public abstract class PartyMemberBase implements PartyMember {
	protected Party party;
    
	
	//public abstract int getHealth();
	
	//public abstract void setHealth(int health);

	@Override
	public void joinedParty(Party party) {
		System.out.println(this+" walks in the Dungeons & Dragons" );
		this.party = party;
	}

	@Override
	public void partyAction(Action action) {
		System.out.println(this+" "+action.getDescription());
	}

	@Override
	public void act(Action action) {
		//reduceLife(action);
		if (party != null) {
			System.out.println(this+" "+action);
			party.act(this, action);
			
			
		}
	}
	
	public void reduceLife(Action action) {
		System.out.println("this is action "+action);
	}

	@Override
	public abstract String toString();

}
