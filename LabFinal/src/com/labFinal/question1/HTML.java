package com.labFinal.question1;

public class HTML extends Tags{
	 
    private String name;
    private String start; 
    private String end;
    private String bodyTag;
     
    public HTML(String tagName){
        this.name = tagName;
        this.bodyTag = "";
        this.start = "";
        this.end = "";
    }
     
    @Override
    public String getTagName() {
        return name;
    }
 
    @Override
    public void setStartTag(String tag) {
        this.start = tag;
    }
 
    @Override
    public void setEndTag(String tag) {
        this.end = tag;
    }
     
    @Override
    public void setTagBody(String tagBody){
        this.bodyTag = tagBody;
    }
     
    @Override
    public void generateHtml() {
        System.out.println(start+""+bodyTag+""+end);
    }
 
}
