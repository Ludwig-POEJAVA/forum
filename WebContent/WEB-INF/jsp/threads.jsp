<!DOCTYPE html>
<html dir="ltr" lang="en-gb">
<head>
	<title>FORUM</title>
	<meta charset="UTF-8">
	<link href="fichiers/style.css" rel="stylesheet" type="text/css">
</head>
<body class="ltr">
	<div id="wrapcentre">
		<div id="pagecontent">
			<table cellpadding="0" cellspacing="1" class="tablebg" style="margin-top: 5px;" width="100%">
				<tbody>
					<tr>
						<td class="row1">
							<%@include file="/WEB-INF/jspf/loginStatus.jspf" %>
						</td>
					</tr>
				</tbody>
			</table><br clear="all">
			<table cellspacing="1" width="100%">
				<tbody>
					<tr>
						<%@include file="/WEB-INF/jspf/creerTopic.jspf" %>
					</tr>
				</tbody>
			</table><br clear="all">
			<table cellspacing="1" class="tablebg" width="100%">
				<tbody>
					<tr>
						<td class="cat" colspan="4">
							<table cellspacing="0" width="100%">
								<tbody>
									<tr class="nav">
										<td valign="middle">&nbsp;</td>
										<td align="right" valign="middle">&nbsp;</td>
									</tr>
								</tbody>
							</table>
						</td>
					</tr>
					<tr>
						<th>&nbsp;Topics&nbsp;</th>
						<th>&nbsp;Auteur&nbsp;</th>
						<th>&nbsp;R&eacute;ponses&nbsp;</th>
						<th>&nbsp;Vues&nbsp;</th>
					</tr>
					<!--  topics -->
					<%@include file="/WEB-INF/jspf/listTopics.jspf" %>
					<!-- /topics -->
				</tbody>
			</table><br clear="all">
		</div>
		<table cellpadding="0" cellspacing="1" class="tablebg" style="margin-top: 5px;" width="100%">
			<tbody>
				<tr>
					<td class="row1">
						<p class="breadcrumbs">Index du forum</p>
					</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>