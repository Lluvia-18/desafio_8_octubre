public class main {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Par<String, Integer>[] productos = (Par<String, Integer>[]) new Par[3];
        productos[0] = new Par<>("Agua", 120);
        productos[1] = new Par<>("Combustible", 500);
        productos[2] = new Par<>("Alimentos", 300);

        Integer[] cantidades = new Integer[productos.length];
        Caja<Integer> caja = new Caja<>(productos.length);
        for (int i = 0; i < productos.length; i++) {
            cantidades[i] = productos[i].getValor();
            caja.agregar(cantidades[i]);
        }

        Integer mayor = Utilidades.maximo(cantidades);
        if (!mayor.equals(caja.obtenerMayor())) {
            throw new IllegalStateException("Los resultados no coinciden");
        }

        for (Par<String, Integer> producto : productos) {
            if (producto.getValor().equals(mayor)) {
                System.out.println("Producto con mayor cantidad: " + producto);
            }
        }
    }
}