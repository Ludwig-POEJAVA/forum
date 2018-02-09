package fr.acceis.forum.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.acceis.forum.hibernate.UtilisateurHibernate;
import fr.acceis.forum.model.Utilisateur;

public class RegisterServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		HttpSession session = req.getSession();
		if (session.getAttribute("user") != null)
		{
			resp.sendRedirect("/forum/home");
		}
		else
		{
			req.getRequestDispatcher("/WEB-INF/jsp/register.jsp").forward(req, resp);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{

		HttpSession session = req.getSession();

		if (session.getAttribute("user") != null)
		{
			session.setAttribute("errorMsg", "mec t'es connécté");
			System.out.println("CREATION NOK :(");
			resp.sendRedirect("/forum/register");
		}

		String login = req.getParameter("username");
		String pwd = req.getParameter("password");
		String email = req.getParameter("email");

		UtilisateurHibernate utilisateurHibernate = new UtilisateurHibernate();
		Utilisateur user = null;

		user = utilisateurHibernate.trouverParLoginOuEmail(login, email);
		if (user != null)
		{
			session.setAttribute("errorMsg", "identifiants deja créés");
			System.out.println("CREATION NOK :(");
			resp.sendRedirect("/forum/register");
		}
		else
		{
			user = new Utilisateur(new Date(), login, pwd, email);
			utilisateurHibernate.enregisterUnNouvelUtilisateur(user);
			session.removeAttribute("errorMsg");
			System.out.println("CREATION OK " + user);
			session.setAttribute("user", user);
			resp.sendRedirect("/forum/home");
		}
	}
}
