<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
hello from JSP
<c:forEach items="${nowaLista}" var="user">
    <span>${user}</span>
</c:forEach>