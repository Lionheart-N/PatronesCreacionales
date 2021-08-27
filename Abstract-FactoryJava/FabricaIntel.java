public class FabricaIntel implements FabricaComponentes {

       @Override
       public Ram crearRam() {
               return new Ram_Intel();
       }

       @Override
       public Cpu crearCpu() {
               return new Cpu_Intel();
       }

       @Override
       public Gpu crearGpu() {
               return new Gpu_Intel();
       }

}