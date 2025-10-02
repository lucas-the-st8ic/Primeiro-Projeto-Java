
void main() {
    Scanner leitura = new Scanner(System.in);

    System.out.println("Digite seu filme favorito: ");
    String filmeFavorito = leitura.nextLine();

    System.out.println("Digite o ano de lançamento do filme: ");
    int anoDeLancamento = leitura.nextInt();

    System.out.println("Qual nota você dá para este filme? De 0 a 10: ");
    double notaDoFilme = leitura.nextDouble();

    System.out.println("Filme favorito: " + filmeFavorito);
    System.out.println("Ano de lançamento: " + anoDeLancamento);
    System.out.println("Nota do filme: " + notaDoFilme);



}
