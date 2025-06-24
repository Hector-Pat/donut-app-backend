
package persistence.crud;

import org.springframework.data.repository.CrudRepository;
import persistence.entity.Producto;

import java.util.List;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    // Buscar productos por disponibilidad
    List<Producto> findByDisponible(boolean disponible);

    // Buscar productos por tienda
    List<Producto> findByTiendaId(int tiendaId);

    // Buscar productos por categoría
    List<Producto> findByCategoriaId(int categoriaId);

    // Buscar por nombre aproximado
    List<Producto> findByNombreContainingIgnoreCase(String nombre);
}
