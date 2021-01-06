package task;

public class XpayToPayDAdapter implements PayD{
	
	Xpay xPay;
	
public XpayToPayDAdapter(Xpay xpay) {
		
		this.xPay = xpay;
		setProp();
	}

String custCardNo, cardOwnerName, cardExpMonthDate;
int CVVNo;

double totalAmount;

@Override
public String getCustCardNo() {
	return custCardNo;
}

@Override
public void setCustCardNo(String custCardNo) {
	this.custCardNo = custCardNo;
}

@Override
public String getCardOwnerName() {
	return cardOwnerName;
}

@Override
public void setCardOwnerName(String cardOwnerName) {
	this.cardOwnerName = cardOwnerName;
}

@Override
public String getCardExpMonthDate() {
	return cardExpMonthDate;
}

@Override
public void setCardExpMonthDate(String cardExpMonthDate) {
	this.cardExpMonthDate = cardExpMonthDate;
}

@Override
public int getCVVNo() {
	return CVVNo;
}

@Override
public void setCVVNo(int cVVNo) {
	CVVNo = cVVNo;
}
@Override
public double getTotalAmount() {
	return totalAmount;
}
@Override
public void setTotalAmount(double totalAmount) {
	this.totalAmount = totalAmount;
}

public void setProp() {
	this.cardOwnerName = xPay.getCustomerName();
	this.custCardNo = xPay.getCreditCardNo();
	this.cardExpMonthDate = xPay.getCardExpMonth()+"/"+xPay.getCardExpYear();
	this.CVVNo = xPay.getCardCVVNo();
	this.totalAmount = xPay.getAmount();
}
}
