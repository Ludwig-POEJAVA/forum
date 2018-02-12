package fr.acceis.forum.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Utilisateur")
public class Utilisateur
{
	@Id
	@GeneratedValue
	private long id;

	private Date inscription;

	private String login;

	private String password;

	private String email;

	//@OneToMany
	//private Collection<Post> posts;

	//@OneToMany
	//private Collection<Topic> topics;

	//
	//
	//
	//
	//
	//

	public Utilisateur()
	{
	}

	public Utilisateur(Date inscription, String login, String password, String email)
	{
		this.inscription = inscription;
		this.login = login;
		this.password = password;
		this.email = email;
	}

	public long getId()
	{
		return this.id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public Date getInscription()
	{
		return this.inscription;
	}

	public void setInscription(Date inscription)
	{
		this.inscription = inscription;
	}

	public String getLogin()
	{
		return this.login;
	}

	public void setLogin(String login)
	{
		this.login = login;
	}

	public String getPassword()
	{
		return this.password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getEmail()
	{
		return this.email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	@Override
	public String toString()
	{
		return "Utilisateur " + this.getLogin() + ":" + this.getPassword() + " " + this.getEmail();
	}
	/*
		public Collection<Post> getPosts()
		{
			return this.posts;
		}
	
		public void setPosts(List<Post> posts)
		{
			this.posts = posts;
		}
	
		public Collection<Topic> getTopics()
		{
			return this.topics;
		}
	
		public void setTopics(List<Topic> topics)
		{
			this.topics = topics;
		}
	*/
}
