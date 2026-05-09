package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {


    @Test
    void deveReportarProblemaPC() {
        Funcionario funcionario = new Funcionario();
        assertEquals("Chamado registrado no Portal Service Desk.\n" +
                        "Encaminhado para TI\n" +
                        ">>O Suporte de TI abriu um chamado técnico para resolver: Computador não liga",
                funcionario.reportarProblemaPC("Computador não liga"));
    }

    @Test
    void deveRegistrarFeedback() {
        Funcionario funcionario = new Funcionario();
        assertEquals("Agradecemos por usar o Portal para seu feedback.\n" +
                        "Resposta da Equipe técnica conforme mensagem a seguir.\n" +
                        ">>O TI agradece o feedback sobre a infraestrutura: Lentidão no atendimento",
                funcionario.elogiarAtendimento("Lentidão no atendimento"));
    }

    @Test
    void deveSolicitarUpgrade() {
        Funcionario funcionario = new Funcionario();
        assertEquals("Requisição de compra protocolada no Service Desk.\n" +
                        "Status da Equipe técnica conforme mensagem a seguir.\n" +
                        ">>A equipe técnica está verificando a viabilidade do hardware: SSD 1TB",
                funcionario.solicitarUpgrade("SSD 1TB"));
    }

}