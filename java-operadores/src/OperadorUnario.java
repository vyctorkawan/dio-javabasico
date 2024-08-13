public class OperadorUnario {

    public static void main(String[] args) {
        int numero = 5; //valor positivo

        System.out.println(- numero ); //nega o valor da var
        System.out.println(numero);  //o valor negativo só é utilizado dentro da linha que foi dado
            //usar "numero = - numero" para negativar fora da linha
            // "+" deixa o nº positivo, assim como - negativa
            // ++ adiciona uma unidade ao valor e -- diminui uma


        numero++; // numero = numero + 1;
        
        System.out.println(numero);
        System.out.println(++ numero); //altera o valor antes de executar
        System.out.println( numero ++); //altera o valor depois de executar
        System.out.println(numero);

        boolean var = true;
        System.out.println(var);
        System.out.println(!var); //altera o valor booleano
    }
}
