package com.labFinal.question1;

public class demo {

	public static void main(String[] args) {
		
		Tags parentTag = new ParentElements("<html>");
        parentTag.setStartTag("<html>");
        parentTag.setEndTag("</html>");
        Tags p1 = new ParentElements("<body>");
        p1.setStartTag("<body>");
        p1.setEndTag("</body>");
         
        parentTag.addChildTag(p1);
         
        Tags child1 = new HTML("<p>");
        child1.setStartTag("<p>");
        child1.setEndTag("</p>");
        child1.setTagBody("Testing html tag library");
        p1.addChildTag(child1);
         
        child1 = new HTML("<p>");
        child1.setStartTag("<p>");
        child1.setEndTag("</p>");
        child1.setTagBody("Paragraph 2");
        p1.addChildTag(child1);
         
        parentTag.generateHtml();
         
    }
 
}
