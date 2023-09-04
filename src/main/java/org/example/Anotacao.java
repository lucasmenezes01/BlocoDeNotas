package org.example;

import java.time.LocalDate;
public class Anotacao {

        private int numero;
        private String texto;
        private LocalDate dataCriacao;
        private boolean deletada;

        public Anotacao(String texto, int numero) {
            this.numero = numero;
            this.texto = texto;
            this.dataCriacao = LocalDate.now();
            this.deletada = false;
        }

        public int getNumero() {
            return numero;
        }

        public String getTexto() {
            return texto;
        }

        public LocalDate getDataCriacao() {
            return dataCriacao;
        }

        public boolean isDeletada() {
            return deletada;
        }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setDeletada(boolean deletada) {
            this.deletada = deletada;

    }
}

