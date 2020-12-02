package pk.cuiatd.dp.sess2;

public class Demo {
public static void main(String args[]) {
	
	char[] arr= {'f','v','a','d','t'};
	System.out.println("Before sorting:");
	System.out.println(arr);
	CharacterClass characterClass = new CharacterClass();
	characterClass.setS(new BubbleSort());
	characterClass.sort(arr);
}
}
