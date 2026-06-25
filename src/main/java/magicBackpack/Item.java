package magicBackpack;

public class Item {
    private String nome;
    private int valor;
    private int cod;

    public Item(String nome, int valor, int cod) {
        this.nome = nome;
        this.valor = valor;
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public int getValor() {
        return valor;
    }

    public int getCod() {
        return cod;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(int valor){
        this.valor = valor;
    }

    @Override
    public String toString() {
        return nome + " | Gold: " + valor;
    } 
}
