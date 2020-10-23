package pk.cui.questionOne;

public abstract class Decorator implements Cake{
	protected Cake decoratedCake;
Decorator(Cake c){
	this.decoratedCake=c;
}

}