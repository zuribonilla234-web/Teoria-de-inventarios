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
                    float wq=lq/lambda;
                    System.out.println("Tiempo promedio de espera en la cola: "+wq);
                    float w=wq+(1/miu);
                    System.out.println("Tiempo total en el sistema: "+w);
                    break;

                case 2:
                    System.out.println("Modelo MM1K");
                    System.out.println("Ingrese la tasa de llegada o pedido: ");
                    float pedidos=entrada.nextFloat();
                    System.out.println("Ingrese el horario de atencion: ");
                    float hora=entrada.nextFloat();
                    float miu2=(pedidos)/(hora);
                    System.out.println("Ingrese la tasa de llegada (λ): ");
                    float lambda2=entrada.nextFloat();
                    System.out.println("Ingrese la capacidad maxima del sistema (k): ");
                    float k=entrada.nextInt();
                    float p2=lambda2/miu2;
                    System.out.println("Utilizacion del sistema: "+p2);
                    float pcero=(float)((1-p2)/(1-(Math.pow(p2,k+1))));
                    System.out.println("Probabilidad de cero clientes:"+pcero);
                    float pk=(float)((Math.pow(p2, k)) * (pcero));
                    System.out.println("Probabilidad de rechazo: "+pk);
                    float tasaDeLlegada=(lambda2*1)-pk;
                    System.out.println("Tasa de llegadas: "+tasaDeLlegada);
                    float l=(float)(p2*(1-(k+1)*(Math.pow(p2,k))+k*(Math.pow(p2,k+1 )))/(1-p2)*(1-(Math.pow(p2,k+1))));
                    System.out.println("Longitud de cola: "+l);
                    float w2=l/tasaDeLlegada;
                    System.out.println("Tiempo en el sistema: "+w2);
                    break;





            }


        }while (opcion !=0);
        
    }
}