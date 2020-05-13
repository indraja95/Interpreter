public class SeqExp extends Expr{
	Expr exp1,exp2;

	public SeqExp(Expr e1, Expr e2) {
		this.exp1 = e1;
		this.exp2 = e2;
	}

	@Override
	public Value eval(Env e) throws EvalError {
		// TODO Auto-generated method stub
		Value v = exp1.eval(e);
		return exp2.eval(e);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{" + exp1.toString() + ";" + exp2.toString() + "}";

	}

}
