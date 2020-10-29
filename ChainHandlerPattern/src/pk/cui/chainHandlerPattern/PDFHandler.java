package pk.cui.chainHandlerPattern;

public class PDFHandler extends BaseHandler{
    String name ;
    
	public PDFHandler(String name) {
		super();
		this.name = name;
	}
	@Override
	public void handle(File file) {
if(file.getType() == Type.PDF) {
	System.out.println("processing and saving PDF file by "+getName());
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
