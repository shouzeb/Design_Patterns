package pk.cuiatd.dp.sess2;

public class Demo {
public static void main(String args[]) {
	
	char[] arr= {'f','v','a'};
	
	System.out.println("Before sorting:");
	System.out.println(arr);
	CharacterClass characterClass = new CharacterClass();
	System.out.println("After Bubble Sort: ");
	characterClass.setS(new BubbleSort());
	characterClass.sort(arr);
	System.out.println("\n\n\nAfter Heap Sort: ");
	characterClass.setS(new HeapSort());
	characterClass.sort (arr);
}
}
