package fr.acceis.forum.hibernate;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import fr.acceis.forum.model.Post;
import fr.acceis.jpa.HibernateUtil;

public class PostHibernate
{
	public List<Post> listerPosts(int topicId)
	{
		Session session = HibernateUtil.getSession();
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();

		CriteriaQuery<Post> query = criteriaBuilder.createQuery(Post.class);
		Root<Post> root = query.from(Post.class);
		query.select(root);

		List<Post> posts = session.createQuery(query).getResultList();

		return posts;
	}
}
