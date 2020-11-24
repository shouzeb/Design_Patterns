package pk.cui.sc.mediator.hw;

public class Demo {

	public static void main(String[] args) {
		// create party and members
	    Party party = new PartyImpl();
	   
	    OldWizard oldWizard = new OldWizard();
	    RogueWarrior rogueWarrior = new RogueWarrior();
	    BarbarianViking barbarianViking = new BarbarianViking();

	    // add party members
	    
	    party.addMember(oldWizard);
	    party.addMember(rogueWarrior);
	    party.addMember(barbarianViking);

	    // perform actions -> the other party members
	    // are notified by the party
	    
	    System.out.println("++++++++++++++++++++++");
	    oldWizard.act(Action.SPELL);
	    
	    System.out.println("++++++++++++++++++++++");
	    rogueWarrior.act(Action.DRAW);
	    System.out.println("++++++++++++++++++++++");
	    barbarianViking.act(Action.GOLD);

	}

}
