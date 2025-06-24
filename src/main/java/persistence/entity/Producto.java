package persistence.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
    private String descripcion;

    @Column(name = "precio")
    private Double precio;

    private Boolean disponible;

    @Column(name = "categoria_id")
    private Integer categoriaId;

    @Column(name = "tienda_id")
    private Integer tiendaId;

    private Integer inventario;

    @ManyToOne
    @JoinColumn(name = "categoria_id", insertable = false, updatable = false)
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "tienda_id", insertable = false, updatable = false)
    private Tienda tienda;

    @OneToMany(mappedBy = "producto")
    private List<PedidoItem> pedidos;

    @OneToMany(mappedBy = "producto")
    private List<CarritoItem> carritoItems;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    public Integer getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(Integer categoriaId) {
        this.categoriaId = categoriaId;
    }

    public Integer getTiendaId() {
        return tiendaId;
    }

    public void setTiendaId(Integer tiendaId) {
        this.tiendaId = tiendaId;
    }

    public Integer getInventario() {
        return inventario;
    }

    public void setInventario(Integer inventario) {
        this.inventario = inventario;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Tienda getTienda() {
        return tienda;
    }

    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }

    public List<PedidoItem> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<PedidoItem> pedidos) {
        this.pedidos = pedidos;
    }

    public List<CarritoItem> getCarritoItems() {
        return carritoItems;
    }

    public void setCarritoItems(List<CarritoItem> carritoItems) {
        this.carritoItems = carritoItems;
    }
}

