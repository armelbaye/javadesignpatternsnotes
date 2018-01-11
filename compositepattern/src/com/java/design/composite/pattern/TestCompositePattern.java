package com.java.design.composite.pattern;


/**
   this our client: 
   
   manipulates objects in the composition through the component interface.
   Client use the component class interface to interact with objects in the 
   composition structure.if recipient is a leaf then request is handled directly.
   If recipient is a composite,then it usually forwards request to its child components,
   possibly performing additional operations before and after forwarding.
 */
public class TestCompositePattern {

	public static void main(String[] args) {
		HtmlTag parentTag = new HtmlParentElement("<html>"); // composite
		parentTag.setStartTag(parentTag.getTagName()); 
		parentTag.setEndTag("</html>");
		
		HtmlTag childrenTag0 = new HtmlElement("<p>"); // leaf or child of body
		childrenTag0.setStartTag(childrenTag0.getTagName());
		childrenTag0.setTagBody("Paragraph 1 is here");
		childrenTag0.setEndTag("</p>");
		
		HtmlTag childrenTag1 = new HtmlElement("<p>"); //leaf or child of body
		childrenTag1.setStartTag(childrenTag1.getTagName());
		childrenTag1.setTagBody("Paragraph 2 is here");
		childrenTag1.setEndTag("</p>");
		
		HtmlTag bodyTag = new HtmlParentElement("<body>"); //composite, 
		bodyTag.setStartTag(bodyTag.getTagName());
		bodyTag.addChildTag(childrenTag0); // adds children to the composite body
		bodyTag.addChildTag(childrenTag1); // adds children to the composite body
		bodyTag.setEndTag("</body>");
		
		parentTag.addChildTag(bodyTag);
		
		parentTag.generateHtml();
		
	}
}
