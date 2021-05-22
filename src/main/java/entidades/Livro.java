package entidades;

public class Livro {
	
	private String isbn;
	
	private String titulo;

	private String autor;

	public Livro() {
	}

	public Livro(String ibsn, String titulo, String autor) {
		this.isbn = ibsn;
		this.titulo = titulo;
		this.autor = autor;
	}
	
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	

}
