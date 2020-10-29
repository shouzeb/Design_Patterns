package pk.cui.chainHandlerPattern;


public class TextHandler extends BaseHandler{
    String name ;
    
	public TextHandler(String name) {
		
		this.name = name;
	}
	@Override
	public void handle(File file) {
if(file.getType() == Type.TXT) {
	System.out.println("processing and saving TXT file by "+getName());
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