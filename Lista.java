package CollectionsJava;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/


// Após isso, calcule a média semestral das temperaturas e 
// mostre todas as temperaturas acima desta média, e em que 
// mes elas ocorreram (mês por extenso).

public class Lista {
 public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    List <Double> temp = new ArrayList<>();
    List<Double> temperaturasSemestral = new ArrayList<Double>();

    int count = 0;
    double soma = 0.0;

    while (true){
      if (count == 6) break;

      System.out.print("Digite a temperatura: ");
      double temper = scan.nextDouble();
      temp.add(temper);
      temperaturasSemestral.add(temper);
      soma += temper;
      count++;
    }
    System.out.println("---------");


      double mediaTemperaturasSemenstral = soma/temperaturasSemestral.size();
      System.out.println("Temperaturas Semestral: " + temperaturasSemestral);
      System.out.println("Média temperaturas Semestral: " + mediaTemperaturasSemenstral + "oC");
      System.out.println("----------");
      for (Double temper : temperaturasSemestral) {
          if(temper > mediaTemperaturasSemenstral) {
              int index = temperaturasSemestral.indexOf(temper);
              switch (index) {
                  case 0:
                      System.out.println((index + 1) + " - JANEIRO: " + temper + " oC");
                      break;
                  case 1:
                      System.out.println((index + 1) + " - FEVEREIRO: " + temper + " oC");
                      break;
                  case 2:
                      System.out.println((index + 1) + " - MARÇO: " + temper + " oC");
                      break;
                  case 3:
                      System.out.println((index + 1) + " - ABRIL: " + temper + " oC");
                      break;
                  case 4:
                      System.out.println((index + 1) + " - MAIO: " + temper + " oC");
                      break;
                  case 5:
                      System.out.println((index + 1) + " - JUNHO: " + temper+ " oC");
                      break;
                  default:
                      break;
              }
            }
         }
      }
   }

