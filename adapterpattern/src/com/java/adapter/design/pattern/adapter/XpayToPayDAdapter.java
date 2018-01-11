package com.java.adapter.design.pattern.adapter;

import com.java.adapter.design.pattern.interfaces.PayD;
import com.java.adapter.design.pattern.interfaces.Xpay;

/**
  We need some way, that’s able to fulfill the vendor’s requirement 
  in order to process the payment and also make less or no change
  in the current code. The way is provided by the Adapter pattern.
  create an adapter which will be of type PayD, and it wraps 
  an Xpay object (the type it supposes to be adapted).
  
  NB: an adapter is used to convert the interface to an interface the client expects
 */
public class XpayToPayDAdapter implements PayD {

	private String custCardNo;
	private String cardOwnerName;
	private String cardExpMonthDate;
	private Integer cVVNo;
	private Double totalAmount;
	
    //encapsulates the Xpay object which can only be used by constructing an object and not directly
	private final Xpay xpay; 
	
	//constructs an adapter with the Xpay object 
	public XpayToPayDAdapter(Xpay xpay){
		this.xpay = xpay;
		// method that converts the Xpay properties to PayD properties.
		setProp();
		}
	
	/*
	 * this method sets the payD properties with the Xpay properties, hence this is where the adapter takes
	 * place. 
	 */
	private void setProp() {
		this.setCardOwnerName(this.xpay.getCustomerName());
		this.setCustCardNo(this.xpay.getCreditCardNo());
		this.setCardExpMonthDate(this.xpay.getCardExpMonth() +"/"+ this.xpay.getCardExpYear());
		this.setCVVNo(this.xpay.getCardCVVNo().intValue());
		this.setTotalAmount(this.xpay.getAmount());
	}

	@Override
	public String getCustCardNo() {
		return this.custCardNo;
	}

	@Override
	public String getCardOwnerName() {
		return this.cardOwnerName;
	}

	@Override
	public String getCardExpMonthDate() {
		return this.cardExpMonthDate;
	}

	@Override
	public Integer getCVVNo() {
		return this.cVVNo;
	}

	@Override
	public Double getTotalAmount() {
		return this.totalAmount;
	}

	@Override
	public void setCustCardNo(String custCardNo) {
		this.custCardNo = custCardNo;
	}

	@Override
	public void setCardOwnerName(String cardOwnerName) {
		this.cardOwnerName = cardOwnerName;
	}

	@Override
	public void setCardExpMonthDate(String cardExpMonthDate) {
		this.cardExpMonthDate = cardExpMonthDate;
	}

	@Override
	public void setCVVNo(Integer cVVNo) {
		this.cVVNo = cVVNo;
	}

	@Override
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

}
