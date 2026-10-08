public class Caja<T extends Comparable<T>> {
    private final Object[] elementos;
    private int cantidad;

    public Caja(int capacidad) {
        this.elementos = new Object[capacidad];
        this.cantidad = 0;
    }

    public void agregar(T elemento) {
        if (cantidad == elementos.length) {
            throw new IllegalStateException(
                "La caja esta llena: capacidad maxima " + elementos.length);
        }
        elementos[cantidad] = elemento;
        cantidad++;
    }

    @SuppressWarnings("unchecked")
    private T obtener(int i) {
        return (T) elementos[i];
    }

    public T obtenerMayor() {
        if (cantidad == 0) {
            throw new IllegalStateException("La caja esta vacia");
        }
        T mayor = obtener(0);
        for (int i = 1; i < cantidad; i++) {
            if (obtener(i).compareTo(mayor) > 0) {
                mayor = obtener(i);
            }
        }
        return mayor;
    }

    public T obtenerMenor() {
        if (cantidad == 0) {
            throw new IllegalStateException("La caja esta vacia");
        }
        T menor = obtener(0);
        for (int i = 1; i < cantidad; i++) {
            if (obtener(i).compareTo(menor) < 0) {
                menor = obtener(i);
            }
        }
        return menor;
    }
}


