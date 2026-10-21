package ListaTarefa;

import java.time.LocalDateTime;

public class Lista {

    // variaveis
    private LocalDateTime dataPrazo, dataVencimento;
    private String titulo, descricao;
    private char status;

    private Object[] lista;

    // Construtor
    public Lista(LocalDateTime dataPrazo, String titulo, String descricao) {
        this.dataPrazo = dataPrazo;
        
        this.dataVencimento = dataPrazo.minusDays(5); 

        this.titulo = titulo;
        this.descricao = descricao;
        this.status = 'P'; 
    }   


    // getters -> só pegar o valor que já tem e msotrar
    public LocalDateTime dataPrazo()
    {
        System.out.println("data do prazo: \n");
        return this.dataPrazo;
    }

    public LocalDateTime dataVencimento()
    {
        System.out.println("data de vencimento do prazo: \n");
        return this.dataVencimento;
    }

    public void listagem()
    {
        if(this.lista == null)
        {
            System.out.println("Lista vazia...");
        }

        for(int i = 0; i < this.lista.length; i++)
        {
            System.out.println(this.lista[i]);
        }
    }


    // setters -> inserir um valor, ou substituir um valor que está em uma variavel

    public void titulo(String title)
    {
        if(title.isEmpty())
        {
            System.out.println("Não envie em branco");
            return;
        }

        this.titulo = title;
        Listagem();
    }

    public void descricao(String descript)
    {
        if(descript.isEmpty())
        {
            System.out.println("Não envie em branco");
            return;
        }

        this.descricao = descript;
        Listagem();
    }

    private void Listagem()
    {
        this.lista = new Object[]{this.titulo, this.descricao};
    }
}