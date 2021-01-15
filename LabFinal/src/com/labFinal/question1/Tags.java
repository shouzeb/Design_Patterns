package com.labFinal.question1;

import java.util.List;

public abstract class Tags {
	
    public void setTagBody(String tagBody){
    
    	throw new UnsupportedOperationException("Current operation is not support for this object");
    
    }
    
    public void addChildTag(Tags htmlTag){
    
    	throw new UnsupportedOperationException("Current operation is not support for this object");
    
    }
    
    public void removeChildTag(Tags htmlTag){
    
    	throw new UnsupportedOperationException("Current operation is not support for this object");
    
    }
    
    public List<Tags>getChildren(){
    
    	throw new UnsupportedOperationException("Current operation is not support for this object");
    
    }
    public abstract void generateHtml();
    public abstract String getTagName();
    public abstract void setStartTag(String tag);
    public abstract void setEndTag(String tag);

}
