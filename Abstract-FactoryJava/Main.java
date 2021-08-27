import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  
    FabricaComponentes fabrica=null;
    Cpu cpu;
    Ram ram;
    Gpu gpu;
    int decision=0;
    int auxiliar=0;
    Scanner scan=new Scanner(System.in);
    while(decision==0){
      System.out.println("Buenos días. Por favor ingresa la computadora que deseas generar: (1) AMD (2) Intel");
      auxiliar= scan.nextInt();
      if(auxiliar==1){
        decision=auxiliar;
      }
      if(auxiliar==2){
        decision=auxiliar;
      }
    }
    if(decision==1){
      fabrica = new FabricaAMD();
    }else if(decision==2){
        fabrica = new FabricaIntel();
    }    
    cpu = fabrica.crearCpu();
    gpu = fabrica.crearGpu();
    ram = fabrica.crearRam();

    System.out.println(cpu);
    System.out.println(gpu);
    System.out.println(ram);
  }
}