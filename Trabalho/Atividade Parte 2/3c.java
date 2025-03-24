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

    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
}
