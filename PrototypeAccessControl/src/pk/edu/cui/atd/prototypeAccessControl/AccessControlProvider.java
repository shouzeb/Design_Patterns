package pk.edu.cui.atd.prototypeAccessControl;

import java.util.HashMap;
import java.util.Map;

public class AccessControlProvider {

	private static Map <String, AccessControl>map = new HashMap<String, AccessControl>();
	 
    static {
 
        map.put("user", new AccessControl("userr","do_work"));
        map.put("admin", new AccessControl("admin","add and remove user"));
        map.put("manager", new AccessControl("manager","generate/read reports"));
        map.put("vp", new AccessControl("vp","modify reports"));
    }
 
    public static AccessControl getAccessControlObject(String controlLevel){
        AccessControl ac = null;
        ac = map.get(controlLevel);
        if(ac!=null){
            return ac.clone();
        }
        return null;
    }
}
