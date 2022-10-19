<%@ include file="include/importTags.jsp"%>

<%@ page pageEncoding="UTF-8"
         contentType="text/html; charset=UTF-8"%>

<html>
<head>

</head>
<body>
    <form:form modelAttribute="userData" action="/first/inscription" method="post">
        <form:label path="name">Name:</form:label>
        <form:input path="name" />

        <form:label path="age">Age:</form:label>
        <form:input path="age" ></form:input>

            <form:radiobutton path="male" value="true" label="Boy"></form:radiobutton>
            <form:radiobutton path="male" value="false" label="Girl"></form:radiobutton>

            <form:label path="hobby"></form:label>
            <form:select path="hobby">
                <form:option value="Football">Football</form:option>
                <form:option value="Basketball">Basketball</form:option>
                <form:option value="Volleyball">Volleyball</form:option>
            </form:select>


        <form:button type="submit">Submit</form:button>
    </form:form>
</body>
</html>