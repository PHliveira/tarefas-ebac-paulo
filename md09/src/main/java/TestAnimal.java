import java.util.Scanner;


//  CONTROLE DE FLUXO - IF / ELSE

public class TestAnimal {

    public static void main (String args[]){

        Scanner s = new Scanner(System.in);

        System.out.println("Digite nome do animal :");

         String nomeAnimal = s.next();
         String escolhido = telaAnimal(nomeAnimal);
         System.out.println(escolhido);

    }
        public static String telaAnimal(String escolhido){
            String resposta;
            if( escolhido.equals("peixe") || escolhido.equals("vaca")){
                resposta = "Opção 1 escolhida" ;
            } else if (escolhido.equals("cavalo") ) {
                resposta = "Opção 2 escolhida" ;
            }else {
                resposta = "Opção não registrada!" ;
            }

            return resposta;

        };




}
