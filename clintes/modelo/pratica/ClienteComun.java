package clintes.modelo.pratica;

public class ClienteComun extends Cliente{
    public ClienteComun(String name, int age) {
        super(name, age);
        }

    @Override
    public double valorFinalPassagem(double valor) {
        return valor;
    }


}

