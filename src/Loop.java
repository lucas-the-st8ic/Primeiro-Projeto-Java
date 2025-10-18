
void main() {
    Scanner leitura = new Scanner(System.in);

    double mediaDoFilme = 0;
    double notaDoFilme = 0 ;

    for (int i = 1; i <= 3; i++) {
        System.out.println("Insira a nota " + i + " para este filme(De 0,0 a 10,0): ");
        notaDoFilme = leitura.nextDouble();

        mediaDoFilme += notaDoFilme;
    }

    System.out.println("Nota média do filme: " + mediaDoFilme/ 3);

}
