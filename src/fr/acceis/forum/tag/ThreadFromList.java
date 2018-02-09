package fr.acceis.forum.tag;

import java.io.IOException;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class ThreadFromList extends SimpleTagSupport
{
	private Object thread;

	public void setMessage(Object thread)
	{
		this.thread = thread;
	}

	@Override
	public void doTag() throws IOException
	{
		JspWriter out = this.getJspContext().getOut();
		if (this.thread != null)
		{

			//temporaire
			String titre = "Mon fil de discussion";
			int vues = 1234;
			int reponses = 10;
			String auteur = "Yves";
			String s = "";

			s += "\t\t\t\t\t<tr>";
			s += "\t\t\t\t\t\t<td class=\"row1\">";
			s += "\t\t\t\t\t\t\t<a class=\"topictitle\" href=\"" + "#thread.lien.vers." + titre + "\">" + titre + "</a>";
			s += "\t\t\t\t\t\t</td>";
			s += "\t\t\t\t\t\t<td align=\"center\" class=\"row2\" width=\"130\">";
			s += "\t\t\t\t\t\t\t<p class=\"topicauthor\"><a class=\"username-coloured\" href=\"" + "#profil/id." + auteur + "\">" + auteur + "</a></p>";
			s += "\t\t\t\t\t\t</td>";
			s += "\t\t\t\t\t\t<td align=\"center\" class=\"row1\" width=\"50\">";
			s += "\t\t\t\t\t\t\t<p class=\"topicdetails\">" + reponses + "</p>";
			s += "\t\t\t\t\t\t</td>";
			s += "\t\t\t\t\t\t<td align=\"center\" class=\"row2\" width=\"50\">";
			s += "\t\t\t\t\t\t\t<p class=\"topicdetails\">" + vues + "</p>";
			s += "\t\t\t\t\t\t</td>";
			s += "\t\t\t\t\t</tr>";
			out.println(s);
		}
	}
}
