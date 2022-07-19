import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContratoB2BTest {

    @Test
    void deveRetornarValorDesconto(){
        ContratoB2B contrato = new ContratoB2B();
        contrato.setValor(99.90);
        assertEquals(79.92, contrato.aplicarDesconto());
    }
    @Test
    void deveRetornarInformacaoes(){
        ContratoB2B contrato = new ContratoB2B();
        contrato.setNomeCliente("Jose");
        contrato.setCod(1);
        contrato.setValor(99.90);
        assertEquals("Contrato B2B {codigo=1, nomeCliente='Jose', valor=99.9}", contrato.getInfo());
    }
}