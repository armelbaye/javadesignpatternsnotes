package com.java.adater.design.pattern;

import com.java.adapter.design.pattern.adapter.XpayToPayDAdapter;
import com.java.adapter.design.pattern.impl.XpayImpl;
import com.java.adapter.design.pattern.interfaces.PayD;
import com.java.adapter.design.pattern.interfaces.Xpay;

/**
 * here we set the Xpay object properties, then we construct the PayD object by passing the stored Xpay object 
 * which passes it's values to the PayD object in it's setProp() method. Now our PayD object contains all of the
 * info from the Xpay object.  Hence, no need to create a PayD object from scratch, this patterns can be used with
 * classes as well not just interfaces, this concept can be used with abstract classes and interfaces.
 * 
 * 
 */
public class RunAdapterExample {
	public static void main(String[] args) {
		// Object for Xpay
		Xpay xpay = new XpayImpl();
		xpay.setCreditCardNo("4789565874102365");
		xpay.setCustomerName("Max Warner");
		xpay.setCardExpMonth("09");
		xpay.setCardExpYear("25");
		xpay.setCardCVVNo((short)235);
		xpay.setAmount(2565.23);
		
		/* PayD is implemented by the XpayToPayDadapter,
		 * and now we have a PayD object that has all of the 
		 * values of the xpay object.
		 */
		PayD payD = new XpayToPayDAdapter(xpay);
		
		testPayD(payD);
	}
		private static void testPayD(PayD payD){
			System.out.println(payD.getCardOwnerName());
			System.out.println(payD.getCustCardNo());
			System.out.println(payD.getCardExpMonthDate());
			System.out.println(payD.getCVVNo());
			System.out.println(payD.getTotalAmount());
			}
}
