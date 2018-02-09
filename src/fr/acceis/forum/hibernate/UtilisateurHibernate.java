package fr.acceis.forum.hibernate;

import java.util.List;

import javax.persistence.EntityTransaction;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import fr.acceis.forum.model.Utilisateur;
import fr.acceis.jpa.HibernateUtil;

public class UtilisateurHibernate
{
	public Utilisateur trouverParLoginEtPwd(String login, String pwd)
	{
		Session session = HibernateUtil.getSession();
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();

		CriteriaQuery<Utilisateur> query = criteriaBuilder.createQuery(Utilisateur.class);
		Root<Utilisateur> root = query.from(Utilisateur.class);
		query.select(root);

		Predicate restrictionUtilisateur = criteriaBuilder.and(criteriaBuilder.equal(root.get("login"), login), criteriaBuilder.equal(root.get("password"), pwd));

		query.where(restrictionUtilisateur);

		List<Utilisateur> utilisateur = session.createQuery(query).getResultList();

		if (utilisateur.size() == 0)
			return null;
		return utilisateur.get(0);
	}

	public void enregisterUnNouvelUtilisateur(Utilisateur user)
	{
		Session session = HibernateUtil.getSession();
		EntityTransaction tx = session.getTransaction();
		tx.begin();

		session.persist(user);

		tx.commit();
	}

	Utilisateur trouverParEmail(String email)
	{
		Session session = HibernateUtil.getSession();
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();

		CriteriaQuery<Utilisateur> query = criteriaBuilder.createQuery(Utilisateur.class);
		Root<Utilisateur> root = query.from(Utilisateur.class);
		query.select(root);

		Predicate restrictionUtilisateur = criteriaBuilder.equal(root.get("email"), email);

		query.where(restrictionUtilisateur);

		List<Utilisateur> utilisateur = session.createQuery(query).getResultList();

		if (utilisateur.size() == 0)
			return null;
		return utilisateur.get(0);
	}

	Utilisateur trouverParLogin(String login)
	{
		Session session = HibernateUtil.getSession();
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();

		CriteriaQuery<Utilisateur> query = criteriaBuilder.createQuery(Utilisateur.class);
		Root<Utilisateur> root = query.from(Utilisateur.class);
		query.select(root);

		Predicate restrictionUtilisateur = criteriaBuilder.equal(root.get("login"), login);

		query.where(restrictionUtilisateur);

		List<Utilisateur> utilisateur = session.createQuery(query).getResultList();

		if (utilisateur.size() == 0)
			return null;
		return utilisateur.get(0);
	}

	public Utilisateur trouverParLoginOuEmail(String login, String email)
	{
		Session session = HibernateUtil.getSession();
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();

		CriteriaQuery<Utilisateur> query = criteriaBuilder.createQuery(Utilisateur.class);
		Root<Utilisateur> root = query.from(Utilisateur.class);
		query.select(root);

		Predicate restrictionUtilisateur = criteriaBuilder.or(criteriaBuilder.equal(root.get("login"), login), criteriaBuilder.equal(root.get("email"), email));

		query.where(restrictionUtilisateur);

		List<Utilisateur> utilisateur = session.createQuery(query).getResultList();

		if (utilisateur.size() == 0)
			return null;
		return utilisateur.get(0);
	}

}
