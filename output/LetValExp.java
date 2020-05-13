public class LetValExp extends Expr{
	String str1;
	Expr exp1, exp2;
	
	public LetValExp(String s1, Expr e1, Expr e2) {
		this.str1 = s1;
		this.exp1 = e1;
		this.exp2 = e2;
	}
	@Override
	public Value eval(Env e) throws EvalError {
		// TODO Auto-generated method stub
		return exp2.eval(e.addBinding(str1, exp1.eval(e)));
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "let val" + str1 + ":=" + exp1.toString() + "in" + exp2.toString() + "end";
	}

}
