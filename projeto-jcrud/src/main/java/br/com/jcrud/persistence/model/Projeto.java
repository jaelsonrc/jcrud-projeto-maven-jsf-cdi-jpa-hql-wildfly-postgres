package br.com.jcrud.persistence.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Created by jaels on 20/10/2016.
 */
@Entity
@Table(name = "projeto")
@SequenceGenerator(name = "PROJETO_SEQ_ID", sequenceName = "PROJETO_SEQ_ID", allocationSize = 1)
public class Projeto extends AbstractEntity {

	private static final long serialVersionUID = 1L;
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PROJETO_SEQ_ID")
	private Long id;
	private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

	@Override
	public Long getId() {		
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	
}
