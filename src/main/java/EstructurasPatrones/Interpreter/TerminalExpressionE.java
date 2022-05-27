package EstructurasPatrones.Interpreter;

public class TerminalExpressionE extends AbstractExpression{
    /* Parámetros según el contexto
    Si en el mensaje (input) encontramos la letra E, la reemplazamos por el número 5 (output) */
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("E")){
            context.output = context.output + "5";
            context.input = context.input.substring(1);
        }
    }
}
