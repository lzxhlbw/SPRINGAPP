<%--
  Created by IntelliJ IDEA.
  User: 徐豪
  Date: 2018/11/21
  Time: 20:46
  To change this template use File | Settings | File Templates.
--%>
<%@include file="include.jsp" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html" ; charset="utf8">
    <title><fmt:message key="title"/> </title>
</head>
<body>
<h1><fmt:message key="heading"/> </h1>
<p><fmt:message key="greeting"/> <c:out value="${model.now}"/></p>
<h3>Products</h3>
<c:forEach items="${model.products}" var="prod">
    <c:out value="${prod.description}"/>
    <i>$<c:out value="${prod.price}"/> </i>
    <br>
    <br>
</c:forEach>
<br>
<a href="<c:url value="priceincrease.htm"/> ">Increase Prices</a>
<br>
</body>
</html>
