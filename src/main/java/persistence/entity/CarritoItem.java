package persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "carritoitems")
public class CarritoItem {

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCarritoId() {
        return carritoId;
    }

    public void setCarritoId(Integer carritoId) {
        this.carritoId = carritoId;
    }

    public Integer getProductoId() {
        return productoId;
    }

    public void setProductoId(Integer productoId) {
        this.productoId = productoId;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "carrito_id")
    private Integer carritoId;

    @Column(name = "producto_id")
    private Integer productoId;

    private Integer cantidad;

    @ManyToOne
    @JoinColumn(name = "carrito_id", insertable = false, updatable = false)
    private Carrito carrito;

    @ManyToOne
    @JoinColumn(name = "producto_id", insertable = false, updatable = false)
    private Producto producto;
}
