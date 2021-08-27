public class FabricaAMD implements FabricaComponentes {

       @Override
       public Ram crearRam() {
               return new Ram_AMD();
       }

       @Override
       public Cpu crearCpu() {
               return new Cpu_AMD();
       }

       @Override
       public Gpu crearGpu() {
               return new Gpu_AMD();
       }

}