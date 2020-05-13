public class FunVal extends Value{
	Env env;
	String str;
	Expr exp;

	public FunVal(String s1, Expr e1, Env e) {
		this.str = s1;
		this.exp = e1;
		this.env = e;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return str;
	}
	

}
