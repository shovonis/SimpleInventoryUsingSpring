<%@ include file="/WEB-INF/pages/include.jsp" %>

<html>
<head><title>Example :: Spring Application</title></head>
<body>
<h1>Example - Spring Application</h1>

<p>This is my test.</p>

<p>Greetings, it is now <c:out value="${myModel.now}"/></p>

<h3>Products: </h3>
<c:forEach items="${myModel.products}" var="prod">
    <c:out value="${prod.description}"/> <i>$<c:out value="${prod.price}"/></i><br><br>
</c:forEach>

<p><a href="priceincrease">Increase Price Rate</a></p>
<p><a href="/">Home</a></p>

</body>
</html>