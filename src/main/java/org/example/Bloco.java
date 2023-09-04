package org.example;

import java.util.ArrayList;
import java.util.List;

public class Bloco {

    private List<Anotacao> anotacoes;

    public Bloco(){
        this.anotacoes = new ArrayList<>();
    }

    public void adicionar (String texto){
        Anotacao anotacao = new Anotacao(texto, this.anotacoes.size()+1);

        for (Anotacao a : this.anotacoes){
            if (a.getTexto().equals(anotacao.getTexto())){
                System.out.println("A anotação já foi adicionada.");
                return;
            }
        }

        this.anotacoes.add(anotacao);
        System.out.println("Anotação adicionada com ssucesso.");
    }

    public void editarNota (Anotacao anotacao, String texto){
        for (Anotacao a : this.anotacoes){
            if (a.getTexto().equals(anotacao.getTexto())){
                a.setTexto(texto);
                System.out.println("Edição feita com sucesso");
                return;
            }
        }
        System.out.println("Nota não encontrada.");
    }

}

