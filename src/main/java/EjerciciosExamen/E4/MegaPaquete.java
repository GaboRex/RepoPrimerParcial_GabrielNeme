package EjerciciosExamen.E4;

public class MegaPaquete extends BuilderCombo{

    @Override
    public void buildTipoPipocas() {
        this.combo.setTipoPipocas("Pipocas extragrandes");
    }

    @Override
    public void buildTipoRefresco() {
        this.combo.setTipoRefresco("3 vasos de gaseosas extragrandes con recarga ilimitada");
    }

    @Override
    public void buildTipoChocolate() {
        this.combo.setTipoChocolate("2 chocolates grandes");

    }
}
