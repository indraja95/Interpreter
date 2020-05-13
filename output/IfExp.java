public class IfExp extends Expr {
	Expr exp1, exp2, exp3;
	BoolVal bool_val;
	public IfExp(Expr e1, Expr e2, Expr e3) {
		this.exp1 = e1;
		this.exp2 = e2;
		this.exp3 = e3;
	}
	@Override
	public Value eval(Env e) throws EvalError {
		// TODO Auto-generated method stub
		bool_val = new BoolVal(false);
		Value v = exp1.eval(e);
		if(exp1.eval(e) instanceof BoolVal){
			if(((BoolVal)v).value)
				return exp2.eval(e);
			
			else
				return exp3.eval(e);
		}
		else
			return bool_val;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "if " + exp1.toString() + "then " + exp2.toString() + "else " + exp3.toString();
	}
}
