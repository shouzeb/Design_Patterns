package pk.cuiatd.dp.sess2;

public class CharacterClass {
private String[] cha = new String[10]; 
private Sorting s;

public String[] getCha() {
	
	return cha;
}
public void setCha(String[] cha) {
	this.cha = cha;
}
public Sorting getS() {
	
	return s;
}
public void setS(Sorting s) {
	this.s = s;
}

void sort(char[] arr){
	s.SortMethod(arr);
}
}
