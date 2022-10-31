package actividades2dotrimestre;
import java.util.Scanner;

public class OperacionesAvanzadas {
    double angle, seno, coseno, tangente, cotangente, secante, cosecante;
    Scanner sc =new Scanner(System.in);
    
    public void sen() {
        angulo();
        seno = Math.sin(Math.toRadians(angle));
        System.out.println("El seno de: " + angle + " es: " + seno);
    }

    public void cos() {
        angulo();
        coseno = Math.cos(Math.toRadians(angle));
        System.out.println("El coseno de: " + angle + " es: " + coseno);
    }

    public void tan() {
        angulo();
        tangente = Math.tan(Math.toRadians(angle));
        System.out.println("La tangente de: " + angle + " es: " + tangente);
    }

    public void cot() {
        angulo();
        cotangente = Math.cos(Math.toRadians(angle)) / Math.sin(Math.toRadians(angle));
        System.out.println("La cotangente de: " + angle + " es: " + cotangente);
    }

    public void sec() {
        angulo();
        secante = 1 / Math.cos(Math.toRadians(angle));
        System.out.println("La secante de: " + angle + " es: " + secante);
    }

    public void csc() {
        angulo();
        cosecante = 1 / Math.sin(Math.toRadians(angle));
        System.out.println("La cosecante de: " + angle + " es: " + cosecante);
    }
    
     public void angulo() {
        System.out.println("Digite el primer ángulo");
        angle = sc.nextInt();

    }
}
