public class Cpu_Intel extends Cpu {

    @Override
    public Prototipo clonar() {
            return new Cpu_Intel();
    }

    @Override
    public String getCapacidad() {
            return "8 núcleos - 16 hilos";
    }

    @Override
    public String getNombre() {
            return "Core i7";
    }



}