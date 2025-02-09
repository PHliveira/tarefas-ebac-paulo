public class Notas {

    public static void main (String args[]) {


        System.out.println("Classificação para prova");

        for (int i=0 ; i<=10 ; i++){
         if (i>=0 && i<=4){
             System.out.println("Nota menor que 5 " + i+ " Reprovado");
            }else if(i>=5 && i<=6){
             System.out.println("Nota regular  " + i+ " Recuperação");
            }else if(i>=7 && i<=10) {
             System.out.println("Nota excelente  " + i + " Parabéns");
         }

         }

    }



}
