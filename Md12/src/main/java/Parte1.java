import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Parte1 {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        Set<String> conjunto = new TreeSet<>();   // lista para chamar de forma ordernada os nomes

        System.out.println("Lista de nomes");
        System.out.println("Digite os nomes para a lista e Digite 'sair' para encerrar.");


        while (true){  // comando para entrada de dados e fazer a saida do programa .

            String entrada = scanner.nextLine().toUpperCase();

            if (entrada.equals("SAIR")){
                break;
            }
            String[] nomes = entrada.split(",");    // Joga a entrada em (Array )aqui pega as entradas e quebra onde tem a virgula


            for (String nome : nomes){  // faz leitura do Array criado acima
                conjunto.add(nome.trim()); // tira os espaços
            }

        }

        System.out.println("\nProcessando os nomes inseridos...\n");



        for (String lista : conjunto){  // chama a lista treeSet  tratada
            System.out.println("Nomes: " + lista);
        }




    }
}
