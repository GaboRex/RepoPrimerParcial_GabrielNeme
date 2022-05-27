package EjerciciosExamen.E3;

import java.util.Locale;

public class FactoryArtefacto {
    public static IArtefacto make(String typeProduct){
        IArtefacto artefacto;
        switch (typeProduct.toLowerCase()){
            case "televisor":
                artefacto = new Tv();
                break;
            case "radio":
                artefacto = new Radio();
                break;
            case "batidora":
                artefacto = new Batidora();
                break;
            case "refrigerador":
                artefacto = new Refrigerador();
                break;
            default:
                artefacto = new Microondas();
                break;
        }
        return artefacto;
    }
}
