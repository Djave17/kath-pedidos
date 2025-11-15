package uam.edu.ni.kath_pedidos.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.openxava.annotations.Hidden;
import org.openxava.annotations.ReferenceView;
import org.openxava.annotations.Required;
import java.util.Date;
import javax.persistence.*;
import org.openxava.annotations.*;
@Entity
@Table(name = "Usuario")
@Getter @Setter
@View(members =
        "Datos Personales[" +
                "   nombreUsuario; telefono; email; direccionReferencia;" +
                "]" +
                "Seguridad[" +
                "   contrasena; rol; activo;" +
                "]" +
                "Registro[" +
                "   fechaRegistro;" +
                "]")
public class Usuario {

   /*ManyToOne(fetch=FetchType.LAZY, optional=false)
    @ReferenceView("Simple") // La vista llamada 'Simple' se usará para visualizar esta referencia
    Rol roles;

    @Id
    @GeneratedValue(generator="system-uuid") @Hidden
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Required
    @Column(name = "ID usuario", nullable = false, length = 60)
    String usuarioID;

    @Column(name = "nombre usuario", nullable = false, length = 150)
    @Required  // Se mostrará un error de validación si la propiedad nombre se deja en blanco
    String nombre;

    @Column(name = "Telefono", nullable = false, length = 60)
    @Required
    String telefono;

    @Column(name = "Contraseña", nullable = false, length =50)
    @Required
    String contrasena;*/

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long id_usuario;

    @Column(length = 50, nullable = false)
    private String nombre_usuario;

    @Column(length = 20)
    private String telefono;

    @Column(length = 100, nullable = false)
    @Stereotype("PASSWORD")
    private String contraseña;

    @Column(length = 100)
    private String email;

    @Column(length = 150)
    private String direccion_referencia;

    @Temporal(TemporalType.DATE)
    private Date fecha_registro;

    private Boolean activo;

    @ManyToOne
    @JoinColumn(name = "Rol_id_rol")
    @DescriptionsList(descriptionProperties = "nombre")
    private Rol rol;
}
