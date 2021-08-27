public class Ram_Intel extends Ram {

    @Override
    public Prototipo clonar() {
            return new Ram_Intel();
    }

    @Override
    public String getCapacidad() {
            return "16GB";
    }

    @Override
    public String getNombre() {
            return "Kingston";
    }



}