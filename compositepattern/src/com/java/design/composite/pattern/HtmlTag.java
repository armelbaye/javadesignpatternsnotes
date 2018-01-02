package com.java.design.composite.pattern;

import java.util.List;

/**
  the component class, can be an interface or an abstract class
  The HtmlTag class is the component class which defines all the methods used by the composite and the leaf class.
  this design pattern consist of the component, composite, leaf and client
  declares interface for objects in composition.
  implements deafault behaviour for the interface common to all classes as appropriate.
  declares an interface for accessing and managing its child components.
 */
public abstract class HtmlTag {

	public abstract String getTagName();
	public abstract void setStartTag(String tag);
	public abstract void setEndTag(String tag);
	
	public void setTagBody(String tagBody){
	throw new UnsupportedOperationException("Current operation is not support for this object");
		}
	
	public void addChildTag(HtmlTag htmlTag){
	throw new UnsupportedOperationException("Current operation is not support for this object");
		}
	
	public void removeChildTag(HtmlTag htmlTag){
		throw new UnsupportedOperationException("Current operation is not support for this object");
		}
	
	public List<HtmlTag>getChildren(){
		throw new UnsupportedOperationException("Current operation is not support for this object");
		}
	
	public abstract void generateHtml();
}
