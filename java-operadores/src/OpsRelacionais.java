public class OpsRelacionais {
    public static void main(String[] args) {
         int numero1 = 1;
         int numero2 = 2;
         boolean simNao = numero1 == numero2;

         String nomeUm = "vyctor";
         String nomeDois = new String("vyctor");
         System.out.println(nomeUm.equals(nomeDois)); //utiliza-se equals para comparar objetos


         if (numero1 < numero2){
            System.out.println("nossa condição é verdadeira!");
         }

         System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("numeroUm é diferente de numeroDois? " + simNao);
    }
    
}
