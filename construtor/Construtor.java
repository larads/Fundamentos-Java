package construtor;

// Construtor : Método de uma classe que é chamado quando o objeto é instanciado
public class Construtor {

    private int numero;

    // Obrigatoriamente o nome da classe 
    public Construtor(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
