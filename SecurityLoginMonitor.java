import java.util.Scanner;
import java.util.ArrayList;


public class SecurityLoginMonitor {

    public static void main(String[] args) {
        String usuario = "Aline";
        String senha = "senha123";
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> eventos = new ArrayList<>();

        int tentativas = 3;
        while (tentativas > 0) {
            System.out.println("Usuario: ");
            String user = scanner.next();
            System.out.println("Senha: ");
            String password = scanner.next();
            if (user.equals(usuario) && password.equals(senha)) {
                System.out.println("Seja Bem-Vindo(a) " + user + "!");
                eventos.add("Acesso permitido");
                break;

            } else {
                tentativas--;
                System.out.println("Usuário ou senha incorretos :(  Você tem " + tentativas + " tentativas.");
                eventos.add("Acesso negado");
            }
        }
        for (String evento : eventos) {
             System.out.println(evento);
            }
            
        scanner.close();
    }
}

