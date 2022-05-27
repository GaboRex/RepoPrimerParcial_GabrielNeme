package EstructurasPatrones.Interpreter;

public class Cliente {
    public static void main(String[] args){
        String msg = "A A A B B C";
        NonTerminalExpressionParser parser = new NonTerminalExpressionParser(msg);
        System.out.println("Mensaje interpretado: " + parser.evaluateMsg());
    }
}
