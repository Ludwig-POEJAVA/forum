package fr.acceis.forum.hibernate;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import fr.acceis.forum.model.Topic;
import fr.acceis.jpa.HibernateUtil;

public class TopicHibernate
{
	public List<Topic> listerTopics()
	{
		Session session = HibernateUtil.getSession();
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();

		CriteriaQuery<Topic> query = criteriaBuilder.createQuery(Topic.class);
		Root<Topic> root = query.from(Topic.class);
		query.select(root);

		List<Topic> topics = session.createQuery(query).getResultList();

		return topics;
	}
}
