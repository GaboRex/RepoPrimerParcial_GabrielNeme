package EstructurasPatrones.Interpreter;

import java.util.ArrayList;
import java.util.List;

public class NonTerminalExpressionParser {
    private List<AbstractExpression> grammar =new ArrayList<>();
    private Context context;

    public NonTerminalExpressionParser(String msgToInterpret) {
        // Si hay espacios los borra
        context = new Context(msgToInterpret.replace(" ", ""));
        for (String charOriginal : msgToInterpret.split(" ")) {
            switch (charOriginal){
                case "A":
                    grammar.add(new TerminalExpressionA());
                    break;
                case "B":
                    grammar.add(new TerminalExpressionB());
                    break;
                case "C":
                    grammar.add(new TerminalExpressionC());
                    break;
                case "D":
                    grammar.add(new TerminalExpressionD());
                    break;
                case "E":
                    grammar.add(new TerminalExpressionE());
                    break;
                default:
                    break;
            }
        }
    }

    public String evaluateMsg(){
        for (AbstractExpression expression:grammar) {
            expression.interpreter(context);
        }
        return context.output;
    }

}
