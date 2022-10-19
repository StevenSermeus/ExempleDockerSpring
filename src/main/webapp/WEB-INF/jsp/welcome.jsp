<%@ include file="include/importTags.jsp"%>
<%@ page pageEncoding="UTF-8"
         contentType="text/html; charset=UTF-8"%>

<html>
<head>

</head>
<body>

<form:form method="post" action="/first/hello/send" modelAttribute="magicKey">
    <form:label path="magicKey">Name</form:label>
    <form:input path="magicKey" />
    <form:button type="submit">Submit</form:button>
</form:form>
</body>
</html>