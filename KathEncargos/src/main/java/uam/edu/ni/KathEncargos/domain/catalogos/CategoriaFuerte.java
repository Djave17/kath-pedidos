package uam.edu.ni.KathEncargos.domain.catalogos;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.openxava.annotations.Hidden;
import org.openxava.annotations.Required;
import uam.edu.ni.KathEncargos.domain.menu.EstacionPrincipal;
import uam.edu.ni.KathEncargos.domain.menu.Platillo;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "categoria_fuerte")
@Getter @Setter
public class CategoriaFuerte {

    @Id
    @Hidden
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoriaFuerte")
    private Integer oid;

    @Column(name = "nombre_categoriafu", length = 30, nullable = false)
    @Size(min = 2, max = 30)
    @Required
    private String nombreCategoriafu;

    @Column(name = "descripcion", length = 300)
    @Size(max = 300)
    private String descripcion;

    @Column(name = "activo")
    private Boolean activo;

    // Relación con estación principal
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_estacion", nullable = false)
    private EstacionPrincipal estacionPrincipal;

    // Relación con platillos
    @OneToMany(mappedBy = "categoriaFuerte", fetch = FetchType.LAZY)
    private List<Platillo> platillos;
}

