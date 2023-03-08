package com.apps4society.turistandopb.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_atracao")
public class Atracao implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String descricao;

    private String email;

    private String segmentacao;

    private String maps;

    public Atracao() {
    }

    public Atracao(Long id, String nome, String descricao, String email, String segmentacao, String maps) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.email = email;
        this.segmentacao = segmentacao;
        this.maps = maps;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSegmentacao() {
        return segmentacao;
    }

    public void setSegmentacao(String segmentacao) {
        this.segmentacao = segmentacao;
    }

    public String getMaps() {
        return maps;
    }

    public void setMaps(String maps) {
        this.maps = maps;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Atracao atracao = (Atracao) o;
        return id.equals(atracao.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
