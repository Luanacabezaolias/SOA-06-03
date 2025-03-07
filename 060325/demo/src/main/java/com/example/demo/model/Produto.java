package  com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "produtos")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Produto{
    @Id
    @GenerateValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private double preco
}

