
public class QuestionOne {

	public static void main(String[] args) {
		ThreadPool pool = new ThreadPool(3);
        
            Task task = new Task(1);
            pool.execute(task);
        
	}

}
