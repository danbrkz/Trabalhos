public class Livro {
    private String titulo;
    private String autor;
    private int paginas;

    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void abrir() {
        System.out.println("O livro '" + titulo + "' foi aberto.");
    }

    public void fechar() {
        System.out.println("O livro '" + titulo + "' foi fechado.");
    }

