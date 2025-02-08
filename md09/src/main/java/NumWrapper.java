public class NumWrapper {



    private char letra = 'a'; // variavel primitiva
    private Long distancia = 77859856L ; // Wrapper - autoBoxing
    private boolean vald = Boolean.TRUE ; // unBoxing
    private int idade = Integer.valueOf(77);



    public static void main(String[] args) {

        NumWrapper test = new NumWrapper() ;

        System.out.println("Tipo Char  primitiva " + test.letra );
        System.out.println("Tipo Long  autoBoxing " + test.distancia );
        System.out.println("Tipo Char  unBoxing " + test.vald );
        System.out.println("Tipo int  unBoxing " + test.idade );
    }





    }
