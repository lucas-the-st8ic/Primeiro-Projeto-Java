//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

void main() {
    IO.println("Bem-vindo ao Orbit Stream!!");
    IO.println("Filme: Scarface");

    int anoDeLancamento = 1984;
    IO.println("Ano de Lançamento: " + anoDeLancamento);

    boolean incluidoNoPlano = true;
    double notaDofilme = 8.3;

    double media = (notaDofilme + 9.8 + 8.0) / 3;
    System.out.println(media);
    String nomeDoFilme = "Scarface";
    String nomeDoDiretor = "Diretor";
    String sinopse = """
            Após receber residência permanente nos Estados Unidos
            em troca do assassinato de um oficial do governo cubano,
             Tony Montana se torna o chefe do tráfico de drogas em Miami.
             Matando qualquer um que entre em seu caminho,
             Tony eventualmente se torna o maior traficante da Flórida,
             controlando quase toda a cocaína que entra em Miami.
             Porém, a pressão da polícia,
             as guerras com cartéis colombianos e
             sua própria paranoia servem para alimentar
             as chamas de sua eventual queda.""";

    System.out.println(nomeDoFilme + "\n Ano de Lançamento: " + anoDeLancamento + "\n" + sinopse);

    int classificacao;
    classificacao = (int) (media / 2);
}