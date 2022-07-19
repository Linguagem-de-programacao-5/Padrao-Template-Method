public class ContratoB2C extends Contrato{
    @Override
    public double aplicarDesconto() {
        return this.getValor() - (this.getValor() * 0.10);
    }
}
