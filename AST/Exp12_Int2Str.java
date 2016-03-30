package AST;

import Errors.*;
import Compiler.*;

public class Exp12_Int2Str implements Exp {
	public final Exp exp;

	public Exp12_Int2Str(Exp exp) {
		this.exp = exp;
	}

	public int computeType() throws CompilerExc {
		if (exp.computeType() == SymbolTable.INT) {
			return SymbolTable.STRING;
		}
		
		throw new IncorrectTypesExc("Incorrect type in Int2Str operation.");
	}
}