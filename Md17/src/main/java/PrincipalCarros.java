import Carros.AbstractCarros;
import Carros.ModeloDois;
import Carros.ModeloTrês;
import Carros.ModeloUm;

import java.util.ArrayList;
import java.util.List;

public class PrincipalCarros  {



    public static void main (String[] args){

      ModeloUm modeloUm = new ModeloUm("Vermelho", 4, "2.0", "Automático");
      ModeloDois modeloDois = new ModeloDois("Vinho", 2, "1.0", "Automático");
      ModeloTrês modeloTrês = new ModeloTrês("Prata ", 4, "2.8 ", "Automático ");



// usando generics  list para atribuir valor as outras classses modelosUm , Dois , Tres
        List<AbstractCarros>  listaAcessorios = new ArrayList<>();

        listaAcessorios.add(new ModeloUm("Azul",2,null,"manual" ));
        listaAcessorios.add(new ModeloDois("Roxo",5,"1.8","manual" ));
        listaAcessorios.add(new ModeloTrês("Rosa",5,"3.0","manual"));


        for(AbstractCarros lista : listaAcessorios){
            System.out.println("Modelo : " + lista.getClass());
            System.out.println("Cor: " + lista.getCor());
            System.out.println("Portas: "+ lista.getPorta());
            System.out.println("Motor: " + lista.getMotor());
            System.out.println("Câmbio: " + lista.getCambio());
            System.out.println("--------------------");
        }




        }


    }

