package com.java.design.composite.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 	the composite class which can have other objects below it, ie: the childrenTag. In this case the 
 	our composite stores List of other classes that extend the component.
 	
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
		this.childrenTag = new ArrayList<>(); // en empty collection used to store children objects
		}

	@Override
	public String getTagName() {
		return tagName;
	}

	@Override
	public void setStartTag(String tag) {
		this.startTag = tag;

	}

	@Override
	public void setEndTag(String tag) {
		this.endTag = tag;
	}
	
    @Override
    public void addChildTag(HtmlTag htmlTag){  // can add a composite as it's childTag
    childrenTag.add(htmlTag);
    }

    @Override
	public void removeChildTag(HtmlTag htmlTag) { // can remove a composite that is a childTag
    	childrenTag.remove(htmlTag);
	}
    
    @Override
    public List<HtmlTag>getChildren(){
    return childrenTag;
    }

    /*
     * recursive method that is also present in the leaf, so depending on the object type, this 
     * method gets called accordingly.
	 */
	@Override
	public void generateHtml() {
		System.out.println(startTag);
		for(HtmlTag tag : childrenTag){
		tag.generateHtml();
		}
		System.out.println(endTag);
	}

}
