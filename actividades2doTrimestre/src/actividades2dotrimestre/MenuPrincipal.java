package actividades2dotrimestre;
import java.util.Scanner;

public class MenuPrincipal {

    public void main() {
        System.out.println("Menu Calculadora\n 1.Operaciones Basicas\n 2.Operaciones Avanzadas\n 3.Operaciones Varias");
        System.out.println("Digite en que clase quiere ingresar:");
        Scanner sc = new Scanner(System.in);
        int opmenuprincipal = sc.nextInt();
        MenuOperacionesb basicas=new MenuOperacionesb();
        MenuOperacionesa avanzadas=new MenuOperacionesa();
        
        
        switch (opmenuprincipal) {
            case 1:
                basicas.main();
            break;
            case 2:
               avanzadas.main();
            break;
                
                
        }
    }
}
