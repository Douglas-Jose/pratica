package clintes.modelo.pratica;

public class ClienteIdoso extends Cliente{

    public ClienteIdoso(String name, int age){
        super (name, age);
    }

    @Override
    public double valorFinalPassagem(double valor){
        return valor - valor;
    }
}
