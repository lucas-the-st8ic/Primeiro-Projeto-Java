
void main() {
    int anoDeLancamento = 1984;
    boolean incluidoNoPlano = true;
    double notaDofilme = 8.3;
    String tipoDoPlano = "Premium";

    if (anoDeLancamento <= 2005) {
        IO.println("Filme clássico - Filme Antigo - Block Buster");
    } else {
        IO.println("Filme Lançamento - Filmes atuais - Nova Era");
    }
    /* Condicionais em Java:
     OU == ||, E == && */
    if (incluidoNoPlano == true && tipoDoPlano.equals("Premium")) {
        System.out.print("Filme Liberado");
    } else {
        System.out.print(" :( Este filme não está liberado para sua assinatura.");
    };
 }
