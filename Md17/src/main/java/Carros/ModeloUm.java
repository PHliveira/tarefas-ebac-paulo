package Carros;

public class ModeloUm extends AbstractCarros{

    private int roda;
    private String marca;

    public ModeloUm(String cor, int porta, String motor, String cambio) {
        super(cor, porta, motor, cambio);
    }

    public ModeloUm(String cor, int porta, String motor, String cambio, int roda, String marca) {
        super(cor, porta, motor, cambio);
        this.roda = roda;
        this.marca = marca;
    }

    public int getRoda() {
        return roda;
    }

    public void setRoda(int roda) {
        this.roda = roda;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
