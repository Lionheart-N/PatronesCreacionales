public class Gpu_AMD extends Gpu {

    @Override
    public Prototipo clonar() {
            return new Gpu_AMD();
    }

    @Override
    public String getCapacidad() {
            return "8 Gb";
    }

    @Override
    public String getNombre() {
            return "RX 6600 XT";
    }



}