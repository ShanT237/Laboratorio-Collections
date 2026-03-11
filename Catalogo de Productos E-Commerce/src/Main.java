//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
        SistemaCatalogo sistema = new SistemaCatalogo();

        // Crear productos
        Producto p1 = new Producto("P01", "Laptop", 3500, Categoria.ELECTRONICA);
        Producto p2 = new Producto("P02", "Celular", 2200, Categoria.ELECTRONICA);
        Producto p3 = new Producto("P03", "Silla", 300, Categoria.MUEBLES);
        Producto p4 = new Producto("P04", "Audifonos", 150, Categoria.ELECTRONICA);
        Producto p5 = new Producto("P05", "Mesa", 500, Categoria.MUEBLES);

        // Agregar productos
        sistema.agregarProducto(p1);
        sistema.agregarProducto(p2);
        sistema.agregarProducto(p3);
        sistema.agregarProducto(p4);
        sistema.agregarProducto(p5);

        // Buscar producto
        System.out.println("Buscando producto P02:");
        Producto encontrado = sistema.buscar("P02");

        if(encontrado != null){
            System.out.println(encontrado);
        }else{
            System.out.println("Producto no encontrado");
        }

        // Mostrar productos ordenados por precio
        System.out.println("\nProductos ordenados por precio:");
        sistema.mostrarOrdenPrecio();
    }

