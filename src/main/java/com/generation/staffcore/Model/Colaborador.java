package com.generation.staffcore.Model;


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
    @Size(min = 10, max = 255, message = "O Nome completo deve conter entre 10 a 255 caracteres! ")
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
    @Column(name = "email", nullable = true)
    private String email;

    //Atributo data de admissão
    @Column(name = "dataAdmissao", nullable = false)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataAdmissao;

    //Atributo data de demissão
    @Column(name = "dataDemissao", nullable = true)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataDemissao;

    //Atributo Contrato
    @NotBlank(message = "O tipo de contrato não pode estar vazio!")
    @Size(max = 25, message = "O tipo de contrato deve conter no máximo 25 caracteres! ")
    @Column(name = "tipoContrato", nullable = true)
    private String tipoContrato;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public LocalDate getDataDemissao() {
		return dataDemissao;
	}

	public void setDataDemissao(LocalDate dataDemissao) {
		this.dataDemissao = dataDemissao;
	}

	public String getTipoContrato() {
		return tipoContrato;
	}

	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}

}
