package com.java.design.composite.pattern;

/**
 this is the leaf, it doesn't store any object.
 represents leaf objects in the composition.A leaf has no children.
 defines behaviour for primitive objects in the composition.
 
 */

public class HtmlElement extends HtmlTag {
	
	private String tagName;
	private String startTag;
	private String endTag;
	private String tagBody;
	
	public HtmlElement(String tagName){
	
	this.tagName = tagName;
	this.tagBody = "";
	this.startTag = "";
	this.endTag = "";
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
	public void setTagBody(String tagBody) {
		this.tagBody = tagBody;
	}

	@Override
	public void generateHtml() {
		// TODO Auto-generated method stub
		System.out.println(startTag+""+tagBody+""+endTag);
	}

}