import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Parte2 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set<String> grupoMasculino = new TreeSet<>();
        Set<String> grupoFeminino = new TreeSet<>();

        System.out.println("Lista de nomes separados por gênero");
        System.out.println("Use -M para nomes masculinos em uma linha e na outra linha -F para nomes femininos. Exemplo: -MJoão,-MPedro ou -FMaria,-FAna");
        System.out.println("Digite 'SAIR' para encerrar.");


            while(true)

    {
        String entrada = scanner.nextLine().toUpperCase();

        if (entrada.equals("SAIR")) {
            break;
        }

        // Verifica o prefixo e adiciona os nomes ao grupo correspondente
        if (entrada.startsWith("-M")) {
            String[] nomes = entrada.split(",");
            for (String nomem : nomes) {
                grupoMasculino.add(nomem.trim().substring(2));
            }
        } else if (entrada.startsWith("-F")) {
            String[] nomes = entrada.split(",");
            for (String nomef : nomes) {
                grupoFeminino.add(nomef.trim().substring(2));
            }
        } else {
            System.out.println("Entrada inválida! Use -M para masculino ou -F para feminino.");
        }
    }

    // Exibição das listas ordenadas
            System.out.println("\nProcessando os nomes inseridos...\n");

            System.out.println("Grupo Masculino:");
            for(
    String nome :grupoMasculino)

    {
        System.out.println("Nome: " + nome);
    }

            System.out.println("\nGrupo Feminino:");
            for(
    String nome :grupoFeminino)

    {
        System.out.println("Nome: " + nome);
    }

    }
}





