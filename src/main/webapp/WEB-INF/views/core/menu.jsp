<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap 101 Template</title>

    <!-- Bootstrap -->
    <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">

  </head>
  <body>
    
   
      <div class="container">
      	<nav class="navbar navbar-default">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-collapse-1">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">Locadora São Judas</a>
        </div>
    
        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="navbar-collapse-1">
          <ul class="nav navbar-nav navbar-right">
            <li><a href="${pageContext.request.contextPath}/cadastro-cliente">Cadastrar Cliente</a></li>
            <li><a href="${pageContext.request.contextPath}/cadastro-veiculo">Veiculos</a></li>
            <li><a href="${pageContext.request.contextPath}/devolucao">Devolver veiculo</a></li>
            <li><a href="${pageContext.request.contextPath}/emprestar">Emprestar Veiculo</a></li>
            <li><a href="#">News</a></li>
            <li><a href="contact.html">Contact</a></li>
          </ul>  
        </div><!-- /.navbar-collapse -->
        </nav><!-- /.navbar -->
      </div><!-- /.container -->
    

    
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
  </body>
</html>
