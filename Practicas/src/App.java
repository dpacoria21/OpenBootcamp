public class App {
    public static void main(String[] args) throws Exception {
        Taxi miUber = new Taxi();
        miUber.setMarca("Taparaco");
        miUber.setNumPuertas(4);
        miUber.setSonido("brrrrruuuuummm!!!");
        System.out.println(miUber.getMarca()+"---"+miUber.getNumPuertas()+"---"+miUber.getSonido());
        miUber.sonidoDeArranque();
        miUber.mostrarPrecio(20);
    }
}
abstract class Vehiculo {
    private int numPuertas;
    private String marca;
    protected String sonido;

    public int getNumPuertas(){
        return this.numPuertas;
    }
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String m){
        this.marca = m;
    }
    public void setNumPuertas(int n){
        this.numPuertas = n;
    }

    public void sonidoDeArranque() {
        System.out.println("pipiippiippiip");
    }
    abstract public String getSonido();
    abstract public void setSonido(String son);
}

class Taxi extends Vehiculo implements Precios{

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    public String getSonido() {
        return this.sonido;
    }

    public void sonidoDeArranque() {
        System.out.println("Parapapaprapaprappara");
    }
    public void mostrarPrecio(double distancia) {
        System.out.println("El precio a cobrar es: "+(multiplicador*distancia));
    }
}

interface Precios{
    double multiplicador = 5;
    public void mostrarPrecio(double distancia);
}
