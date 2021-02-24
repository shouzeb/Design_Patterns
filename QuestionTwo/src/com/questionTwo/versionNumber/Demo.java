package com.questionTwo.versionNumber;
public class Demo {

	public static void main(String[] args) throws
	DocumentDuplicateException,
	DocumentNotFoundException,
	VersionMismatchException {
		
		int docID = 1;
		DocumentRepository docRepo = new DocumentRepository();
		Document doc = new Document();
		doc.setId(docID);
		docRepo.add(doc);
		
		System.out.println("An empty document with version "+ doc.getVersion()+ " was added to repo.");
		
		final Document student1Document = docRepo.get(docID);
		final Document student2Document = docRepo.get(docID);

		student1Document.setTitle("FYP DOCUMENT"); 
		docRepo.update(student1Document); 
		System.out.println("Shouzeb updates the document with new version "+ student1Document.getVersion());

	
		student2Document.setAuthor("xyz"); 
		try {
			System.out.println(" Student 1  tries to update the document with his version at same time"+ student2Document.getVersion());
			docRepo.update(student2Document); 
		} 
		catch (VersionMismatchException e) {
			e.printStackTrace();
			
		}
	}
}