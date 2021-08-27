public class Ram_AMD extends Ram {

    @Override
    public Prototipo clonar() {
            return new Ram_AMD();
    }

    @Override
    public String getCapacidad() {
            return "16GB";
    }

    @Override
    public String getNombre() {
            return "Trident";
    }



}