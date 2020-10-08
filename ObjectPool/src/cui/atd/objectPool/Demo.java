package cui.atd.objectPool;

public class Demo {
public static void main(String[] args) throws NotFreeInstanceException, DuplicateInstanceException, ResuableReturnedInstanceException {
	ReuseablePool pool1=ReuseablePool.getInstance();
	Reusable r1,r2,r3;
	r1=pool1.accquireReusable();
	System.out.println(r1.util());
	
	r2=pool1.accquireReusable();
	System.out.println(r2.util());
	System.out.println(r2.util());
	
	r2=pool1.releaseReusable(r2);
	
	r3=pool1.accquireReusable();
	//System.out.println(r2.util());
	System.out.println(r3.util());
}
}
