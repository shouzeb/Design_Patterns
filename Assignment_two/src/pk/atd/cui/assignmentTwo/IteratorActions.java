package pk.atd.cui.assignmentTwo;

import java.util.List;

public class IteratorActions implements Iterator{
	private List<KitchenApplianceReceiver> profiles;
	private int index=0;
	
	
	public IteratorActions(List<KitchenApplianceReceiver> profiles) {
		
		this.profiles = profiles;
	}

	@Override
	public boolean hasNext() {
		boolean result = false;
		if(index < profiles.size())
			result = true;
		return result;
	}

	@Override
	public KitchenApplianceReceiver next() {
		KitchenApplianceReceiver profile = null;
		if(hasNext()){
			profile = profiles.get(index);
			index++;
		}
		return profile;
	}
}
