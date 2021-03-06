package pk.atd.cui.interpreterPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {

	public static void main(String[] args) {
		String roman = "MMMMMMMCMXXV";
		Context context = new Context(roman);

		// Build the 'parse tree' /AST
		ArrayList<Expressions> tree = new ArrayList<Expressions>();
		tree.add(new ThousandExpression());
		tree.add(new HundredExpression());
		tree.add(new TenExpression());
		tree.add(new UnitExpression());

		// Interpret 
		for (Iterator it = tree.iterator(); it.hasNext();)
		{
			Expressions exp = (Expressions)it.next();
			exp.interpret(context);
		}

		System.out.println(roman + " = " + Integer.toString(context.getOutput()));
	}

}
