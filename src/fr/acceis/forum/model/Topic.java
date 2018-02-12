package fr.acceis.forum.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Topic")
public class Topic
{
	@Id
	@GeneratedValue
	private long		id;
	private String		titre;
	private Date		creationDate;
	private long		reponses;
	private long		vues;
	@OneToOne
	private Utilisateur	auteur;

	public long getId()
	{
		return this.id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public String getTitre()
	{
		return this.titre;
	}

	public void setTitre(String titre)
	{
		this.titre = titre;
	}

	public Date getCreationDate()
	{
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate)
	{
		this.creationDate = creationDate;
	}

	public Utilisateur getAuteur()
	{
		return this.auteur;
	}

	public void setAuteur(Utilisateur auteur)
	{
		this.auteur = auteur;
	}

	public long getReponses()
	{
		return this.reponses;
	}

	public void setReponses(long reponses)
	{
		this.reponses = reponses;
	}

	public long getVues()
	{
		return this.vues;
	}

	public void setVues(long vues)
	{
		this.vues = vues;
	}
}
