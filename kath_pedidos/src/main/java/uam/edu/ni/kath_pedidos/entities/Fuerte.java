package uam.edu.ni.kath_pedidos.entities;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.openxava.annotations.Hidden;
import org.openxava.annotations.Required;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="fuertes")
@Getter @Setter
public class Fuerte {

    @Id
    @Hidden
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String oid;

    @Column(name = "nombre_fuerte", length = 50, nullable = false)
    @Size(min = 3, max = 50)
    @Required(message = "El nombre del fuerte es obligatorio")
    private String nombre;

    @Column(name = "tipo_carne", length = 20)
    private String tipoCarne;

    @Column(name = "descripcion", length = 200)
    private String descripcion;

    @Column(name = "precio")
    private BigDecimal precio;

    @Column(name = "cantidad_disponible")
    private int cantidadDisponible;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_preparacion")
    private Date fechaPreparacion;
}

