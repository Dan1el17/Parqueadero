public class ClienteRegular extends Usuario{
    private boolean suscripcionActiva;
    private int duracionMembresia;

    public ClienteRegular(String nombre, String apellido, String cedula, String telefono, String metodoPago){
        super(nombre, apellido, cedula, telefono);
        this.suscripcionActiva = true;
        this.duracionMembresia = duracionMembresia;
    }

    public void realizarReserva(PlazaParqueo reserva) {
        if (reserva.estaDisponible()) {
            reserva.reservarPlaza();
            System.out.println("El cliente " + getNombre() + " ha reservado la plaza " + reserva.getId() + " por " + reserva.getEstado() + " minutos.");
        } else {
            System.out.println("La plaza " + reserva.getId() + " no está disponible para reservar.");
        }
    }

    public void imprimirDetallesMembresia(){
        System.out.println("El cliente " + getNombre() + " tiene una membresia de " + duracionMembresia + " dias.");
    }

    public boolean isSuscripcionActiva(){
        return suscripcionActiva;
    }

    public void setSuscripcionActiva(boolean suscripcionActiva){
        this.suscripcionActiva = suscripcionActiva;
    }

    public int getDuracionMembresia(){
        return duracionMembresia;
}

    public void setDuracionMembresia(int duracionMembresia){
        this.duracionMembresia = duracionMembresia;
    }

}
