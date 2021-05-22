package req01.casos;

public class LivroInvalido extends RuntimeException {

    public LivroInvalido(String s) {
        super(s);
    }
}
