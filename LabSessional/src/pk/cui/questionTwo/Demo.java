package pk.cui.questionTwo;


public class Demo {

	public static void main(String[] args) {
		APIFacade api = APIFacade.getInstance();
		api.init();
		api.doTask();
		api.shutdown();
	}

}
