public class ParametrosInvalidosException extends RuntimeException{

    public String getMessage(){
        return String.format("O parâmetro 1 deve ser menor do que o parâmetro 2!!!");
    }
    
}
