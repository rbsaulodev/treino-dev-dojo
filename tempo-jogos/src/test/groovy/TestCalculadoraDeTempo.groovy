import org.example.CalcularTempoService
import spock.lang.Specification


class TestCalculadoraDeTempo extends Specification{
    static CalcularTempoService calcularTempoService;

    void setupSpec(){
        calcularTempoService = new CalcularTempoService();
    }

    void "testando entrada 1 | base_1"(){
        given:
        int[] entrada = [7, 8, 9, 10];
        String saidaEsperada = "O JOGO DUROU 2 HORA(S) E 2 MINUTO(S)";

        when:
        String retorno = calcularTempoService.execute(entrada);

        then:
        retorno == saidaEsperada;
    }

    void "testando entrada 2 | base_2"(){
        given:
        int[] entrada = [7, 7, 7, 7];
        String saidaEsperada = "O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)";

        when:
        String retorno = calcularTempoService.execute(entrada);

        then:
        retorno == saidaEsperada;
    }

    void "testando entrada 3 | base_3"(){
        given:
        int[] entrada = [7, 10, 8, 9];
        String saidaEsperada = "O JOGO DUROU 0 HORA(S) E 59 MINUTO(S)";

        when:
        String retorno = calcularTempoService.execute(entrada);

        then:
        retorno == saidaEsperada;
    }


}