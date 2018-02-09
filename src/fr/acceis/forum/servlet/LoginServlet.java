package fr.acceis.forum.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.acceis.forum.hibernate.UtilisateurHibernate;
import fr.acceis.forum.model.Utilisateur;

public class LoginServlet extends HttpServlet
{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		req.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String login = req.getParameter("username");
		String pwd = req.getParameter("password");

		UtilisateurHibernate utilisateurHibernate = new UtilisateurHibernate();
		Utilisateur user = null;

		user = utilisateurHibernate.trouverParLoginEtPwd(login, pwd);

		HttpSession session = req.getSession();

		if (user != null)
		{
			System.out.println("AUTH OK : " + user);
			session.setAttribute("user", user);
			resp.sendRedirect("/forum/home");
		}
		else
		{
			System.out.println("AUTH NOK :(");
			session.removeAttribute("user");
			resp.sendRedirect("/forum/login");
		}
	}
}
