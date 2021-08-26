package cui.atd.adapterPatternSocketImp;

public class Socket {
	private Volt v;
	public Volt getVolts(){
		
		v = new Volt (240);
		
		return v;
	}
}
