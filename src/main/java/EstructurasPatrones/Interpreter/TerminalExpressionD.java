package EstructurasPatrones.Interpreter;

public class TerminalExpressionD extends AbstractExpression{
    /* Parámetros según el contexto
    Si en el mensaje (input) encontramos la letra D, la reemplazamos por el número 4 (output) */
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("D")){
            context.output = context.output + "4";
            context.input = context.input.substring(1);
        }
    }
}
