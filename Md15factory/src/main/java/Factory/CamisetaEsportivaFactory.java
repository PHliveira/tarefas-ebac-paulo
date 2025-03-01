package Factory;

import AbstractModelo.Camiseta;
import AbstractModelo.CamisetaEsportiva;

public class CamisetaEsportivaFactory implements ICamisetaFactory {


    @Override
    public Camiseta criarCamiseta()   {
        return new CamisetaEsportiva();
    }
}
