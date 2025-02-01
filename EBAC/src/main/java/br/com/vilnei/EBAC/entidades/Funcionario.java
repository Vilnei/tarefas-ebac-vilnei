package br.com.vilnei.EBAC.entidades;

import jakarta.persistence.*;
import java.sql.Date;


@Entity
public class Funcionario {

    @Column(nullable = false)
    private String nome;

    @Id
    @Column(nullable = false)
    private String cpf;

    @Column(nullable = false)
    private Date Admissao;

    @Column
    private Date Demissao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getAdmissao() {
        return Admissao;
    }

    public void setAdmissao(Date dataAdmissao) {
        this.Admissao = dataAdmissao;
    }

    public Date getDemissao() {
        return Demissao;
    }

    public void setDemissao(Date dataDemissao) {
        this.Demissao = dataDemissao;
    }

}
