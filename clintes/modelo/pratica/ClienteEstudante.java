package clintes.modelo.pratica;

public class ClienteEstudante extends Cliente{

    private String institution;
    public ClienteEstudante(String name, int age, String institution){
        super(name, age);
        this.institution = institution;
    }

    @Override
    public double valorFinalPassagem(double valor){
        return valor / 2;
    }


}
