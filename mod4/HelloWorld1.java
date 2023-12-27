package primeiroProjeto;
public class HelloWorld1 {
    public static void main(String[] args) {

        String ambiente = args[0];

        if(ambiente.equalsIgnoreCase("dev")) {
            System.out.println("Modo DESENVOLVEDOR ligado");

        } 
        else if(ambiente.equalsIgnoreCase("test")) {
            System.out.println("modo TEST ligado");

        } 
        else { System.out.println("Hello, " + ambiente);

        }
    }

}