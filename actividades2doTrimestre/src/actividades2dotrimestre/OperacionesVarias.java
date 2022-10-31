package actividades2dotrimestre;

import java.util.Scanner;

public class OperacionesVarias {

    double numtabla, numfinal, resultado;
    public void Tabla() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite la tabla que quiere");
        numtabla = sc.nextInt();
        System.out.println("hasta que digito");
        numfinal = sc.nextInt();
        for (int i = 0; i < numfinal; i++) {
            System.out.println(numtabla+" * "+i+" = "+(numtabla*i));
        }

    }
}
