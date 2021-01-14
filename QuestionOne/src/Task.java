
 
public class Task implements Runnable {
	
    private int num;
    private int number = 1234;
    int reversedNumber = 0;
    
    public Task(int n) {
        num = n;
    }
 
    public void run() {

    	
    	int temp = 0;
    	while(number > 0){
    	temp = number%10;
    	reversedNumber = reversedNumber * 10 + temp;
    	number = number/10;
    	}
    	   System.out.println("Number changed:" );
    	   System.out.println("Reversed Number is: " + reversedNumber);
    	
    }
 
}