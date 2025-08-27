import java.time.LocalDate;

public class Book {
    //Atributos
    private String title; //null
    private String author;
    private Integer pages; //Integer -> int  Clase wrapper Integer envolver una tipo de dato int
                           //Character -> cahr, Byte, Short, Long, Float, Double, Boolean
    private LocalDate publishDate; //null
    private String editor;
    private String category;


    // Constructores -> inicializar el objeto
    // Autoboxing -> int --> Integer
    // Unboxing -> Integer --> int
    public Book(){
        title = "The best";
        author = "Andy Torres";
        pages = 126;
        publishDate = LocalDate.now();
        editor = "McGrawHill";
        category = "Personal construction";
    }
    
    public Book(String title, String author, Integer pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        publishDate = LocalDate.now();
        editor = "McGrawHill";
        category = "Action";
 
    }

    public Book(String title, String author, Integer pages, LocalDate publishDate, String editor, String category) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.publishDate = publishDate;
        this.editor = editor;
        this.category = category;
    }

    
 
    //Metodos
}