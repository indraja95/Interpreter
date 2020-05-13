public class BinExp extends Expr{
	BinOp bin_op;
	Expr exp1,exp2;

	public BinExp(BinOp b1, Expr e1, Expr e2) {
		this.bin_op = b1;
		this.exp1 = e1;
		this.exp2 = e2;
	}
	
	@Override
	public Value eval(Env e) throws EvalError {
		// TODO Auto-generated method stub
		switch(bin_op){
			case PLUS: return new IntVal(((IntVal)exp1.eval(e)).value + ((IntVal)exp2.eval(e)).value);
		
			case MINUS: return new IntVal(((IntVal)exp1.eval(e)).value - ((IntVal)exp2.eval(e)).value);

			case TIMES: return new IntVal(((IntVal)exp1.eval(e)).value * ((IntVal)exp2.eval(e)).value);

			case DIV  : if(((IntVal)exp2.eval(e)).value == 0) 
					throw new EvalError("Divide by 0 exception");
				    else 
					return new IntVal(((IntVal)exp1.eval(e)).value/((IntVal)exp2.eval(e)).value);

			case EQ: if(exp1.eval(e) instanceof IntVal && exp2.eval(e) instanceof IntVal)
					return new BoolVal(((IntVal)exp1.eval(e)).value == ((IntVal)exp2.eval(e)).value);

				    else if(exp1.eval(e) instanceof BoolVal && exp2.eval(e) instanceof BoolVal)
					return new BoolVal(((BoolVal)exp1.eval(e)).value == ((BoolVal)exp2.eval(e)).value);
				    

			case LT:   return new BoolVal(((IntVal)exp1.eval(e)).value < ((IntVal)exp2.eval(e)).value);

			case AND:  if(((BoolVal)exp1.eval(e)).value)
					return new BoolVal(((BoolVal)exp2.eval(e)).value);
				  else 
					return new BoolVal(false);
		
			case OR: if(((BoolVal)exp1.eval(e)).value)
					return new BoolVal(true);
				 else 
					return new BoolVal(((BoolVal)exp2.eval(e)).value);
			
		}
		return null;

	}

	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		switch(bin_op){
			case PLUS: return exp1.toString() + "+" + exp2.toString();
			case MINUS: return exp1.toString() + "-" + exp2.toString();
			case TIMES: return exp1.toString() + "*" + exp2.toString();
			case DIV: return exp1.toString() + "/" + exp2.toString();
			case EQ: return exp1.toString() + "=" + exp2.toString();
			case AND: return exp1.toString() + "&" + exp2.toString();
			case OR: return exp1.toString() + "|" + exp2.toString();
			case LT: return exp1.toString() + "<" + exp2.toString();
			default: return "Operation cannot be performed";
		}
	}
}


