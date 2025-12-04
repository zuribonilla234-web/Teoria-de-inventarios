import java.util.Scanner;
public class Teoria_de_colas{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        byte opcion=0;
        do{
            System.out.println("--Teoria de colas--");
            System.out.println("1. Modelo m/m/1");
            System.out.println("2. Modelo m/m/1/k");
            System.out.println("3. Modelo m/m/c");
            System.out.println("0. salir del programa");
            opcion=entrada.nextByte();
            switch(opcion){
                case 1:
                    System.out.println("Modelo MM1");
                    System.out.println("Ingrese la tasa de llegadas (λ): ");
                    float lambda=entrada.nextFloat();
                    System.out.println("Ingrese la tasa de servicio (μ): ");
                    float miu=entrada.nextFloat();
                    

            }


        }while (opcion !=0);
        
    }
}