
public class Livro {

    private String titulo;
    private String autor;
    private int ano;
    private String genero;
    private boolean lido;
    private int nota;
    
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro [titulo=" + titulo + ", autor=" + autor + "]";
    }   

}
