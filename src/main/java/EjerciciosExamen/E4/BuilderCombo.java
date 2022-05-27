package EjerciciosExamen.E4;

public abstract class BuilderCombo {
    protected Combo combo;

    public  Combo getProduct(){
        return combo;
    }
    public void prepararCombo(){
        this.combo = new Combo();
    }

    public abstract void buildTipoPipocas();
    public abstract void buildTipoRefresco();
    public abstract void buildTipoChocolate();


}
