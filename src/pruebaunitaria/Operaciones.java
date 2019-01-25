package pruebaunitaria;
public class Operaciones {
    public float result;
    
    public float Suma(float n, float n2){
        float result=n+n2;
        System.out.println("\nEl Valor de la Suma es: "+result);
        return result;
    }
    public float Resta(float n, float n2){
        float result=n-n2;
        System.out.println("\nEl Valor de la Resta es: "+result);
        return result;
    }
    public float Multiplicacion(float n, float n2){
        float result = n*n2;
        System.out.println("\nEl Valor de la Multiplicacion es: "+result);
        return result;
    }
    public float Division(float n, float n2){
        float result = n/n2;
        System.out.println("\nEl Valor de la Division es: "+result);
        return result;
    }
}
