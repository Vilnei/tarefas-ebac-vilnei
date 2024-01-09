public class MediaAlunos {

    public static void main(String[] args) {

        double media1 = 9.5;
        double media2 = 5.5;
        double media3 = 6;
        double media4 = 2.2;
        double mediaFinal = (media1 + media2 + media3 + media4) / 4;

        System.out.println("A media Final é igual a " + mediaFinal);

        if(mediaFinal >= 7) {
            System.out.println("Aluno aprovado!");
        } else if (mediaFinal >= 5 && mediaFinal < 7) {
            System.out.println("Aluno em Recuperação!");
        } else {
            System.out.println("Aluno reprovado");
        }
    }
}
