package org.example

class IdentificadorDePalavrasService {
    List<String> dicionario = ['one', 'two', 'three'];

    String execute(String palavrasEscritas) {
        List<String> tokens = palavrasEscritas.tokenize(",");
        List<String> palavrasDeEntrada = tokens.drop(1).collect { it.trim().toLowerCase() }

        List<String> resultados = [];

        palavrasDeEntrada.each { entrada ->
            dicionario.each { esperado ->
                if (entrada.length() == esperado.length()) {
                    int erros = 0;

                    for (int i = 0; i < esperado.length(); i++) {
                        if (entrada[i] != esperado[i]) {
                            erros++;
                        }
                    }

                    if (erros <= 1) {
                        if (esperado == 'one') resultados.add('1');
                        else if (esperado == 'two') resultados.add('2');
                        else if (esperado == 'three') resultados.add('3');
                    }
                }
            }
        }
        return resultados.join(",");
    }
}