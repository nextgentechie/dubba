package dubba.valueobject.kolkata.circle;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="transactiondetails")
public class TransactionDetails extends CommonGenericObject implements Serializable{
	
@Id
 private String transactionid;
 private int transactionamt;
 private double vatamt;
 private int servicetax;
 private int offeramt;
 private int roundedamt;
 private String currency;
 private String paymentmode;
 private boolean paymentrecived;
 private int qty;
 
public String getTransactionid() {
	return transactionid;
}
public void setTransactionid(String transactionid) {
	this.transactionid = transactionid;
}
public int getTransactionamt() {
	return transactionamt;
}
public void setTransactionamt(int transactionamt) {
	this.transactionamt = transactionamt;
}
public double getVatamt() {
	return vatamt;
}
public void setVatamt(double vatamt) {
	this.vatamt = vatamt;
}
public int getServicetax() {
	return servicetax;
}
public void setServicetax(int servicetax) {
	this.servicetax = servicetax;
}
public int getOfferamt() {
	return offeramt;
}
public void setOfferamt(int offeramt) {
	this.offeramt = offeramt;
}
public int getRoundedamt() {
	return roundedamt;
}
public void setRoundedamt(int roundedamt) {
	this.roundedamt = roundedamt;
}
public String getCurrency() {
	return currency;
}
public void setCurrency(String currency) {
	this.currency = currency;
}
public String getPaymentmode() {
	return paymentmode;
}
public void setPaymentmode(String paymentmode) {
	this.paymentmode = paymentmode;
}
public boolean isPaymentrecived() {
	return paymentrecived;
}
public void setPaymentrecived(boolean paymentrecived) {
	this.paymentrecived = paymentrecived;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
}
