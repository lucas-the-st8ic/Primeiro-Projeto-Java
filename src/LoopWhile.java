
void main() {
    Scanner leitura = new Scanner(System.in);

    double mediaDoFilme = 0;
    double notaDoFilme = 0;
    int totalDeNotas = 0;

    while(notaDoFilme != -1) {
        System.out.println("Insira a nota para este filme(De 0,0 a 10,0) ou digite -1 para encerrar: ");
        notaDoFilme = leitura.nextDouble();

        if (notaDoFilme != -1) {
            mediaDoFilme += notaDoFilme;
            totalDeNotas += 1;
        }
        
    }

    System.out.println("Nota média do filme: " + mediaDoFilme/ totalDeNotas);

}
