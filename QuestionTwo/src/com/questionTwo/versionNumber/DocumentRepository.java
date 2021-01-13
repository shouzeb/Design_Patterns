
package com.questionTwo.versionNumber;

import java.util.HashMap;
import java.util.Map;


public class DocumentRepository {
  private final Map<Long, Document> collection = new HashMap<>();

  public void add(Document book) throws DocumentDuplicateException {
    if (collection.containsKey(book.getId())) {
      throw new DocumentDuplicateException("Duplicated book with id: " + book.getId());
    }


    collection.put(book.getId(), new Document(book));
  }


  public void update(Document doc) throws DocumentNotFoundException, VersionMismatchException {
    if (!collection.containsKey(doc.getId())) {
      throw new DocumentNotFoundException("Not found document with id: " + doc.getId());
    }

    Document latestBook = collection.get(doc.getId());
    if (doc.getVersion() != latestBook.getVersion()) {
      throw new VersionMismatchException(
        "Tried to update stale version " + doc.getVersion()
          + " while actual version is " + latestBook.getVersion()
      );
    }

   
    doc.setVersion(doc.getVersion() + 1);

    
    collection.put(doc.getId(), new Document(doc));
  }


  public Document get(long docID) throws DocumentNotFoundException {
    if (!collection.containsKey(docID)) {
      throw new DocumentNotFoundException("Not found document with id: " + docID);
    }


    return new Document(collection.get(docID));
  }
}