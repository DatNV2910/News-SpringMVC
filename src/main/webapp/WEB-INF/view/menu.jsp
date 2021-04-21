<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<ul>
<c:forEach var="items" items="${menu}">
	<li>${items }</li>
</c:forEach>
</ul>