package pk.atd.cui.assignmentTwo;

import java.util.ArrayList;
import java.util.List;



public class KitchenOperator implements AppliancesIterator{
	
	
	
	List<Appliances> appliances = new ArrayList<Appliances>();
	List<KitchenApplianceReceiver> practice = new ArrayList<KitchenApplianceReceiver>();
	private KitchenApplianceReceiver kitchenApplianceReceiver;
	private static KitchenOperator instance;
	private Iterator iterator;
	private KitchenOperator() {
		
		
		Mixer mixer = new Mixer();
		
		appliances.add(new Appliances("0","Mixer"));
		appliances.add(new Appliances("1","Fuser"));
		appliances.add(new Appliances("2","Star Press"));
		appliances.add(new Appliances("3","Shell Assembler"));
		appliances.add(new Appliances("4","Unload Buffer"));
		practice.add(new Mixer());
		practice.add(new Fuser());
		practice.add(new StarPress());
		practice.add(new ShellAssembler());
		practice.add(new UnloadBuffer());
		
	}
	
	public static KitchenOperator getInstance(){
		if(instance == null)
			instance = new KitchenOperator();
		return instance;
	}


		@Override
		public Iterator init() {
			/*iterator = new IteratorActions(practice);
			while(iterator.hasNext()){
				kitchenApplianceReceiver = iterator.next();
				TurnOnCommand turnOnMixer = new TurnOnCommand(kitchenApplianceReceiver);
				Invoker invoker = new Invoker(turnOnMixer);
				invoker.execute();
				System.out.println(kitchenApplianceReceiver+ "turned on");
				
			}*/
			iterator = new IteratorActions(practice);
			int index=0;
			while(iterator.hasNext()){
				kitchenApplianceReceiver = iterator.next();
				TurnOnCommand turnOnMixer = new TurnOnCommand(kitchenApplianceReceiver);
				Invoker invoker = new Invoker(turnOnMixer);
			
			System.out.print(appliances.get(index++));
			invoker.execute();
			
		}
			return null;}

		@Override
		public Iterator finish() {
			iterator = new IteratorActions(practice);
			int index=0;
			while(iterator.hasNext()){
				kitchenApplianceReceiver = iterator.next();
				TurnOffCommand turnOnMixer = new TurnOffCommand(kitchenApplianceReceiver);
				Invoker invoker = new Invoker(turnOnMixer);
				System.out.print(appliances.get(index++));
				invoker.execute();
			}
			
			
			return null;
		}

		
	}


