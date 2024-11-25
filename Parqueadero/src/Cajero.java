public class Cajero extends Empleado {
    public Cajero(String nombre, String idEmpleaado, String cargo) {
        super(nombre, idEmpleaado, cargo);
    }

    public void procesarPago(){
        System.out.println("El cajero " + getIdEmpelado() + " esta procesando un pago.");
    }
}
