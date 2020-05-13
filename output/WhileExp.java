public class WhileExp extends Expr{
	Expr exp1, exp2;
	BoolVal bool_val;

	public WhileExp(Expr e1, Expr e2) {
		this.exp1 = e1;
		this.exp2 = e2;
	}
	@Override
	public Value eval(Env e) throws EvalError {
		// TODO Auto-generated method stub
		bool_val = new BoolVal(false);
		if(exp1.eval(e) instanceof BoolVal)
		{
			while(((BoolVal)exp1.eval(e)).value)
				exp2.eval(e);
		}
		
		return bool_val;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "while " + exp1.toString() + "do " + exp2.toString();
	}
}