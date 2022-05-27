package EstructurasPatrones.Interpreter;

public class TerminalExpressionA extends AbstractExpression{
    /* Parámetros según el contexto
    Si en el mensaje (input) encontramos la letra A, la reemplazamos por el número 1 (output) */
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("A")){
            context.output = context.output + "1";
            context.input = context.input.substring(1);
        }
    }
}
