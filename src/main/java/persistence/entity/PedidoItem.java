package persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "pedidoitems")
public class PedidoItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Integer pedidoId) {
        this.pedidoId = pedidoId;
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

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Column(name = "pedido_id")
    private Integer pedidoId;

    @Column(name = "producto_id")
    private Integer productoId;

    private Integer cantidad;

    @Column(name = "precio_unitario")
    private Double precioUnitario;

    @ManyToOne
    @JoinColumn(name = "pedido_id", insertable = false, updatable = false)
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "producto_id", insertable = false, updatable = false)
    private Producto producto;
}
