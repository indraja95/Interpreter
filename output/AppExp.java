public class AppExp extends Expr {
	String str1;
	Expr exp1;
	public AppExp(String s1, Expr e1) {
		this.str1 = s1;
		this.exp1 = e1;
	}
	@Override
	public Value eval(Env e) throws EvalError {
		// TODO Auto-generated method stub
		if (e.lookup(str1) instanceof FunVal )
		{   
			Value v = exp1.eval(e);
			FunVal val = (FunVal)e.lookup(str1); 
			Env new_env = val.env.addBinding(val.str, v);
			return val.exp.eval(new_env);
		}
		else 
			throw new EvalError("Error: incompatiable argument"); 

	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return str1 + "(" + exp1.toString() + ")";
	}
}

