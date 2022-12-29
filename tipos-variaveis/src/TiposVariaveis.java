public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        //tipos primitivos
        //estudar a classe String que representa texto na aplicação

        String meuNome = "Alex Silva";
        
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; /* casting */

        int numero = 5;

        numero = 10;

        System.out.println(numero);
    }
}
