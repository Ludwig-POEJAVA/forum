package fr.acceis.forum.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.acceis.forum.hibernate.PostHibernate;
import fr.acceis.forum.hibernate.TopicHibernate;
import fr.acceis.forum.model.Post;
import fr.acceis.forum.model.Topic;

public class ViewTopicServlet extends HttpServlet
{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		HttpSession session = req.getSession();

		String topic;
		int topicInt;
		try
		{
			topic = req.getParameter("topic");
			topicInt = Integer.parseInt(topic);
			System.out.println("VOIR TOPIC #" + topicInt);

			//dao

			PostHibernate postHibernate = new PostHibernate();
			List<Post> posts = postHibernate.listerPosts(topicInt);

			session.setAttribute("posts", posts);
		}
		catch (Exception e)
		{
			//send to /home if no topic to display
			resp.sendRedirect("/forum/home");
		}
		//session.setAttribute("topics", topics);

		req.getRequestDispatcher("/WEB-INF/jsp/thread.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		this.doGet(req, resp);
	}

}
