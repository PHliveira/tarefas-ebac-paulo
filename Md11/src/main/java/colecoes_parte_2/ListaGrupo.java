package colecoes_parte_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ListaGrupo {



    public static void main (String args[]) {

        Scanner scanner = new Scanner(System.in);

        List<String>nomeF = new ArrayList<>();
        List<String>nomeM = new ArrayList<>();

        System.out.println("Digite 3 nomes masculinos e 3 nomes femininos");

        while (nomeF.size() <3 || nomeM.size() <3) {
            System.out.println("\nDigite o nome da pessoa:");
            String nome = scanner.nextLine();

            System.out.println("Digite o sexo da pessoa (M/F):");
            String sexo = scanner.nextLine().toUpperCase();

            if (sexo.equals("F") || nomeF.size() >= 3){
                nomeF.add(nome);
            }else if (sexo.equals("M") || nomeF.size() <3) {
                nomeM.add(nome);
            }else {
                System.out.println("Dados invalidos repita o processo");
            }


        }
        System.out.println("Lista grupo feminino");
        for (String nome: nomeF){
            System.out.println(nome);
        }
        System.out.println("Lista grupo masculino");
        for (String nome: nomeM){
            System.out.println(nome);
        }

    }


}
