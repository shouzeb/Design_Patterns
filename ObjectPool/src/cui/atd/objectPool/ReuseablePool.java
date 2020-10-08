package cui.atd.objectPool;

import java.util.Vector;

public class ReuseablePool {
private static ReuseablePool instance;
private Vector<Reusable> reusables;
private ReuseablePool(int size) {
	reusables = new Vector<Reusable>(size);
	for(int i=0; i<size ; i++) {
		reusables.add(new Reusable());
	}

}

public Reusable accquireReusable() throws NotFreeInstanceException {
	if(reusables.size()>0) {
		Reusable r = reusables.lastElement();
		reusables.remove(r);
		r.setFree(true);
		return r;
	}
	else {
		throw (new NotFreeInstanceException());
	}
	
}

public Reusable releaseReusable(Reusable reusable) throws DuplicateInstanceException {
	if(reusables.contains(reusable) == false) {
		
		reusables.add(reusable);
		reusable.setFree(false);
		System.out.println("reusable released.");
		return null;
	}
	else {
		throw (new DuplicateInstanceException());
	}
}

public static ReuseablePool getInstance(){
	if(instance == null) {
		instance = new ReuseablePool(2);
		
	}
	return instance;
}
}
