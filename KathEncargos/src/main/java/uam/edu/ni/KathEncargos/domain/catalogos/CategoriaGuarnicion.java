package uam.edu.ni.KathEncargos.domain.catalogos;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.openxava.annotations.Hidden;
import uam.edu.ni.KathEncargos.domain.menu.Guarnicion;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "categoria_guarnicion")
@Getter @Setter
public class CategoriaGuarnicion {

    @Id
    @Hidden
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @Column(name = "id_categoria_guarnicion")
    private String oid;

    @Column(name = "nombre_categoria", length = 50, nullable = false)
    @Size(min = 2, max = 50)
    private String nombreCategoria;

    // una categoría puede tener muchas guarniciones
    @OneToMany(mappedBy = "categoriaGuarnicion", fetch = FetchType.LAZY)
    private List<Guarnicion> guarniciones;
}
