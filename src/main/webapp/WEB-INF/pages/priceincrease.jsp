<%@ include file="/WEB-INF/pages/include.jsp" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Product Form</title>
    <style>
        .error {
            color: red;
        }
    </style>
</head>
<body>
<h1>Product Form</h1>
<form:form method="post" commandName="priceIncrease">
    <table width="95%" bgcolor="f8f8ff" border="0" cellspacing="0" cellpadding="5">
        <tr>
            <td align="right" width="20%">Increase (%):</td>
            <td width="20%">
                <form:input path="percentage"/>
            </td>
            <td width="60%">
                <form:errors path="percentage" cssClass="error"/>
            </td>
        </tr>
    </table>
    <br>
    <input type="submit" align="center" value="Execute">
</form:form>
</body>
</html>