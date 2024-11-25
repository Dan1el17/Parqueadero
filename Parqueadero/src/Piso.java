import java.util.ArrayList;
import java.util.List;

public class Piso {
    private int numero;
    private int totalPlazas;
    private List<PlazaParqueo> plazas;

    public Piso(int numero, int totalPlazas) {
        this.numero = numero;
        this.totalPlazas = totalPlazas;
        this.plazas = new ArrayList<>();
    }

    public void agregarPlaza(PlazaParqueo plaza) {
        if (plazas.size() < totalPlazas) {
            plazas.add(plaza);
            System.out.println("Plaza agregada al piso " + numero + ": " + plaza.getId());
        } else {
            System.out.println("No se pueden agregar más plazas. El piso " + numero + "esta lleno.");
        }
    }

    public void mostrarPlazasDisponibles(){
        System.out.println("Plazas en el piso " + numero + ":");
        for (PlazaParqueo plaza : plazas){
            if (!plaza.isEstaDisponible()){
                System.out.println("Plaza ocupada: " + plaza.getId());
            }
        }
    }

    public void mostrarPlazasOcupadas() {
        System.out.println("Plazas ocupadas en el piso " + numero + ":");
        for (PlazaParqueo plaza : plazas){
            if (!plaza.isEstaDisponible()){
                System.out.println("Plaza ocupada: " + plaza.getId());
            }
        }

    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getTotalPlazas(){
        return totalPlazas;
    }

    public void setTotalPlazas(int totalPlazas){
        this.totalPlazas = totalPlazas;
    }

    public List<PlazaParqueo> getPlazas(){
        return plazas;
    }

    public void setPlazas(List<PlazaParqueo> plazas){
        this.plazas = plazas;
    }
}
