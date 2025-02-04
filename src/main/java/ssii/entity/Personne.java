package ssii.entity;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor // lombok, pour générer un constructeur avec les champs @NonNull
@ToString
public class Personne
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer matricule;

    @NotBlank
    @NonNull // lombok
    private String nom;

    @NonNull
    private String prenom;

    private String poste;

    @ManyToMany(mappedBy = "projet")
    List<Projet> projets = new ArrayList<Projet>();
}
