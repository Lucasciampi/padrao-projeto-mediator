package org.example;

public interface DepartamentoSuporte {
    String processarIncidente(String descricao);
    String registrarFeedback(String mensagem);
    String analisarRequisicao(String pedido);
}