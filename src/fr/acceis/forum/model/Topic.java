package fr.acceis.forum.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Topic")
public class Topic
{
	@Id
	@GeneratedValue
	private long	id;
	private String	titre;
	private Date	creation;
	private long	author_id;

	public Topic()
	{
	}

	public Topic(String titre, Date creation, long author_id)
	{
		this.titre = titre;
		this.creation = creation;
		this.author_id = author_id;
	}

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

	public Date getCreation()
	{
		return this.creation;
	}

	public void setCreation(Date creation)
	{
		this.creation = creation;
	}

	public long getAuthor_id()
	{
		return this.author_id;
	}

	public void setAuthor_id(long author_id)
	{
		this.author_id = author_id;
	}

}
