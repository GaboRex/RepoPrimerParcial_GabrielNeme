package EjerciciosExamen.E2;

public class Televisor {
    //varia
    private int serialTele;
    //no varian
    private String sistemaOperativo;
    private int versionSistemaOperativo;
    private int pulgadas;
    private int resolucion;
    private Boolean hdmi;
    private int puertosUsb;
    private Boolean controlRemoto;
    private Boolean bluetooth;

    public Televisor() {}

    public int getSerialTele() {
        return serialTele;
    }

    public void setSerialTele(int serialTele) {
        this.serialTele = serialTele;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public int getVersionSistemaOperativo() {
        return versionSistemaOperativo;
    }

    public void setVersionSistemaOperativo(int versionSistemaOperativo) {
        this.versionSistemaOperativo = versionSistemaOperativo;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getHdmi() {
        return hdmi;
    }

    public void setHdmi(Boolean hdmi) {
        this.hdmi = hdmi;
    }

    public int getPuertosUsb() {
        return puertosUsb;
    }

    public void setPuertosUsb(int puertosUsb) {
        this.puertosUsb = puertosUsb;
    }

    public Boolean getControlRemoto() {
        return controlRemoto;
    }

    public void setControlRemoto(Boolean controlRemoto) {
        this.controlRemoto = controlRemoto;
    }

    public Boolean getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(Boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    @Override
    public Object clone(){
        Televisor cloneTv = new Televisor();
        cloneTv.setSerialTele(this.getSerialTele());
        cloneTv.setSistemaOperativo(this.getSistemaOperativo());
        cloneTv.setVersionSistemaOperativo(this.getVersionSistemaOperativo());
        cloneTv.setPulgadas(this.getPulgadas());
        cloneTv.setResolucion(this.getResolucion());
        cloneTv.setHdmi(this.getHdmi());
        cloneTv.setPuertosUsb(this.getPuertosUsb());
        cloneTv.setControlRemoto(this.getControlRemoto());
        cloneTv.setBluetooth(this.getBluetooth());
        return cloneTv;
    }


    public void mostrarInfoTv(){
        System.out.println("++++ MOSTRAR INFO TELEVISOR ++++");
        System.out.println("Tus pipocas son: " +tipoPipocas);
        System.out.println("Tus refrescos son: " +tipoRefresco);
        System.out.println("Tienes: " +tipoChocolate);
        System.out.println();
    }
    }
}
