package AST;

import Errors.*;
import Compiler.SymbolTable;
import java.io.IOException;

public class Exp13_Or implements Exp {
	public final Exp exp1;
	public final Exp exp2;

	public Exp13_Or(Exp exp1, Exp exp2) {
		this.exp1 = exp1;
		this.exp2 = exp2;
	}

	public int computeType() throws CompilerExc {
		if ((exp1.computeType() == SymbolTable.BOOL) && (exp2.computeType() == SymbolTable.BOOL)) {
			return SymbolTable.BOOL;
		}
		
		throw new IncorrectTypesExc("Incorrect type in or operation.");
	}
    
    public String generateCode() {
        return "(" + exp1.generateCode() + ").or(" + exp2.generateCode() + ")";
    }
}