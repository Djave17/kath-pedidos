package uam.edu.ni.kath_pedidos.entities;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.openxava.annotations.Hidden;
import org.openxava.annotations.Required;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Entity
@Table(name="guarniciones")
@Getter @Setter
public class Guarnicion {

    @Id
    @Hidden
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String oid;

    @Column(name = "nombre_guarnicion", length = 50, nullable = false)
    @Size(min = 3, max = 50)
    @Required(message = "El nombre de la guarnición es obligatorio")
    private String nombre;

    @Column(name = "descripcion", length = 200)
    private String descripcion;

    @Column(name = "precio")
    private BigDecimal precio;
}

