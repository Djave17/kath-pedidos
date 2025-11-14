package uam.edu.ni.kath_pedidos.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.openxava.annotations.Hidden;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "pedidos")
@Getter @Setter

public class Pedido {
    @Id
    @Hidden
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String id_pedido;

    //private MetodoEntrega id_metodoEntrega;
    //private Usuario id_usuario;
    @Column(name = "fecha_pedido")
    private Date fecha_pedido;

    @Column(name = "estado_pedido")
    private boolean estado_pedido;

    @Column(name = "total")
    private Float total;

}
