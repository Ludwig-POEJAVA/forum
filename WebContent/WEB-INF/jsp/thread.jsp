<!DOCTYPE html>
<html dir="ltr" lang="en-gb">
<head>
	<title>THREAD</title>
	<meta charset="UTF-8">
	<link href="file:/C:/Users/Formation/eclipse-workspace/forum/WebContent/fichiers/style.css" rel="stylesheet" type="text/css">
	<link href="fichiers/style.css" rel="stylesheet" type="text/css">
</head>
<body class="ltr">
	<div id="wrapcentre">
		<div id="pagecontent">
			<table cellpadding="0" cellspacing="1" class="tablebg" style="margin-top: 5px;" width="100%">
				<tbody>
					<tr>
						<td class="row1">
							<%@include file = "/WEB-INF/jspf/loginStatus.jspf" %>
						</td>
					</tr>
				</tbody>
			</table><br clear="all">
			<table cellspacing="1" width="100%">
				<tbody>
					<tr>
						<td align="left" colspan="4" nowrap="nowrap" valign="middle"><a href="#"><img alt="Post new topic" src="fichiers/button_topic_new.gif" title="Post new topic"></a>&nbsp;<a href="#"><img alt="Reply to topic" src="fichiers/button_topic_reply.gif" title="Reply to topic"></a></td>
					</tr>
				</tbody>
			</table><br clear="all">
			
			<!--  posts -->
			
				<%@include file = "/WEB-INF/jspf/listPosts.jspf" %>
			
			<!-- /posts -->
			
		</div><br clear="all">
		<table cellpadding="0" cellspacing="1" class="tablebg" style="margin-top: 5px;" width="100%">
			<tbody>
				<tr>
					<td class="row1">
						<p class="breadcrumbs"><a href="/forum/home">Board index</a></p>
					</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>