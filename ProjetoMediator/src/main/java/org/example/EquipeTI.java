package org.example;

public class EquipeTI implements DepartamentoSuporte {

    private static EquipeTI instancia = new EquipeTI();

    private EquipeTI() {
    }

    public static EquipeTI getInstancia() {
        return instancia;
    }

    @Override
    public String processarIncidente(String descricao) {
        return "O Suporte de TI abriu um chamado técnico para resolver: " + descricao;
    }

    @Override
    public String registrarFeedback(String mensagem) {
        return "O TI agradece o feedback sobre a infraestrutura: " + mensagem;
    }

    @Override
    public String analisarRequisicao(String pedido) {
        return "A equipe técnica está verificando a viabilidade do hardware: " + pedido;
    }
}