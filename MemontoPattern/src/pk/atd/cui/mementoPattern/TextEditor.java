package pk.atd.cui.mementoPattern;

public class TextEditor {

	private String filename;
	private StringBuilder content;
	
	public TextEditor(String filename) {
		this.filename = filename;
		this.content = new StringBuilder();
	}
	public String toString() {
		return this.content.toString();
	}
	
	public void write(String newContent) {
		content.append(newContent);
	}
	
	public Memento save() {
		return new Memento(this.filename,this.content);
	}
	
	public void undoToLastSaved(Object obj) {
		Memento memento = (Memento) obj;
		this.filename = memento.fileName;
	    this.content = memento.content;	
	}
	
	private class Memento{
		private String fileName;
		private StringBuilder content;
		
		public Memento(String filename,StringBuilder content) {
			this.fileName = filename;
			this.content = new StringBuilder(content);
		}
	}
}
