package fr.acceis.forum.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.acceis.forum.hibernate.TopicHibernate;
import fr.acceis.forum.model.Topic;

public class ViewTopicServlet extends HttpServlet
{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{

		//TopicHibernate topicHibernate = new TopicHibernate();
		//List<Topic> topics = topicHibernate.listerTopics();

		HttpSession session = req.getSession();
		System.out.println("VOIR TOPIC #" + 0);
		String topic;
		try
		{
			topic = req.getParameter("topic");
		}
		finally
		{
			//redirect to home;
		}
		//session.setAttribute("topics", topics);

		req.getRequestDispatcher("/WEB-INF/jsp/threads.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		this.doGet(req, resp);
	}

}
