<%@page session="false"%>
<html>
<head>
    <title>${title}</title>
</head>
<body>
<jsp:include page="_menu.jsp" />
<h2>User Page</h2>

<h3> Welcome : ${message}</h3>

<b>This is protected page!</b>
</body>
</html>
