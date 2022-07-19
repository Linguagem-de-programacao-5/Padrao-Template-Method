public abstract class Contrato {

    private int cod;
    private String nomeCliente;
    private double valor;

    public abstract double aplicarDesconto();

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipo(){
        return  "B2C";
    }

    public String getInfo(){
        return "Contrato "+ getTipo()+" {" +
                "codigo=" + cod +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", valor=" + valor + '}';
    }

}
