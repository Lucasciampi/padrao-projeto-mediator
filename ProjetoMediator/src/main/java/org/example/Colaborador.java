package org.example;

public class Colaborador {

    public String reportarProblemaPC(String descricao) {
        return PortalServiceDesk.getInstancia().solicitarConserto(descricao);
    }

    public String elogiarAtendimento(String mensagem) {
        return PortalServiceDesk.getInstancia().enviarElogioTI(mensagem);
    }

    public String solicitarUpgrade(String pedido) {
        return PortalServiceDesk.getInstancia().pedirNovoEquipamento(pedido);
    }

}
