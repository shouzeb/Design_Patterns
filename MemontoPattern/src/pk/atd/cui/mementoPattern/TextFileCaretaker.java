package pk.atd.cui.mementoPattern;

public class TextFileCaretaker {
private Object obj;
public void save(TextEditor te) {
	this.obj = te.save();
}
public void undo(TextEditor te) {
	te.undoToLastSaved(obj);
}
}
