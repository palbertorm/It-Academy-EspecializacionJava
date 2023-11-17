import java.util.ArrayList;

public class Venta {
    private double precioTotalVenta = 0.0;
    private ArrayList<Producto> products = new ArrayList<Producto>();

    public Venta(double precioTotalVenta, ArrayList<Producto> products) {
        this.precioTotalVenta = precioTotalVenta;
        this.products = products;
    }

    public Venta() {
        this.precioTotalVenta = precioTotalVenta;
        this.products = products;
    }

    public double getPrecioTotalVenta() {
        return this.precioTotalVenta;
    }

    public void setPrecioTotalVenta(int precioTotalVenta) {
        this.precioTotalVenta = precioTotalVenta;
    }

    public ArrayList<Producto> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Producto> products) {
        this.products = products;
    }
    public void agregarProducto(Producto producto) {
        products.add(producto);
    }
    public void calcularTotal() throws VentaBuidaException {
        if (this.products.isEmpty()){
            throw new VentaBuidaException("Para hacer una venta primero debes añadir productos");
        }
        for (Producto producto: products) {
            this.precioTotalVenta += producto.getPrecio();
        }
    }
}
