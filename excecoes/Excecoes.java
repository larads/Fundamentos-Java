package excecoes;

public class Excecoes {
    // Checked exceptions == verificadas

    // Unchecked exceptions == não verificadas
    public static void main(String[] args) {
        // try / catch
        try {
            validarNumero();
        } catch (Exception e) {
            System.out.println("Deu Ruim");
        }
    }

    public static void validarNumero() throws Exception {
        int numero = 10;
        if(numero < 100) {
            throw new Exception("O número é menor que 100");
        }
    }
}
