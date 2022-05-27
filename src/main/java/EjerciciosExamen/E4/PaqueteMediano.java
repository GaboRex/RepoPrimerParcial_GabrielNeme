package EjerciciosExamen.E4;

public class PaqueteMediano extends BuilderCombo {

    @Override
    public void buildTipoPipocas() {
        this.combo.setTipoPipocas("Pipocas grandes");
    }

    @Override
    public void buildTipoRefresco() {
        this.combo.setTipoRefresco("2 vasos de refrescos");

    }

    @Override
    public void buildTipoChocolate() {
        this.combo.setTipoChocolate("1 chocolate");
    }
}
