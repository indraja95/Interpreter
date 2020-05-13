
public class VarExp extends Expr {
	public final String str1;
	public VarExp(String s1) {
		this.str1 = s1;
	}
	@Override
	public Value eval(Env e) throws EvalError {
		// TODO Auto-generated method stub
		return e.lookup(str1);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return str1;
	}
}
