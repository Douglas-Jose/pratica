package clintes.modelo.pratica;

public abstract class Cliente {
    private String name;
    private int age;

    public Cliente(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract double valorFinalPassagem(double valor);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
