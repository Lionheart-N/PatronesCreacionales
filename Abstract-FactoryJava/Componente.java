public abstract class Componente implements Prototipo {
    @Override
    public abstract Prototipo clonar();

    public abstract String getCapacidad();

    public abstract String getNombre();

    @Override
    public String toString() {
            return getNombre() + " (" + getCapacidad() + ")";
    }
}