package cui.atd.adapterPatternSocketImp;

public class SocketAdapterImplentation implements SocketAdapter{
Socket socket = new Socket(); 
	@Override
	public Volt get240Volts() {
		return socket.getVolts();
	}

	@Override
	public Volt get10Volts() {
		return convertVolts(socket.getVolts(), 24);
	}

	@Override
	public Volt get3Volts() {
		return convertVolts(socket.getVolts(), 80);
	}
	
	private Volt convertVolts(Volt input, int factor){
		int result = input.getVolts()/factor;
		Volt v = new Volt(result);
		return v;
	}
}
