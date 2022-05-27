package EstructurasPatrones.Interpreter;

public class TerminalExpressionB extends AbstractExpression {
    /* Parámetros según el contexto
    Si en el mensaje (input) encontramos la letra B, la reemplazamos por el número 2 (output) */
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("B")){
            context.output = context.output + "2";
            context.input = context.input.substring(1);
        }
    }
}
