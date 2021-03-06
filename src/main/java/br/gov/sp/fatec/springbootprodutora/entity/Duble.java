package br.gov.sp.fatec.springbootprodutora.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "D")
public class Duble extends Pessoa {
	
	@Column(name = "dub_especialidade")
	private String especialidade;
    
	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
}