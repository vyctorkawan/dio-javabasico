public class OpLogicos {
    public static void main(String[] args) {
        boolean condUm = true;
        boolean condDois = false;
    
        if(condUm && condDois){ //pode-se usar também condições criadas dentro do ()
            System.out.println("As condições são verdadeiras");
        }
        if(condUm || condDois) {
            System.out.println("Umas das condições é verdadeira");
        }

    }
}
