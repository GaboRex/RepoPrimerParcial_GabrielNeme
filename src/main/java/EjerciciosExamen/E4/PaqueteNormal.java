package EjerciciosExamen.E4;

public class PaqueteNormal extends BuilderCombo{
    @Override
    public void buildTipoPipocas() {
     this.combo.setTipoPipocas("Pipocas en envase normal");
    }

    @Override
    public void buildTipoRefresco() {
        this.combo.setTipoRefresco("1 refresco");
    }

    @Override
    public void buildTipoChocolate() {
        this.combo.setTipoChocolate("No cuenta con chocolates");
    }
}
