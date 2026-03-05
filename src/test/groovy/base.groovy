import spock.lang.Specification


class base extends Specification {
    static IdentificadorDePalavrasService identificadorService;


    void setupSpec() {
        identificadorService = new IdentificadorDePalavrasService();

    }

    void "testando entrada 1 | BaseEnsaio2_750"() {
        given:
        String palavrasDeEntrada = "3,owe,too,theee"
        String saidaEsperada = "1,2,3"

        when:
        String resultadoObtido = identificadorService.execute(palavrasDeEntrada);

        then:
        saidaEsperada == resultadoObtido
    }
}