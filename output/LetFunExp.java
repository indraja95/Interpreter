
public class LetFunExp extends Expr{
	String str1, str2;
	Expr exp1, exp2;
	Env new_env, new_env2;
	FunVal val;

	public LetFunExp(String s1, String s2, Expr e1, Expr e2) {
		this.str1 = s1;
		this.str2 = s2;
		this.exp1 = e1;
		this.exp2 = e2;
	}

	@Override
	public Value eval(Env e) throws EvalError {
		// TODO Auto-generated method stub
		new_env = e.addBinding(str1, new IntVal(0));
		val = new FunVal(str2, exp1, new_env);
		new_env.updateBinding(str1, val);
		return exp2.eval(new_env);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "let fun" + str1 + "(" + str2 + ")" + exp1.toString() + "in" + exp2.toString() + "end";
	}

}
