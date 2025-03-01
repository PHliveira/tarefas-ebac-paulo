package Factory;

import AbstractModelo.Camiseta;
import AbstractModelo.CamisetaCasual;

public class CamisetaCasualFactory implements ICamisetaFactory{


    @Override
    public Camiseta criarCamiseta() {
        return new CamisetaCasual();
    }
}
