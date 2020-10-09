package task;

public class XpayImpl implements Xpay{
private String creditCardNo, customerName, cardExpMonth, cardExpYear;
Short cardCVVNo;
double amount;
@Override
public String getCreditCardNo() {
	return creditCardNo;
}
@Override
public void setCreditCardNo(String creditCardNo) {
	this.creditCardNo = creditCardNo;
}
@Override
public String getCustomerName() {
	return customerName;
}
@Override
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
@Override
public String getCardExpMonth() {
	return cardExpMonth;
}
@Override
public void setCardExpMonth(String cardExpMonth) {
	this.cardExpMonth = cardExpMonth;
}
@Override
public String getCardExpYear() {
	return cardExpYear;
}
@Override
public void setCardExpYear(String cardExpYear) {
	this.cardExpYear = cardExpYear;
}
@Override
public Short getCardCVVNo() {
	return cardCVVNo;
}
@Override
public void setCardCVVNo(Short cardCVVNo) {
	this.cardCVVNo = cardCVVNo;
}
@Override
public double getAmount() {
	return amount;
}
@Override
public void setAmount(double amount) {
	this.amount = amount;
}

}
