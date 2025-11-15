package uam.edu.ni.KathEncargos.domain.menu;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.openxava.annotations.Hidden;
import org.openxava.annotations.Required;
import uam.edu.ni.KathEncargos.domain.catalogos.CategoriaFuerte;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "estacion_principal")
@Getter @Setter
public class EstacionPrincipal {

    @Id
    @Hidden
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estacion")
    private Long oid;

    @Column(name = "nombre_estacio", length = 50, nullable = false)
    @Size(min = 2, max = 50)
    @Required
    private String nombreEstacio;

    @Column(name = "descripcion", length = 300)
    @Size(max = 300)
    private String descripcion;

    @Column(name = "activo")
    private Boolean activo;

    // aqui va la relacion con categoria fuerte
    @OneToMany(mappedBy = "estacionPrincipal", fetch = FetchType.LAZY)
    private List<CategoriaFuerte> proteinas;
}
