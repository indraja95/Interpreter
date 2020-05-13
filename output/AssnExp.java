public class AssnExp extends Expr{
	String str1;
	Expr exp1;
	public AssnExp(String s1, Expr e1) {
		this.str1 = s1;
		this.exp1 = e1;
	}
	
	@Override
	public Value eval(Env e) throws EvalError {
		// TODO Auto-generated method stub
		Value v = e.lookup(str1);
		Value v2 = exp1.eval(e);

		if(v.getClass().equals(v2.getClass())){
			e.updateBinding(str1,v2);
			return v2;
		}

		else throw new EvalError("Evaluation error: Incompatible arg types");
	}

	public String toString() {
		return str1 + ":=" + exp1.toString();
	}

}



