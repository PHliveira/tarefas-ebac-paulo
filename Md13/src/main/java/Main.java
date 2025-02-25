public class Main {

    public static void main (String args[]){
        Principal principal = new Pfisica(); // chamando a classe abstrata de pfsica
        principal.getCidade(); // chamando a cidade de classse abstrata

        System.out.println("Empresa cidade -> " + principal.getCidade());

        System.out.println("\nDados pessoa fisica\n");

        Pfisica pfisica = new Pfisica();
        pfisica.setEnd("End : rua 1 ");
        pfisica.setNome("\nNome: Juca\n");
        pfisica.setIdade(32);
        System.out.println(pfisica.getEnd() + pfisica.getNome() + "Idade: "+ pfisica.getIdade());

        System.out.println("\nDados pessoa juridica\n");

        Pjurica pjurica = new Pjurica();
        pjurica.setNome("\nNome: Leonardo\n");
        pjurica.setServTipo("\nSeriço: Programação\n ");
        pjurica.setCnpj("CNPJ: 525353/23553-25 ");

        System.out.println(pjurica.getNome() + pjurica.getCnpj() + pjurica.getServTipo());


    }

}
