package fr.acceis.forum.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Post")
public class Post
{
	@Id
	@GeneratedValue
	private long id;

	private String message;

	@ManyToOne
	private Topic parent;

	private Date dateCreation;

	@ManyToOne
	private Utilisateur auteur;

	//
	//
	//
	//
	//
	//

	public long getId()
	{
		return this.id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public String getMessage()
	{
		return this.message;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}

	public Topic getParent()
	{
		return this.parent;
	}

	public void setParent(Topic parent)
	{
		this.parent = parent;
	}

	public Date getDateCreation()
	{
		return this.dateCreation;
	}

	public void setDateCreation(Date dateCreation)
	{
		this.dateCreation = dateCreation;
	}

	public Utilisateur getAuteur()
	{
		return this.auteur;
	}

	public void setAuteur(Utilisateur auteur)
	{
		this.auteur = auteur;
	}
}
