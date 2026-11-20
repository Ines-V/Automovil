public class Automovil{
    //Usar private para que no se puedan modificar las variables desde la clase TestAutomovil.
    public static final int ANIO_PRIMER_AUTOMOVIL=1886;
    private String modelo;
    private String marca;
    private int anio;

    //Crear el Constructor.
    public Automovil(String modelo, String marca, int anio) {
        setModelo(modelo);
        setMarca(marca);
        setAnio(anio);
    }

    //Poner Getters y Setters de las variables.
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if(modelo==null || modelo.trim().isEmpty()){ //Todos los coches deben de tener un modelo.
            throw new IllegalArgumentException("Debe de haber modelo.");
        }
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if(marca.trim().isEmpty()){ //todos los coches deben de tener una marca
            throw new IllegalArgumentException("Debe de haber marca.");
        }
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        if(anio<ANIO_PRIMER_AUTOMOVIL) { //Los años deben de ser igual o superiores a 1886, cuando se hizo el primer coche.
            throw new IllegalArgumentException("El año de creación del coche debe de ser igual o mayor que 1886.");
        }

        this.anio = anio;
    }

    public void mostrarInformacion(){
        System.out.println("Modelo: "+modelo);
        System.out.println("Marca: "+marca);
        System.out.println("Año: "+anio);
    }

    //String() para que se ejecute directamente el proyecto.
    @Override
    public String toString() {
        return "Automovil{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", anio=" + anio +
                '}';
    }
}