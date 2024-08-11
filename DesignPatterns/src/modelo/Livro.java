package modelo;

public class Livro {
    private String id;
    private String titulo;
    private String autor;

    public Livro(String id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
}
