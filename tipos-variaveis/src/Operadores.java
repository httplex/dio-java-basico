public class Operadores {
    public static void main(String [] args) {

       //combinar string e int
       String concatenacao = "?";
       
       concatenacao = 1+1+1+"1";

       System.out.println(concatenacao);

       concatenacao = 1+"1"+1+1;

       System.out.println(concatenacao);

       concatenacao = 1+"1"+1+"1";

       System.out.println(concatenacao);

       concatenacao = "1"+1+1+1;

       System.out.println(concatenacao);

       concatenacao = "1"+(1+1+1);

       System.out.println(concatenacao);
       System.out.println("\n");

       //mudar o sinal de um número:
       int numero = 5;

       numero = - numero;

       System.out.println(numero);

       numero = numero * -1;

       System.out.println(numero);
       System.out.println("\n");
       
       //x repetição 
       int numero2 = 5;

       //numero2 = numero2 + 1;

       System.out.println( -- numero2);
       System.out.println("\n");
       
       //inverter um valor booleano
       boolean variavel = true;
       
       variavel = !variavel;

       System.out.println(variavel);
       System.out.println("\n");


       //operador ternário (não se limita apenas a String)
       int a, b;
       a = 5;
       b = 5;

       String resultado = a == b ? "Verdadeiro" : "Falso";

       System.out.println(resultado);
       System.out.println("\n");

       
       //Operadores Relacionais >>> Avaliam a relação entre duas variáveis ou expressões.
       //OBS: Utilizar equals para objetos é a forma mais recomendada, para números os operadores relacionais.
       String nomeUm = "Alex";
       String nomeDois = new String("Alex");
       System.out.println(nomeUm.equals(nomeDois));
       
       int numeroUm = 1;
       int numeroDois = 2;

       boolean simNao = numeroUm == numeroDois;

       if(numeroUm < numeroDois){
        System.out.println("A condição é verdadeira");
       }

       System.out.println("Número Um é igual a Número Dois? " + simNao);


       simNao = numeroUm != numeroDois;
       System.out.println("Número Um é igual a Número Dois? " + simNao);


       simNao = numeroUm > numeroDois;
       System.out.println("Número Um é igual a Número Dois? " + simNao);
       System.out.println("\n");


       
       //Operadores Lógicos
       boolean condicao1=true;
       boolean condicao2=false;

       if(condicao1 && condicao2){
        System.out.println("As duas condições são verdadeiras.");
       }

       if(condicao1 || condicao2){
        System.out.println("Uma das condições é verdadeiras.");
       }

       System.out.println("fim");
    }
    
}
