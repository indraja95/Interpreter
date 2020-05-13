public class BoolConst extends Expr {
    	public final boolean value;
    
 	public BoolConst(boolean _value) {
		value = _value;
    	}

	@Override
    	public Value eval(Env e) throws EvalError {
		// TODO Auto-generated method stub
		return new BoolVal(value);
   	}

	@Override
    	public String toString() {
		// TODO Auto-generated method stub		
		return String.valueOf(value);
    	}
}
