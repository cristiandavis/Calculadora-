package actividades2dotrimestre;
import java.util.Scanner;

public class OperacionesBasicas {
    Scanner sc = new Scanner(System.in);
    double numa, numb, resultado;
    public void suma() {
        datos();
        resultado = numa + numb;
        System.out.println(resultado);
    }

    public void resta() {
        datos();
        resultado = numa - numb;
        System.out.println(resultado);
    }

    public void multiplicacion() {
        datos();
        resultado = numa * numb;
        System.out.println(resultado);
    }

    public void division() {
        datos();
        if (numb != 0) {
            resultado = numa / numb;
            System.out.println(resultado);
        } else {
            System.out.println("no se puede dividir");
        }
    }        
    public void datos() {
        System.out.println("Digite el primer valor / numero");
        numa = sc.nextInt();
        System.out.println("Digite el segundo valor / numero");
        numb = sc.nextInt();
    }
}



