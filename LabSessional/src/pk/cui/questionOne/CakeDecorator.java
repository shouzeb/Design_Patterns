package pk.cui.questionOne;

public abstract class CakeDecorator implements Cake{
	protected Cake decoratedCake;
CakeDecorator(Cake c){
	this.decoratedCake=c;
}

}