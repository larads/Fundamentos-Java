package primeirasAulas;

import java.util.ArrayList;
import java.util.List;

public class EstruturadeDados {
    public static void main(String[] args) {
        //Lista
        List<String> nomes = new ArrayList<String>();
        nomes.add("Mari");
        nomes.add("Vini");

        // System.out.println(nomes.get(1));
        // for ( String nome : nomes ) {
        //     System.out.println("O nome é " + nome);
        // }

        nomes.forEach(nome -> System.out.println(" nome : " + nome));
    }
}
