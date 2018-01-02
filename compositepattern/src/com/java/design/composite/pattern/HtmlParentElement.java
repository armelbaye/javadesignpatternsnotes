package com.java.design.composite.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 	the composite class which can have other objects below it, ie: the childrenTag. In this case the 
 	our composite store List of other classes that extend the component.
 	
 	defines behaviour for components having children.
	stores child components.
	implements child related operations in the component interface.
 */

public class HtmlParentElement extends HtmlTag {
	
	private String tagName;
	private String startTag;
	private String endTag;
	private List<HtmlTag>childrenTag;
	
	public HtmlParentElement(String tagName){
		this.tagName = tagName;
		this.startTag = "";
		this.endTag = "";
		this.childrenTag = new ArrayList<>();
		}

	@Override
	public String getTagName() {
		// TODO Auto-generated method stub
		return tagName;
	}

	@Override
	public void setStartTag(String tag) {
		// TODO Auto-generated method stub
		this.startTag = tag;

	}

	@Override
	public void setEndTag(String tag) {
		// TODO Auto-generated method stub
		this.endTag = tag;
	}
	
    @Override
    public void addChildTag(HtmlTag htmlTag){
    childrenTag.add(htmlTag);
    }

    @Override
	public void removeChildTag(HtmlTag htmlTag) {
		// TODO Auto-generated method stub
    	childrenTag.remove(htmlTag);
	}
    
    @Override
    public List<HtmlTag>getChildren(){
    return childrenTag;
    }

	@Override
	public void generateHtml() {
		// TODO Auto-generated method stub
		System.out.println(startTag);
		for(HtmlTag tag : childrenTag){
		tag.generateHtml();
		}
		System.out.println(endTag);
	}

}
