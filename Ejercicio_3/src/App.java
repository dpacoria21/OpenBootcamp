public class App {
    public static void main(String[] args) {
        Persona person1 = new Persona();
        person1.setEdad(15);
        person1.setNombre("Diego");
        person1.setTelefono(953286336);
        System.out.println(person1.getNombre()+" --edad--> "+person1.getEdad()+" --telofono--> "+ person1.getTelefono());
    }
}

class Persona {
    
    private int edad;
    private String nombre;
    private int telefono;


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
