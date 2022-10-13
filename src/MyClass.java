public class MyClass {
    public static void main(String [] args) {

        /**
         * Formas corretas de escrita de variavel e constante
         */

        final String BRASIL = "Brasil"; //constante

        String nome = "Keith";
        int numero1 = 1;
        double _numeroDecimal = 12.4;
        String $comSimboloDolar = "$$$";

        String firstName = "Keith";
        String lastName = "Dimeni";

        String fullName = fullName(firstName, lastName);
//        System.out.println(fullName);


    }

    /**
     * Regras de criacao de metodos
     */
    public static String fullName(String firstName, String lastName) {
        return "Nome Completo: " + firstName.concat(" ").concat(lastName);
    }

    /**
     * Tipos de variaveis
     */
    byte age = 123;
    short year = 2021;
    int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
    long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
    float pi = 3.14F;
    double salary = 1275.33;



    
}
