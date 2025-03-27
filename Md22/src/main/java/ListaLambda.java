import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class ListaLambda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nomeF = new ArrayList<>();
        List<String> nomeM = new ArrayList<>();

        System.out.println("Digite os nomes com F para (feminino) e M para(masculino) e Fim para finalizar a lista.");
        System.out.println("Exemplo feminino (Julia F)  Exemplo feminino (Marcos M) ");

        Stream.generate(scanner::nextLine) //lê linhas do console usando scanner::nextLine
                .takeWhile(entrada -> !entrada.equalsIgnoreCase("fim")) //lendo entradas até que o usuário digite "fim"
                .map(String::toUpperCase) // Converte a entrada para minúsculas
                .forEach(nome -> {  // Percorre a lista
                    if(nome.endsWith("F")){ // condicao de separa pela letra final no nome
                        nomeF.add(nome);
                    }else if (nome.endsWith("M")){
                        nomeM.add(nome);
                    }
                });

        System.out.println("Nomes com Femeninos " + nomeF);
        System.out.println("Nomes com Masculinos " + nomeM);

    }

}
