public class NotExp extends Expr {
  public final Expr arg;
  public NotExp(Expr _arg) {
    arg = _arg;
  }
  public Value eval(Env e) throws EvalError {
    Value v = arg.eval(e);
    if (v instanceof BoolVal) // can also say v.getClass().equals(BoolVal.class) 
      return new BoolVal(!((BoolVal)v).value);
    else 
      throw new EvalError("Evaluation error: Incompatible arg types");
  }
  public String toString() {
    return "!" + arg.toString();
  }
}
