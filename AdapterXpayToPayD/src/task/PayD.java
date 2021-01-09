package task;

public interface PayD {

	String getCustCardNo();
	
String getCardOwnerName();

String getCardExpMonthDate();

int getCVVNo();

double getTotalAmount();
void setCustCardNo(String string);
void  setCardOwnerName(String string);
void  setCardExpMonthDate(String string);
void  setCVVNo(int CVVNo);
void  setTotalAmount(double amount);

}
