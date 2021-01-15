package com.labFinal.question1;

import java.util.ArrayList;
import java.util.List;

public class ParentElements extends Tags{
    private String name;
    private String start; 
    private String end;
    private List<Tags> childrenTag;
     
    public ParentElements(String tagName){
        this.name = tagName;
        this.start = "";
        this.end = "";
        this.childrenTag = new ArrayList<>();
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
    public void addChildTag(Tags htmlTag){
        childrenTag.add(htmlTag);
    }
     
    @Override
    public void removeChildTag(Tags htmlTag){
        childrenTag.remove(htmlTag);
    }
     
    @Override
    public List<Tags>getChildren(){
        return childrenTag;
    }
 
    @Override
    public void generateHtml() {
        System.out.println(start);
        for(Tags tag : childrenTag){
            tag.generateHtml();
        }
        System.out.println(end);
         
    }

}
