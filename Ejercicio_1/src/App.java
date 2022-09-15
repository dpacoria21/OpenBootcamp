public class App {
    public static void main(String[] args){
        //1era Parte
        System.out.println(Suma(1,5,9));
        System.out.println(Suma(10,50,90));
        System.out.println(Suma(1,2,3));

        //2da Parte
        Coche miCoche = new Coche();
        miCoche.aumentarPuertas();
        System.out.println(miCoche);
    }

    public static int Suma(int a, int b, int c) {
        return a+b+c;
    }

}
class Coche {
    private int numPuertas = 4;

    public void aumentarPuertas() {
        this.numPuertas++;
    }

    public String toString() {
        return "Mi auto tiene: "+ numPuertas + " puertas";
    }
}
