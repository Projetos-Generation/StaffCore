package com.generation.steffcore.Model;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

@Entity
@Table(name = "tb_colaborador")
public class Colaborador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Atributo Matricula
    @NotBlank(message = "A matricula não pode estar vazia!")
    @Size(max = 10, message = "A matricula deve conter no máximo 10 caracteres! ")
    private String matricula;

    //Atributo Nome
    @NotBlank(message = "O nome não pode estar vazia:")
    @Size(min = 10, max = 255, message = "O Nome completo deve conter entre 50 a 255 caracteres! ")
    @Column(name = "nomeCompleto")
    private String nomeCompleto;

    @Column(name = "dataNascimento", nullable = false)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataNascimento;

    //Atributo CPF
    @NotBlank(message = "O atributo CPF não pode estar vazio!")
    @CPF
    @Pattern(
            regexp = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}",
            message = "CPF deve estar no formato 000.000.000-00"
        )
    private String cpf;

    //Atributo Email
    @NotBlank(message = "O atributo Email não pode estar vazio!")
    @Email
    private String email;

    //Atributo data de admissão
    @Column(name = "data_admissao", nullable = false)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate data_admissao;

    //Atributo data de demissão
    @Column(name = "data_demissao", nullable = true)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate data_demissao;

    //Atributo Contrato
    @NotBlank(message = "O tipo de contrato não pode estar vazio!")
    @Size(max = 25, message = "O tipo de contrato deve conter no máximo 25 caracteres! ")
    private String tipo_contrato;

    public Long getId () {
        return id;
    }

    public void setId (Long id) {
        this.id = id;
    }

    public String getMatricula () {
        return matricula;
    }

    public void setMatricula (String matricula) {
        this.matricula = matricula;
    }

    public String getNome_completo () {
        return nomeCompleto;
    }

    public void setNome_completo (String nome_completo) {
        this.nomeCompleto = nome_completo;
    }

    public LocalDate getData_nascimento () {
        return dataNascimento;
    }

    public void setData_nascimento (LocalDate data_nascimento) {
        this.dataNascimento = data_nascimento;
    }

    public String getCpf () {
        return cpf;
    }

    public void setCpf (String cpf) {
        this.cpf = cpf;
    }

    public String getEmail () {
        return email;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public LocalDate getData_admissao () {
        return data_admissao;
    }

    public void setData_admissao (LocalDate data_admissao) {
        this.data_admissao = data_admissao;
    }

    public LocalDate getData_demissao () {
        return data_demissao;
    }

    public void setData_demissao (LocalDate data_demissao) {
        this.data_demissao = data_demissao;
    }

    public String getTipo_contrato () {
        return tipo_contrato;
    }

    public void setTipo_contrato (String tipo_contrato) {
        this.tipo_contrato = tipo_contrato;
    }
}
