public class Perro {
    String raza;
    String nombre;
    int edad;
    String colorPelo;

    // Constructor por defecto (si no defines otro, Java lo crea)
    // public Perro() { ... } // Java lo crea si no hay otros

    // Constructor Parametrizado
    // Recibe valores para inicializar los atributos
    public Perro(String raza, String nombre, int edad, String colorPelo) {
        // Uso de 'this.': Se refiere al atributo de la instancia actual
        // Esto es necesario cuando el parámetro tiene el mismo nombre que el atributo
        this.raza = raza;
        this.nombre = nombre;
        this.edad = edad;
        this.colorPelo = colorPelo;
        System.out.println("Se ha creado un perro llamado " + this.nombre + ".");
    }

    // ... otros métodos ...
 }