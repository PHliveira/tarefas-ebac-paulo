package Carros;

public  abstract class  AbstractCarros {

    private String cor;
    private int porta;
    private String motor;
    private String cambio;

    public AbstractCarros(String cor, int porta, String motor, String cambio) {
        this.cor = cor;
        this.porta = porta;
        this.motor = motor;
        this.cambio = cambio;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPorta() {
        return porta;
    }

    public void setPorta(int porta) {
        this.porta = porta;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }


}
