public class Gpu_Intel extends Gpu {

    @Override
    public Prototipo clonar() {
            return new Gpu_Intel();
    }

    @Override
    public String getCapacidad() {
            return "6 Gb";
    }

    @Override
    public String getNombre() {
            return "GTX 1660 Ti";
    }



}