package pk.atd.cui.assignmentTwo;

import java.util.List;

public class IteratorActions implements Iterator{
	private List<KitchenApplianceReceiver> appliance;
	private int index=0;
	
	
	public IteratorActions(List<KitchenApplianceReceiver> profiles) {
		
		this.appliance = profiles;
	}

	@Override
	public boolean hasNext() {
		boolean result = false;
		if(index < appliance.size())
			result = true;
		return result;
	}

	@Override
	public KitchenApplianceReceiver next() {
		KitchenApplianceReceiver profile = null;
		if(hasNext()){
			profile = appliance.get(index);
			index++;
		}
		return profile;
	}
}
