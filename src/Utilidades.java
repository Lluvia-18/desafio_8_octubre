public class Utilidades {

    public static <T> void intercambiar(T[] arr, int i, int j) {
        T temporal = arr[i];
        arr[i] = arr[j];
        arr[j] = temporal;
    }

    public static <T> int contar(T[] arr, T elemento) {
        int cuenta = 0;
        for (T actual : arr) {
            if (actual != null && actual.equals(elemento)) {
                cuenta++;
            }
        }
        return cuenta;
    }

    public static <T extends Comparable<T>> T maximo(T[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("El arreglo esta vacio");
        }
        T mayor = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(mayor) > 0) {
                mayor = arr[i];
            }
        }
        return mayor;
    }
}