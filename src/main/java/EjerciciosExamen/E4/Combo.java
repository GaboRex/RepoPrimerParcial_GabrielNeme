package EjerciciosExamen.E4;

public class Combo {
    private String tipoPipocas;
    private String tipoRefresco;
    private String tipoChocolate;

    public String getTipoPipocas() {
        return tipoPipocas;
    }

    public void setTipoPipocas(String tipoPipocas) {
        this.tipoPipocas = tipoPipocas;
    }

    public String getTipoRefresco() {
        return tipoRefresco;
    }

    public void setTipoRefresco(String tipoRefresco) {
        this.tipoRefresco = tipoRefresco;
    }

    public String getTipoChocolate() {
        return tipoChocolate;
    }

    public void setTipoChocolate(String tipoChocolate) {
        this.tipoChocolate = tipoChocolate;
    }

    public void mostrarInfoCombo(){
        System.out.println("++++ MOSTRAR INFO COMBO ++++");
        System.out.println("Tus pipocas son: " +tipoPipocas);
        System.out.println("Tus refrescos son: " +tipoRefresco);
        System.out.println("Tienes: " +tipoChocolate);
        System.out.println();
    }
}
