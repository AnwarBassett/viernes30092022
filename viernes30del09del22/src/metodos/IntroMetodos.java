package metodos;
import java.util.Scanner;
public class IntroMetodos {

	public static void main(String[] args) {
				CalculadoraCuadratica();

			}//cierre del main
			private static void CalculadoraCuadratica(){
				Scanner lec=new Scanner(System.in);
				
				System.out.println("a=");
				double a=lec.nextDouble();
				System.out.println("b=");
				double b=lec.nextDouble();
				System.out.println("c=");
				double c=lec.nextDouble();
				
				double discriminante=Math.pow(b, 2) - 4*a*c;
				
				double x1=(-b+Math.sqrt(discriminante))/(2*a);
				double x2=(-b-Math.sqrt(discriminante))/(2*a);
				
				System.out.println(x1);
				System.out.println(x2);
				lec.close();
			}
			
			
			
			
		}//cierre de la clase
