package EstructurasPatrones.Interpreter;

public class TerminalExpressionC extends AbstractExpression{
    /* Parámetros según el contexto
   Si en el mensaje (input) encontramos la letra C, la reemplazamos por el número 3 (output) */
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("C")){
            context.output = context.output + "3";
            context.input = context.input.substring(1);
        }
    }

}
