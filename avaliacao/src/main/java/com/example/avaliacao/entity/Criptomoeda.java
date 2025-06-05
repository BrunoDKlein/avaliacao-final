package com.example.avaliacao.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Criptomoeda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "É obrigatório informar o nome")
    @Size(min = 3, max = 100, message = "O nome deve ter entre 3 e 100 caracteres")
    private String nome;

    @NotNull(message = "É obrigatório informar a sigla")
    @Pattern(regexp = "[A-Z]{3}", message = "A sigla deve ter 3 letras maiúsculas. Ex: BTC")
    private String sigla;

    @NotNull(message = "É obrigatório informar o preço atual")
    @Positive(message = "É obrigatório que o preço seja maior que 0")
    private double precoAtual;

    @NotNull(message = "É obrigatório informar o volume negociado")
    @PositiveOrZero(message = "É obrigatório que o volume negociado seja maior ou igual a 0")
    private double volumeNegociado;

    @NotNull(message = "É obrigatório informar a data de cadastro")
    @PastOrPresent(message = "A data de cadastro não pode ser uma data futura")
    private LocalDate dataCadastro;

    @NotNull(message = "É obrigatório informar a atividade da criptomoeda")
    private boolean ativo;

    @Size(max = 255, message = "A descrição não pode exceder 255 caracteres")
    private String descricao;

    @NotNull(message = "É obrigatório informar o país")
    @Size(min = 2, max = 60, message = "O nome do país deve ter entre 2 e 60 caracteres")
    private String pais;

    private String siteOficial;
}
