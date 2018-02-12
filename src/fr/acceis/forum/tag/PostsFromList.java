package fr.acceis.forum.tag;

import java.io.IOException;
import java.util.Date;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class PostsFromList extends SimpleTagSupport
{
	private String	auteur;
	private String	topicTitre;
	private Date	datePostage;
	private String	message;

	@Override
	public void doTag() throws IOException
	{
		JspWriter out = this.getJspContext().getOut();

		String s = "";

		s += "<table cellspacing=\"1\" class=\"tablebg\" width=\"100%\">";
		s += "	<tbody>";
		s += "		<tr class=\"row2\">";
		s += "			<td align=\"center\" valign=\"middle\"><b class=\"postauthor\">" + this.auteur + "</b></td>";
		s += "			<td height=\"25\" width=\"100%\">";
		s += "				<table cellspacing=\"0\" width=\"100%\">";
		s += "					<tbody>";
		s += "						<tr>";
		s += "							<td class=\"gensmall\" width=\"100%\">";
		s += "								<div style=\"float: left;\">";
		s += "									&nbsp; <b>Fil de discussion :</b> " + this.topicTitre + "";
		s += "								</div>";
		s += "								<div style=\"float: right;\">";
		s += "									<b>Posted:</b> <!--Wed Aug 17, 2016 2:12 pm-->" + this.datePostage + "&nbsp;";
		s += "								</div>";
		s += "							</td>";
		s += "						</tr>";
		s += "					</tbody>";
		s += "				</table>";
		s += "			</td>";
		s += "		</tr>";
		s += "	</tbody>";
		s += "	<tr class=\"row2\">";
		s += "		<td class=\"profile\" valign=\"top\">";
		s += "			<table align=\"center\" cellspacing=\"4\" width=\"150\"></table><span class=\"postdetails\"><b>Posts:</b> 24</span>";
		s += "		</td>";
		s += "		<td valign=\"top\">";
		s += "			<table cellspacing=\"5\" width=\"100%\">";
		s += "				<tbody>";
		s += "					<tr>";
		s += "						<td>";
		s += "							<div class=\"postbody\">";
		s += "								" + this.message + "";
		s += "							</div><br clear=\"all\">";
		s += "							<br>";
		s += "							<table cellspacing=\"0\" width=\"100%\">";
		s += "								<tbody>";
		s += "									<tr valign=\"middle\">";
		s += "										<td align=\"right\" class=\"gensmall\"></td>";
		s += "									</tr>";
		s += "								</tbody>";
		s += "							</table>";
		s += "						</td>";
		s += "					</tr>";
		s += "				</tbody>";
		s += "			</table>";
		s += "		</td>";
		s += "	</tr>";
		s += "	<tr>";
		s += "		<td class=\"spacer\" colspan=\"2\" height=\"1\"><img alt=\"\" height=\"1\" src=\"fichiers/spacer.gif\" width=\"1\"></td>";
		s += "	</tr>";
		s += "</table>";

		out.println(s);

	}

	public void setAuteur(String auteur)
	{
		this.auteur = auteur;
	}

	public void setTopicTitre(String topicTitre)
	{
		this.topicTitre = topicTitre;
	}

	public void setDatePostage(Date datePostage)
	{
		this.datePostage = datePostage;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}
}
