public class Pjurica extends Principal{

    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getServTipo() {
        return servTipo;
    }

    public void setServTipo(String servTipo) {
        this.servTipo = servTipo;
    }

    private String end;
    private String cnpj;
    private String servTipo;

    @Override
    public String Empresa() {
        return "";
    }
}
