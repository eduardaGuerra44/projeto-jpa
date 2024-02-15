package br.com.pessoal.aplicacao;

import br.com.pessoal.modelo.Pessoa;

public class Programa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(1, "Maria Guerra", "mariaguerra@gmail.com");
        Pessoa p2 = new Pessoa(2, "Matheus Henrique", "matheusgiancott@gmai.com");
        Pessoa p3 = new Pessoa(3, "Lia Guerra", "liaguerra@gmail.com");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
