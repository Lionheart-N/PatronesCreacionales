public class Cpu_AMD extends Cpu {

    @Override
    public Prototipo clonar() {
            return new Cpu_AMD();
    }

    @Override
    public String getCapacidad() {
            return "8 núcleos - 16 hilos";
    }

    @Override
    public String getNombre() {
            return "Ryzen 7";
    }



}