<%@ include file="../inc/import.jsp"%>
<%@ include file="../inc/public.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title><tiles:insertAttribute name="title" /></title>
<link rel="stylesheet" href="css/demos.css">
<link rel="stylesheet" href="css/ui-lightness/jquery-ui-1.8.18.custom.css">

<script type="text/javascript" src="js/jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="js/jquery-ui-1.8.18.custom.min.js"></script>
<script type="text/javascript" src="js/jquery.layout.min.js"></script>
<script type="text/javascript">
$(document).ready(function () {
	$('body').layout({ applyDefaultStyles: true });
});
</script>
</head>
<body>
	<div class="ui-layout-north">
		<tiles:insertAttribute name="header" />
	</div>

	<div class="ui-layout-west">
		<tiles:insertAttribute name="menu" />
	</div>

	<div class="ui-layout-center">
		<tiles:insertAttribute name="body" />
	</div>
	
	<div class="ui-layout-south">
		<tiles:insertAttribute name="footer" />
	</div>
</body>
</html>
