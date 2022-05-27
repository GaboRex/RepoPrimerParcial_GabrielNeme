package EjerciciosExamen.E4;

import javafx.scene.control.ComboBox;

public class Owner {
    private BuilderCombo builder;

    public Combo getComboListo(){
        return builder.getProduct();
    }

    public void setBuilder(BuilderCombo builder) {
        this.builder = builder;
    }

    public void buildCombo(){
        this.builder.prepararCombo();
        this.builder.buildTipoPipocas();
        this.builder.buildTipoRefresco();
        this.builder.buildTipoChocolate();
    }
}
