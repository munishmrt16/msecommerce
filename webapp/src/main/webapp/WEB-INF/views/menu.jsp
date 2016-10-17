<jsp:include page="include.jsp" />

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<c:set var="req" value="${pageContext.request}" />

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand active" href="${req.contextPath}" >HOME</a>
    </div>
    <ul class="nav navbar-nav">
      <li><a href="${req.contextPath}/aboutus">ABOUT</a></li>
       <li><a href="${req.contextPath}/contact">CONTACT</a></li>
      <li><a href="${req.contextPath}/viewall">VIEW ALL</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="${req.contextPath}/signup"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="${req.contextPath}/signin"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
  </div>
</nav>
