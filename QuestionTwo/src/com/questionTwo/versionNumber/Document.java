
package com.questionTwo.versionNumber;

public class Document {
	private long id;
	private String diagramPath = "";
	private String description = "";
	private String name="", type="";
	private long version = 0; 

	public Document() {

	}

	
	public String getDiagramPath() {
		return diagramPath;
	}


	public void setDiagramPath(String diagramPath) {
		this.diagramPath = diagramPath;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public Document(Document book) {
		this.id = book.id;
		this.diagramPath = book.diagramPath;
		this.description = book.description;
		this.version = book.version;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return diagramPath;
	}

	public void setTitle(String title) {
		this.diagramPath = title;
	}

	public String getAuthor() {
		return description;
	}

	public void setAuthor(String author) {
		this.description = author;
	}

	public long getVersion() {
		return version;
	}

	public void setVersion(long version) {
		this.version = version;
	}
}
