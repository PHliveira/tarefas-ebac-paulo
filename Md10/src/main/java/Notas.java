import jdk.jshell.execution.Util;

import javax.swing.text.Utilities;
import java.util.Scanner;

public class Notas {

    public static void main (String args[]) {


        System.out.println("Classificação para prova");
        System.out.println("Digite 4 notas para a sua Média :");
        Scanner s = new Scanner(System.in);
        Integer n1 = s.nextInt();
        Integer n2 = s.nextInt();
        Integer n3 = s.nextInt();
        Integer n4 = s.nextInt();

        Integer soma = n1+n2+n3+n4  ;
        Float media = (float) (soma /4) ;

        System.out.println("Sua media é " + media);

        if(media>=0 && media<=4){
            System.out.println(" Você está Reprovado" );
        } else if (media>=5 && media<=6) {
            System.out.println("  Você está de Recuperação" );
        } else if (media>=7 && media<=10) {
            System.out.println("Você está Aprovado" );
        }


    }

    }




