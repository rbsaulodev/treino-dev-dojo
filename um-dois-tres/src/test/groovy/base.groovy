import org.example.IdentificadorDePalavrasService
import spock.lang.Specification


class base extends Specification {
    static IdentificadorDePalavrasService identificadorService;


    void setupSpec() {
        identificadorService = new IdentificadorDePalavrasService();

    }

    void "testando entrada 1 | BaseEnsaio2_150"() {
        given:
        String palavrasDeEntrada = "3,owe,too,theee"
        String saidaEsperada = "1,2,3"

        when:
        String resultadoObtido = identificadorService.execute(palavrasDeEntrada);

        then:
        saidaEsperada == resultadoObtido
    }

    void "testando entrada 2 | BaseEnsaio2_750"() {
        given:
        String palavrasDeEntrada = "2,owe,too"
        String saidaEsperada = "1,2"

        when:
        String resultadoObtido = identificadorService.execute(palavrasDeEntrada);

        then:
        saidaEsperada == resultadoObtido
    }

    void "testando entrada 3 | BaseEnsaio2_250"() {
        given:
        String palavrasDeEntrada = "2,too,owe"
        String saidaEsperada = "2,1"

        when:
        String resultadoObtido = identificadorService.execute(palavrasDeEntrada);

        then:
        saidaEsperada == resultadoObtido
    }
}