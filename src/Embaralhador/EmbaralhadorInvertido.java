package Embaralhador;

public class EmbaralhadorInvertido implements Embaralhador {
    private static final String DIFICULDADE = "Palavra Invertida";
    
    @Override
    public String embaralhar(String palavra) {
        return new StringBuilder(palavra).reverse().toString();
    }

    @Override
    public String getDificuldade() {
        return DIFICULDADE;
    }
}
