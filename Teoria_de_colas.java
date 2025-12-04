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

                    float p=lambda/miu;
                    System.out.println("utilizacion del sistema: "+p);
                    float lq=(float)(Math.pow(lambda, 2)/(miu*(miu-lambda)));
                    System.out.println("Promedio de clientes en la cola: "+lq);


            }


        }while (opcion !=0);
        
    }
}