package EjerciciosExamen.E3;


public class Cliente {
    public static void main(String[] args) {
        Artefacto arte1 = new Artefacto();
        arte1.setMarca("Samsung");
        arte1.setPrecio(5000);
        IArtefacto a1 = FactoryArtefacto.make("Televisor");
        a1.mostrarInfo();
    }
}
