package gm.contactos.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "contacto")
public class Contacto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idContacto;

    @Column(name="nombre", length = 100)
    String nombre;

    @Column(name="celular", length = 20)
    String celular;

    @Column(name="email", length = 50)
    String email;
}
