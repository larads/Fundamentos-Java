package pessoa;

public class TesteDePessoa {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.setCpf("333222111");
        professor.setNome("Vini");
        professor.setIdade(21);
        professor.setSalario(20000);

        System.out.println(professor.imprimirDadosDaPessoa());

        Aluno aluno = new Aluno();
        aluno.setCpf("12222121");
        aluno.setNome("aluno");
        aluno.setIdade(12);
    }
}
