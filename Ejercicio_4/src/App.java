public class App {
    public static void main(String[] args) throws Exception {

        Cliente miCliente = new Cliente();
        miCliente.setNombre("Diego");
        miCliente.setEdad(19);
        miCliente.setTelefono(942455222);
        miCliente.setCredito(500.0);
        System.out.print("Mi cliente es: ");
        System.out.println(miCliente.getNombre()+"->"+miCliente.getEdad()+"->"+miCliente.getTelefono()+"->"+miCliente.getCredito());

        System.out.println();

        Trabajador miTrabajador = new Trabajador();
        miTrabajador.setNombre("Jorge");
        miTrabajador.setEdad(18);
        miTrabajador.setTelefono(934543678);
        miTrabajador.setSalario(2000.0);
        System.out.print("Mi trabajador es: ");
        System.out.println(miTrabajador.getNombre()+"->"+miTrabajador.getEdad()+"->"+miTrabajador.getTelefono()+"->"+miTrabajador.getSalario());

        System.out.println();
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public Persona(){
        
    }
    public Persona(int edad, String nombre, int telefono){
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public int getEdad(){
        return this.edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getTelefono(){
        return this.telefono;
    }
}

class Cliente extends Persona {
    private double credito;
    
    public Cliente(int edad, String nombre, int telefono, double credito){
        super(edad, nombre, telefono);
        this.credito = credito;
    }
    public Cliente(){

    }

    public void setCredito(double credito){
        this.credito = credito;
    }
    public double getCredito(){
        return this.credito;
    }
}

class Trabajador extends Persona {
    private double salario;
    
    public Trabajador(int edad, String nombre, int telefono, double salario){
        super(edad, nombre, telefono);
        this.salario = salario;
    }

    public Trabajador(){

    }

    public void setSalario(double salario){
        this.salario = salario;
    }
    public double getSalario(){
        return this.salario;
    }
}