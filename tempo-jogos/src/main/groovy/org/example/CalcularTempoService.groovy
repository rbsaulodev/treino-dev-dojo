package org.example

class CalcularTempoService {

    String execute(int[] array){
        if(array.length != 4){
            throw new IllegalArgumentException("A lista deve conter apenas hora inicial, minuto inicial, hora final e minuto final! ");
        }

        if (array[0] < 0 || array[0] > 23 || array[2] < 0 || array[2] > 23) {
            throw new IllegalArgumentException("Horas devem estar entre 0 e 23")
        }
        if (array[1] < 0 || array[1] > 59 || array[3] < 0 || array[3] > 59) {
            throw new IllegalArgumentException("Minutos devem estar entre 0 e 59")
        }

        int inicioTotal = array[0] * 60 + array[1]
        int fimTotal = array[2] * 60 + array[3]

        int duracaoTotalMinutos = fimTotal - inicioTotal

        if (duracaoTotalMinutos <= 0) {
            duracaoTotalMinutos += 24 * 60
        }

        int horas = duracaoTotalMinutos / 60
        int minutos = duracaoTotalMinutos % 60

        return "O JOGO DUROU ${horas} HORA(S) E ${minutos} MINUTO(S)"
    }
}
