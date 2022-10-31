package actividades2dotrimestre;
import java.util.Scanner;

public class MenuOperacionesb {
    public void main() {
    System.out.println("Calculadora\n 1.Suma\n 2.Resta\n 3.Multiplicacion\n 4.Division");
    Scanner sc =new Scanner(System.in);
    OperacionesBasicas basic=new OperacionesBasicas();
    int menuopbasicas = sc.nextInt();
    switch (menuopbasicas) {
        case 1:
            basic.suma();
        break;
        case 2:
            basic.resta();
        break;
        case 3:
            basic.multiplicacion();
        break;
        case 4:
            basic.division();
        break; 
        default:
            throw new AssertionError();
        }
    }  
}

