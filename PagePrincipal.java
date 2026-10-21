package ListaTarefa;

import java.time.LocalDateTime;

public class PagePrincipal {
    public static void main(String[] args) {
        Lista tarefa = new Lista(LocalDateTime.now().plusDays(10), "Finalizar relatório", "Completar o relatório anual");

        tarefa.titulo("teste");
        tarefa.descricao("affiiinnns de teste");

        tarefa.listagem();

        // -------------------------------------------------------------

        tarefa.titulo("mais 1 teste");
        tarefa.descricao("estou escrevendo mais um teste");

        tarefa.listagem();
    }
}