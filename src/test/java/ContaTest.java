import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ContaTest {
    @Test
    void verificarSaldoDaConta() {
        Conta conta = new Conta();
        conta.depositar(4500.60);
        assertEquals(4500.60,conta.saldo);
    }
}