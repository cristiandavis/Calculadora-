package actividades2dotrimestre;
import java.util.Scanner;

public class MenuOperacionesa {

    public void main() {
        System.out.println("1.Seno\n 2.Coseno\n 3.Tangente\n 4.Cotangente\n 5.Secante\n 6.Cosecante");
        Scanner sc = new Scanner(System.in);
        int menuopavanzadas = sc.nextInt();
        OperacionesAvanzadas advance=new OperacionesAvanzadas();
        switch (menuopavanzadas) {
            case 1:
                advance.sen();
                break;
            case 2:
                advance.cos();
                break;
            case 3:
                advance.tan();
                break;
            case 4:
                advance.cot();
                break;
            case 5:
                advance.sec();
                break;
            case 6:
                advance.csc();
                break;
            default:
                throw new AssertionError();
        }
    }
}
