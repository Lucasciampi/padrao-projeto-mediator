package org.example;

public class PortalServiceDesk {

    private static PortalServiceDesk instancia = new PortalServiceDesk();

    private PortalServiceDesk() {}

    public static PortalServiceDesk getInstancia() {
        return instancia;
    }

    public String solicitarConserto(String descricao) {
        return "Chamado registrado no Portal Service Desk.\n" +
                "Encaminhado para TI\n" +
                ">>" + EquipeTI.getInstancia().processarIncidente(descricao);
    }

    public String enviarElogioTI(String mensagem) {
        return "Agradecemos por usar o Portal para seu feedback.\n" +
                "Resposta da Equipe técnica conforme mensagem a seguir.\n" +
                ">>" + EquipeTI.getInstancia().registrarFeedback(mensagem);
    }

    public String pedirNovoEquipamento(String pedido) {
        return "Requisição de compra protocolada no Service Desk.\n" +
                "Status da Equipe técnica conforme mensagem a seguir.\n" +
                ">>" + EquipeTI.getInstancia().analisarRequisicao(pedido);
    }

}
