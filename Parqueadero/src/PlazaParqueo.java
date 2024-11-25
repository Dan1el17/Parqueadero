public class PlazaParqueo {
    private boolean estaDisponible;
    private boolean esExclusivaParaBicicletas;
    private String id;
    private Estado estado;

    public PlazaParqueo(String id, Estado estado){
        this.id = id;
        this.estado = estado;
        this.estaDisponible = true;
    }

    public void asignarVehiculo(Vehiculo vehiculo){
        if (estado == Estado.DISPONIBLE){
            this.estaDisponible = false;
            this.estado = Estado.OCUPADA;
            String tipoVehiculo = vehiculo.getClass().getSimpleName();
            System.out.println("Vehiculo de tipo: " + tipoVehiculo + " ha sido asignado a la plaza: " + id);
        } else {
            System.out.println("La plaza ya está ocupada.");
        }
    }

    public void liberarPlaza(){
        if (estado == Estado.OCUPADA){
            this.estaDisponible = true;
            this.estado = Estado.DISPONIBLE;
            System.out.println("Plaza liberada: " + id);
        } else {
            System.out.println("La plaza ya esta libre.");
        }
    }

    public void reservarPlaza(){
        if (estado == Estado.DISPONIBLE){
            estado = Estado.RESERVADA;
            System.out.println("Plaza reservada: " + id);
        } else {
            System.out.println("La plaza ya esta reservada.");
        }
    }

    public void cancelarPlaza(){
        if (estado == Estado.RESERVADA){
            estado = Estado.OCUPADA;
            System.out.println("Plaza ocupada: " + id);
        } else {
            System.out.println("La plaza ya esta ocupada.");
        }
    }

    public boolean estaDisponible() {
        return this.estado == Estado.DISPONIBLE;
    }

    public boolean isEstaDisponible() {
        return estaDisponible;
    }

    public void setEstaDisponible(boolean estaDisponible) {
        this.estaDisponible = estaDisponible;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}



