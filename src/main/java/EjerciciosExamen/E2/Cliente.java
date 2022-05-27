package EjerciciosExamen.E2;

public class Cliente {
    public static void main(String[] args) {
        Televisor tv = new Televisor();
        tv.setSistemaOperativo("Android");
        tv.setVersionSistemaOperativo(11.0);
        tv.setPulgadas(80);
        tv.setResolucion(50);
        tv.setHdmi(true);
        tv.setPuertosUsb(4);
        tv.setControlRemoto(true);
        tv.setBluetooth(true);

        //creando Primero tv

        Televisor tv1 = (Televisor) tv.clone();
        tv1.setSerialTele(1256899010);
        tv1.mostrarInfoTv();

        //creando Segunda tv

        Televisor tv2 = (Televisor) tv.clone();
        tv2.setSerialTele(1156879819);
        tv2.mostrarInfoTv();

        //creando Tercero tv

        Televisor tv3 = (Televisor) tv.clone();
        tv3.setSerialTele(1056879810);
        tv3.mostrarInfoTv();

        //creando Cuarta tv

        Televisor tv4 = (Televisor) tv.clone();
        tv4.setSerialTele(1457899016);
        tv4.mostrarInfoTv();

        //creando Quinto tv
        Televisor tv5 = (Televisor) tv.clone();
        tv5.setSerialTele(1857855575);
        tv5.mostrarInfoTv();
    }
}
