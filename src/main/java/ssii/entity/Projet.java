package ssii.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor // lombok, pour générer un constructeur avec les champs @NonNull
@ToString
public class Projet
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int code;

    @NonNull
    private String nom;

    private LocalDate debut;

    private LocalDate fin;
}
