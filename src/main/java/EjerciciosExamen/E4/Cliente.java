package EjerciciosExamen.E4;

public class Cliente {
    public static void main(String[] args) {
        Owner gabriel = new Owner();
        BuilderCombo mega = new MegaPaquete();
        BuilderCombo mediano = new PaqueteMediano();
        BuilderCombo normal = new PaqueteNormal();

        gabriel.setBuilder(mega);
        gabriel.buildCombo();
        Combo c1 = gabriel.getComboListo();
        c1.mostrarInfoCombo();

        gabriel.setBuilder(mediano);
        gabriel.buildCombo();
        Combo c2 = gabriel.getComboListo();
        c2.mostrarInfoCombo();

        gabriel.setBuilder(normal);
        gabriel.buildCombo();
        Combo c3 = gabriel.getComboListo();
        c3.mostrarInfoCombo();


    }
}
