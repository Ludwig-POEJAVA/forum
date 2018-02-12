package fr.acceis.forum.tag;

import java.io.IOException;
import java.util.Date;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class ThreadFromList extends SimpleTagSupport
{
	String	titre;
	int		vues;
	int		reponses;
	String	auteur;
	Date	dateCreation;

	@Override
	public void doTag() throws IOException
	{
		JspWriter out = this.getJspContext().getOut();

		String s = "";

		s += "\t\t\t\t\t<tr>";
		s += "\t\t\t\t\t\t<td class=\"row1\">";
		s += "\t\t\t\t\t\t\t<a class=\"topictitle\" href=\"" + "#thread.lien.vers." + this.titre + "\">" + this.titre + "</a>";
		s += "\t\t\t\t\t\t</td>";
		s += "\t\t\t\t\t\t<td align=\"center\" class=\"row2\" width=\"130\">";
		s += "\t\t\t\t\t\t\t<p class=\"topicauthor\"><a class=\"username-coloured\" href=\"" + "#profil/id." + this.auteur + "\">" + this.auteur + "</a></p>";
		s += "\t\t\t\t\t\t</td>";
		s += "\t\t\t\t\t\t<td align=\"center\" class=\"row1\" width=\"50\">";
		s += "\t\t\t\t\t\t\t<p class=\"topicdetails\">" + this.reponses + "</p>";
		s += "\t\t\t\t\t\t</td>";
		s += "\t\t\t\t\t\t<td align=\"center\" class=\"row2\" width=\"50\">";
		s += "\t\t\t\t\t\t\t<p class=\"topicdetails\">" + this.vues + "</p>";
		s += "\t\t\t\t\t\t</td>";
		s += "\t\t\t\t\t</tr>";
		out.println(s);

	}

	public void setTitre(String titre)
	{
		this.titre = titre;
	}

	public void setVues(int vues)
	{
		this.vues = vues;
	}

	public void setReponses(int reponses)
	{
		this.reponses = reponses;
	}

	public void setAuteur(String auteur)
	{
		this.auteur = auteur;
	}

	public void setDateCreation(Date dateCreation)
	{
		this.dateCreation = dateCreation;
	}
}
