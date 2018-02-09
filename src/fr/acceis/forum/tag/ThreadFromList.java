package fr.acceis.forum.tag;

import java.io.IOException;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class ThreadFromList extends SimpleTagSupport
{
	private String message;

	public void setMessage(String message)
	{
		this.message = message;
	}

	@Override
	public void doTag() throws IOException
	{
		JspWriter out = this.getJspContext().getOut();
		if (this.message != null)
		{
			out.println("<table class=\"tablebg\" cellpadding=\"0\" width=\"100%\">\n" + "<tbody>\n" + "<tr>\n" + "<td class=\"row1\"><p class=\"breadcrumbs\">" + this.message + "</p></td>\n" + "</tr>\n" + "</tbody>\n" + "</table>\n" + "clear=\"all\" />\n");
		}
	}
}
