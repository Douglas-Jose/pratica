package clintes.modelo.pratica;

public abstract class Cliente {
    private String name;
    private int age;

    public Cliente(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract double valorFinalPassagem(double valor);
}
