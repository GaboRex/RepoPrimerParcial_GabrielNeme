package EjerciciosExamen.E3;

public class Radio implements IArtefacto{
    private int precio;

    public Radio(int precio) {
        this.precio = precio;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Creando Radio ");
        System.out.println("Su precio es de: " +precio);
        System.out.println("Gracias por su compra:)");
    }
}
