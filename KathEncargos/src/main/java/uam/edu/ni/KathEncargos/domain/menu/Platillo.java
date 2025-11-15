package uam.edu.ni.KathEncargos.domain.menu;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.openxava.annotations.Hidden;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "platillo")
@Getter @Setter
public class Platillo {

    @Id
    @Hidden
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @Column(name = "id_platillo")
    private String oid;

    @Column(name = "observacion", length = 300)
    @Size(max = 300)
    private String observacion;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_platillo")
    private List<Guarnicion> guarniciones;
}
