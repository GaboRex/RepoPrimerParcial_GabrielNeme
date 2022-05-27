package EjerciciosExamen.E3;

public class Batidora implements IArtefacto{
    private int precio;

    public Batidora(int precio) {
        this.precio = precio;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Creando Batidora ");
        System.out.println("Su precio es de: " +precio);
        System.out.println("Gracias por su compra:)");
    }
}
