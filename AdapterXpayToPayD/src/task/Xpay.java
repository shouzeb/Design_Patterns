package task;

public interface Xpay {

	String getCreditCardNo();
String getCustomerName();
String getCardExpMonth();
String getCardExpYear();
Short getCardCVVNo();
double getAmount();

void  setCreditCardNo(String string);
void  setCustomerName(String string);
void  setCardExpMonth(String string);

void  setCardExpYear(String string);
void  setCardCVVNo(Short cardCVVNo);
void  setAmount(double amount);

}
