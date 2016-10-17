<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<c:set var="req" value="${pageContext.request}" />



<head>
  <title>Online Garment Shopping</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="${req.contextPath}/resources/css/bootstrap.min.css">
  <link rel="stylesheet" href="${req.contextPath}/resources/css/page.css">
  <link rel="stylesheet" href="${req.contextPath}/resources/css/style.css">
  <link rel="stylesheet" href="${req.contextPath}/resources/css/thumbnail.css">
  
  <script src="${req.contextPath}/resources/js/jquery.min.js"></script>
  <script src="${req.contextPath}/resources/js/bootstrap.min.js"></script>
  <script src="${req.contextPath}/resources/js/bootstrap.min.js"></script>
  <script src="${req.contextPath}/resources/js/thumbnail.js"></script>
  <script src="${req.contextPath}/resources/js/angular.js"></script>
  
  
<spring:url value="${req.contextPath}/resources/crunchify.css" var="crunchifyCSS" />
<spring:url value="${req.contextPath}/resources/crunchify.js" var="crunchifyJS" />
<script src="${req.contextPath}/resources/js/jquery.min.js"></script>
<link href="${crunchifyCSS}" rel="stylesheet" />
<script src="${crunchifyJS}"></script>

   <style>
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img 
  {
      width: 70%;
      margin: auto;
  }
  </style>
  
  </head>

  
  