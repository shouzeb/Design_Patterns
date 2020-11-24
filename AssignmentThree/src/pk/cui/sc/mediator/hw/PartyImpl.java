package pk.cui.sc.mediator.hw;

import java.util.ArrayList;
import java.util.List;

public class PartyImpl implements Party{
	private final List<PartyMember> members;

	public PartyImpl() {
		members = new ArrayList<>();
	}

	@Override
	public void act(PartyMember actor, Action action) {
		
		for (PartyMember member : members) {
			if (!member.equals(actor)) {
				reduceLife(member, action);
				member.partyAction(action);
				if(member.getHealth()<10)
					System.out.println(member+" is about to die");
				
			}
		}
	}
public void reduceLife(PartyMember member, Action actionn) {
	String action = actionn.toString();
	 {
		//System.out.println("member is"+member+" and health is "+member.getHealth());
		
			
		if (action.equals("found gold")) {
			member.setHealth(6);
			
		}
		else if(action.equals("draws his sword")){
			member.setHealth(2);
			
		}
		else if(action.equals("casted a spell")){
			member.setHealth(7);
			
			//System.out.println(member.getHealth());
			
		}
}}
	@Override
	public void addMember(PartyMember member) {
		members.add(member);
		member.joinedParty(this);
	}
}
