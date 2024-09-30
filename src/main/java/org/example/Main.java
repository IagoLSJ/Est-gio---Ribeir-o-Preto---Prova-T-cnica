package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static List<Integer> sequanciaFib(int n) {
        List<Integer> sequencia = new ArrayList<>();
        sequencia.add(0);
        sequencia.add(1);

        while (true) {
            int ultimo = sequencia.get(sequencia.size() - 1);
            int antepenultimo = sequencia.get(sequencia.size() - 2);
            int nextFib = ultimo + antepenultimo;
            if (nextFib > n) {
                break;
            }
            sequencia.add(nextFib);
        }
        return sequencia;
    }

    public static String verificarNumero(int num) {
        List<Integer> fibSequence = sequanciaFib(num);
        if (fibSequence.contains(num)) {
            return "O número " + num + " pertence à sequência de Fibonacci.";
        } else {
            return "O número " + num + " não pertence à sequência de Fibonacci.";
        }
    }

    public static Map<String, Integer> verificarString(String text){
       int cont = 0;
       Map<String, Integer> response = new HashMap<>();
        if(text.contains("a") || text.contains("A")){
            for(char c : text.toCharArray()){
                if(c == 'a' || c == 'A'){
                    cont++;
                }
            }
            response.put("Existe", cont);
        }else {
            response.put("Não Existe", cont);
        }
        return response;
    }

    public static void main(String[] args) {
        System.out.println(verificarNumero(10));
        System.out.println(verificarNumero(1));
        System.out.println(verificarString("BAnanA"));
        System.out.println(verificarString("Noite"));
        // A resposta da 3 e 77
        // Questão 4
        // A) 1, 3, 5, 7, 9, 11, 13.
        // B) 2, 4, 8, 16, 32, 64, 128, 256.
        // C) 0, 1, 4, 9, 16, 25, 36, 49, 64, 81, 100.
        // D) 4, 16, 36, 64, 100, 144, 196.
        // E) 1, 1, 2, 3, 5, 8, 13, 21, 34.
        // F) 2, 10, 12, 16, 17, 18, 19, 20, 21, 23.

        // Questão 5
        // Primeiro liga o interruptor 1 deixa ele ligado por 10 minutos, passado esse tempo
        // desliga o interruptor 1 e liga o 2, deixa o 3 desligado
        // ai vai na sala das lampadas e a lampada que tiver ligada e do interruptor 2
        // e a lampada que estiver apagada e fria e do 3 e a que estiver apagada e quante e do 1
    }
}