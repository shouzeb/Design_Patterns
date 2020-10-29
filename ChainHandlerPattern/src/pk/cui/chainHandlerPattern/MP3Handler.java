package pk.cui.chainHandlerPattern;

public class MP3Handler extends BaseHandler{
    String name ;
    
	public MP3Handler(String name) {
		
		this.name = name;
	}
	@Override
	public void handle(File file) {
if(file.getType() == Type.MP3 || file.getType() == Type.GIF ) {
	System.out.println("processing and saving "+file.getName()+" file by "+getName());
}
else if (next!=null) {
	System.out.println(getName()+" forwards request to"+next.getName());
	next.handle(file);
	}
	else 
	{
		System.out.println("cant be handled");
	}
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}