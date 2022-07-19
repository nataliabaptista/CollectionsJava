package CollectionsJava;
import java.io.IOException;
import java.util.Scanner;
 
public class App { 
 
    public static void main(String[] args) throws IOException {
 
            Scanner scan = new Scanner(System.in);
            String[] nomes = new String[5];
            for (int i = 0; i < 5; i++)
            {
                System.out.println("Digite os nomes dos funcionários: ");
                nomes[i] = scan.nextLine();

            }
            System.out.println("Digite o número da posição");
            int pos = scan.nextInt();
            scan.close();
            System.out.println(nomes[pos]);
           
    }
}
