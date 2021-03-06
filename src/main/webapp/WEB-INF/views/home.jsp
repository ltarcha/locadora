<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap 101 Template</title>

    <!-- Bootstrap -->
    <link href="${ pageContext.request.contextPath }/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  </head>
  <body>
    
    <jsp:include page="core/menu.jsp"></jsp:include>
    
    <div class="container">
	    <c:if test="${idEmp != null}">
		    <div class="alert alert-success" role="alert">
		  		<a href="#" class="alert-link">Emprestimo realizado com sucesso! ID: ${idEmp }</a>
			</div>
	    </c:if>
    </div>
    
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="${pageContext.request.contextPath}/resources/bootstrap/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/tdv/js/controller/home-controller.js"></script>
  </body>
</html>
