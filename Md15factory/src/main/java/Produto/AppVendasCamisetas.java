package Produto;

import AbstractModelo.Camiseta;
import AbstractModelo.CamisetaCasual;
import AbstractModelo.CamisetaEsportiva;

public class AppVendasCamisetas {

    public static void main (String[] args) {


        CamisetaCasual camisetaCasual1 = new CamisetaCasual();
        CamisetaEsportiva camisetaEsportiva = new CamisetaEsportiva();

        camisetaEsportiva.exibirDetalhes();
        camisetaEsportiva.setPreco("R$ 150,00");
        camisetaEsportiva.setCor("\npreto\n");
        camisetaEsportiva.setTamanho("GG");
        System.out.println( camisetaEsportiva.getPreco() + camisetaEsportiva.getCor() + camisetaEsportiva.getTamanho());

        camisetaCasual1.exibirDetalhes();
        camisetaCasual1.setPreco("R$ 450.00");
        camisetaCasual1.setCor("\nCinza\n");
        camisetaCasual1.setTamanho("M");
        System.out.println( camisetaCasual1.getPreco() + camisetaCasual1.getCor() + camisetaCasual1.getTamanho());




    }
}
