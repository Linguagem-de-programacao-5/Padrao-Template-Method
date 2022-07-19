import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContratoB2CTest {
    @Test
    void deveRetornarValorDesconto(){
        ContratoB2C contrato = new ContratoB2C();
        contrato.setValor(99.90);
        assertEquals(89.91, contrato.aplicarDesconto());
    }
    @Test
    void deveRetornarInformacaoes(){
        ContratoB2C contrato = new ContratoB2C();
        contrato.setNomeCliente("Jose");
        contrato.setCod(2);
        contrato.setValor(99.90);
        assertEquals("Contrato B2C {codigo=2, nomeCliente='Jose', valor=99.9}", contrato.getInfo());
    }
}