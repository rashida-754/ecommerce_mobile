<%@ page language="java" contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <!-- Brand/logo -->
  <a class="navbar-brand" href="#">Mobile Mania</a>
  
  <!-- Links -->
   <c:out value="${!sessionScope.loggedIn}"/>
  <ul class="navbar-nav">
     <c:if test="${!sessionScope.loggedIn}">
       <li class="nav-item"><a class="nav-link" href="productHome">Home</a></li>
       <li class="nav-item"><a class="nav-link" href="login">Login</a></li>
       <li class="nav-item"><a class="nav-link" href="register">Register</a></li>
       <li class="nav-item"><a class="nav-link" href="aboutUs">About Us</a></li>
       <li class="nav-item"><a class="nav-link" href="contactUs">Contact Us</a></li>
   </c:if>
   <c:if test="${sessionScope.loggedIn}">
     <c:if test="${sessionScope.role=='ROLE_ADMIN'}">
        <li class="nav-item"><a class="nav-link" href="AdminHome">Home</a></li>
        <li class="nav-item"><a class="nav-link" href="aboutUs">About Us</a></li>
        <li class="nav-item"><a class="nav-link" href="contactUs">Contact Us</a></li>
        <li class="nav-item"><a class="nav-link" href="<c:url value="/category"/>">Manage Category</a></li>
        <li class="nav-item"><a class="nav-link" href="<c:url value="/product"/>">Manage Product</a></li>
      </c:if>
      <c:if test="${sessionScope.role== 'ROLE_USER'}">
          <li class="nav-item"><a class="nav-link" href="productHome">Home</a></li>
          <li class="nav-item"><a class="nav-link" href="cart">Cart</a></li>
          <li class="nav-item"><a class="nav-link" href="aboutUs">About Us</a></li>
          <li class="nav-item"><a class="nav-link" href="contactUs">Contact Us</a></li>
      </c:if>
     </c:if>
   </ul>
  <ul class="nav navbar-nav navbar-right">
     <c:if test="${!sessionScope.loggedIn}">
     <!--  <li><a href="<c:url value="/register"/>"><span 
          class="glyphicon glyphicon-user"></span>Sign Up</a></li>
      <li><a href="<c:url value="/login"/>"><span 
          class="glyphicon glyphicon-log-in"></span>Sign In</a></li> -->
     </c:if>
      <c:if test="${sessionScope.loggedIn}">
        <li><h3 style="color:yellow">Welcome:</h3><span class="glyphicon glyphicon-user"><h3 style="color:pink">${sessionScope.username}</h3></span></a></li>
        &nbsp;&nbsp;
        <li><a href="<c:url value="/perform_logout"/>"><span class="glyphicon glyphicon-log-out">Logout</span></a></li>
      </c:if>
  </ul>
</nav>
</body>
</html>