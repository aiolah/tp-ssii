package ssii.entity;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor // lombok, pour générer un constructeur avec les champs @NonNull
@ToString
public class Participation
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NonNull
    private String role;

    private Float pourcentage;

    @JoinColumn(name = "personne_id")
    @ManyToOne
    // ManyToOne car plusieurs participations pour une personne
    private Personne participant;

    @JoinColumn(name = "projet_id")
    @ManyToOne
    // ManyToOne car plusieurs participations pour un projet
    private Projet projet;
}
