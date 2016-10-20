<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<c:set var="req" value="${pageContext.request}" />

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <!-- Bootstrap -->
    <link href="${req.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body background="./resources/images/backgroundimg.jpg" >
  

<jsp:include page="include.jsp" />
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
      <li><a href="${req.contextPath}/admin/view"><span class="glyphicon glyphicon-log-in"></span>Admin Login</a></li>
    </ul>
  </div>
</nav>
