package uam.edu.ni.KathEncargos.domain.menu;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.openxava.annotations.Hidden;
import org.openxava.annotations.Required;
import uam.edu.ni.KathEncargos.domain.catalogos.CategoriaGuarnicion;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Entity
@Table(name = "guarnicion")
@Getter @Setter
public class Guarnicion {

    @Id
    @Hidden
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @Column(name = "id_guarnicion")
    private String oid;

    @Column(name = "nombre_guarnicion", length = 40, nullable = false)
    @Size(min = 2, max = 40)
    @Required
    private String nombreGuarnicion;

    @Column(name = "precio")
    private BigDecimal precio;

    @Column(name = "activo")
    private Boolean activo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_categoria_guarnicion", nullable = false)
    @Required
    private CategoriaGuarnicion categoriaGuarnicion;
}

