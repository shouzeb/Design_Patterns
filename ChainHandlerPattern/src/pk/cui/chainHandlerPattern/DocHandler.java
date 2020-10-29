package pk.cui.chainHandlerPattern;

public class DocHandler extends BaseHandler{
    String name ;
    
	public DocHandler(String name) {
		
		this.name = name;
	}
	@Override
	public void handle(File file) {
if(file.getType() == Type.DOC) {
	System.out.println("processing and saving DOC file by "+getName());
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