public class OpTernario {
    public static void main(String[] args) {

        //Operacao utilizando if else

        int a, b;
        a = 6;
        b = 6;

        String resultado = "";
        if (a==b)
            resultado = "Verdadeiro";
        else
            resultado = "Falso";
        System.out.println(resultado);

        //Operador ternario utiliza o metodo condicional, resume if else em 1 linha

        String resultadoDois = a==b ? "verdadeiro" : "Falso";
        System.out.println(resultadoDois);

    }
    
}
