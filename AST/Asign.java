package AST;

import Errors.*;
import Compiler.*;

public class Asign {
	public final String ident;
	public final Exp exp;

	public Asign(String ident, Exp exp) {
		this.ident = ident;
		this.exp = exp;
	}

	public void computeAH1() throws CompilerExc {
		if (!(SymbolTable.getVariableType(ident) == exp.computeType())) {
			throw new IncorrectTypesExc("Incorrect type in multiplication operation.");
		}
	}
}