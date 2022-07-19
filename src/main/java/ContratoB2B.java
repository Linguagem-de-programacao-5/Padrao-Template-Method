public class ContratoB2B extends Contrato{
    @Override
    public double aplicarDesconto() {
        return this.getValor() - (this.getValor() * 0.20);
    }
    @Override
    public String getTipo() {
        return "B2B";
    }
}
