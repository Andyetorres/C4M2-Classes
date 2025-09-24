import java.time.LocalDate;

public class Book {
    //Atributos
    private String title; //null
    private String author; //null
    private Integer pages; //Integer -> int  Clase wrapper Integer envolver una tipo de dato int
                           //Character -> cahr, Byte, Short, Long, Float, Double, Boolean
    private LocalDate publishDate; //null
    private String editor; //null
    private String category; //null


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
        this. author = author;
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
    public String giveMeYourTitle() {
        return this.title;
    }

    //Metodo getter --> Obtener los valores de los atributos get<Atributo>()
    
    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public Integer getPages() {
        return pages;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public String getEditor() {
        return editor;
    }

    public String getCategory() {
        return category;
    }

    //Metodos setter -> Cambia de manera directa el valor del producto -> set(Atributo)(TD par)

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return String.format("Libro: titulo=%s, autor=%S, paginas=%s, publicacion=%s, editorial=%s, categoria=%s", 
        getTitle(),getAuthor(),
        getPages().toString(),getPublishDate().toString(),
        getEditor(),getCategory());
        //return "Libro[ title: "+title+", author: "+author+", pages: "+pages+"]";
    }
}