package pk.atd.cui.mementoPattern;

public class Demo {
 public static void main(String[] a) {
	TextFileCaretaker caretaker = new TextFileCaretaker();
	TextEditor textEditor = new TextEditor("data.txt");
	textEditor.write("first line   ");
	System.out.println(textEditor);
	caretaker.save(textEditor);
	
	textEditor.write("2nd line  ");
	System.out.println(textEditor);
	
	//caretaker.undo(textEditor);
	System.out.println(textEditor);
 }
}
