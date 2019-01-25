package pruebaunitaria;

import java.util.Scanner;

public class PruebaUnitaria {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int op;
        Operaciones ops;
        System.out.println("BIENVENIDO A LA PRUEBA UNITARIA\n");
        System.out.print("Digite el primer numero: ");
        float n = entrada.nextFloat();
        System.out.print("\nDigite el segundo numero: ");
        float n2 = entrada.nextFloat();
        do{
            System.out.print("\n[1]. Suma\n[2]. Resta\n[3]. Multiplicacion\n[4]. Division\n[5]. Salir\n Eliga una Opcion: ");
            op =  entrada.nextInt();
            switch(op){
                
                case 1: 
                    ops =  new Operaciones();
                    ops.Suma(n, n2);
                break;
                
                case 2:
                    ops = new Operaciones();
                    ops.Resta(n, n2);
                break;
                
                case 3: 
                    ops = new Operaciones();
                    ops.Multiplicacion(n, n2);
                break;
                
                case 4:
                    ops = new Operaciones();
                    ops.Division(n, n2);
                break;
                
                case 5:
                    break;
            }
        }while(op!=5);
    }
    
}
