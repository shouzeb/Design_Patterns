package cui.atd.objectPool;

public class Reusable {
	private boolean free = true;

	public String util() throws ResuableReturnedInstanceException {
		if(free) {
		return this.hashCode() + " reusable object";
		}
		else throw(new ResuableReturnedInstanceException());
		}

	public boolean isFree() {
		return free;
	}

	public void setFree(boolean free) {
		this.free = free;
	}
	
	
}
