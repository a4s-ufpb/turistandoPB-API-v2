package com.turistandoPB.main.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Atrativo")
public class Atrativo {
	
	private String nome;
	private String municipio;
	private String segmentacao;
	private String site;
	private String descricao;
	private String legendaFoto;
	private String linkMapa;
	
	public Atrativo() {
	}

	public Atrativo(String nome, String municipio, String segmentacao, String site, String descricao,
			String legendaFoto, String linkMapa) {
		this.nome = nome;
		this.municipio = municipio;
		this.segmentacao = segmentacao;
		this.site = site;
		this.descricao = descricao;
		this.legendaFoto = legendaFoto;
		this.linkMapa = linkMapa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getSegmentacao() {
		return segmentacao;
	}

	public void setSegmentacao(String segmentacao) {
		this.segmentacao = segmentacao;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getLegendaFoto() {
		return legendaFoto;
	}

	public void setLegendaFoto(String legendaFoto) {
		this.legendaFoto = legendaFoto;
	}

	public String getLinkMapa() {
		return linkMapa;
	}

	public void setLinkMapa(String linkMapa) {
		this.linkMapa = linkMapa;
	}

}
