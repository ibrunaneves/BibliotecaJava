package biblioteca;

public class Livro {
    private int id;
    private String titulo;
    private String autor;
    private String genero;
    private int ano;

    public Livro(String titulo, String autor, String genero, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.ano = ano;
    }

    public Livro(int id, String titulo, String autor, String genero, int ano) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.ano = ano;
    }

    public int getId() { return id; }
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public String getGenero() { return genero; }
    public int getAno() { return ano; }

    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setAutor(String autor) { this.autor = autor; }
    public void setGenero(String genero) { this.genero = genero; }
    public void setAno(int ano) { this.ano = ano; }
}
