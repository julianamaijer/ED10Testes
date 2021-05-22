package cadastrar.sucesso.livro;

import org.junit.Assert;
import org.junit.Test;

import entidades.Livro;
import req01.casos.LivroInvalido;
import req01.casos.LivroJaCadastradoException;
import req01.casos.REQ01;

public class REQ01Test {


	@Test
	public void testCadastrarLivroComSucesso() {
		REQ01 req01 = new REQ01();

		Livro livro = new Livro("1111", "Machado de Assis", "Brás Cubas");
		Assert.assertEquals(livro, req01.cadastrarLivro(livro));
	}

	@Test(expected = LivroJaCadastradoException.class)
	public void testCadastrarLivroComIsbnJaCadastrado(){
		REQ01 req01 = new REQ01();

		Livro livro1 = new Livro("1111", "Machado de Assis", "Brás Cubas");
		Livro livro2 = new Livro("1111", "Propósito", "Sri Prem Baba");

		req01.cadastrarLivro(livro1);
		req01.cadastrarLivro(livro2);

	}

	@Test(expected = LivroInvalido.class)
	public void testCadastrarLivroComIsbnEmBranco() {
		REQ01 req01 = new REQ01();

		Livro livro = new Livro("", "Machado de Assis", "Brás Cubas");
		Assert.assertEquals(livro, req01.cadastrarLivro(livro));
	}

	@Test(expected = LivroInvalido.class)
	public void testCadastrarLivroComTituloEmBranco() {
		REQ01 req01 = new REQ01();

		Livro livro = new Livro("1111", "", "Brás Cubas");
		Assert.assertEquals(livro, req01.cadastrarLivro(livro));
	}

}
