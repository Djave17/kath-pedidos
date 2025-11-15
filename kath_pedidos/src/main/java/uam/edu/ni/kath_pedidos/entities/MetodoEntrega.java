package uam.edu.ni.kath_pedidos.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.openxava.annotations.Hidden;
import org.openxava.annotations.Required;

import javax.persistence.*;

@Entity
@Table(name = "metodo_entregas")
@Getter@Setter

public class MetodoEntrega {
    @Id
    @Hidden
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private Long id_metodo;

    @Column(name = "tipo_entrega", nullable = false, length= 60)
    @Required(message = "El método de entrega debe ser ingresado.")
    private String tipo_entrega;


}
