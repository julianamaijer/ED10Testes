package cadastrar.sucesso.livro;

import org.junit.Assert;
import org.junit.Test;

import entidades.Livro;
import req01.casos.REQ01;

public class REQ01Test {

	REQ01 req01 = new REQ01();

	@Test
	public void testCadastrarLivroComSucesso() {
	
		Livro livro = new Livro("1111", "Machado de Assis", "Brás Cubas");
		Assert.assertEquals(livro, req01.cadastrarLivro(livro));
	}

}
