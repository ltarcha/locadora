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
		
		<form action="${pageContext.request.contextPath}/saveCliente" method="post">

				<div class="col-md-4 ">
					<font><b>Nome: </b></font><br>
				    <input type="text" class="form-control" name="nome" required="required"> 
				</div>
 
				<div class="col-md-2 ">
					<font><b>RG: </b></font><br> 
					<input type="text" maxlength="9"  class="form-control" name="rg" required="required">
				</div>

				<div class="col-md-2 ">
					<font><b>CPF: </b></font><br> <input type="text" required="required" maxlength="11"	class="form-control" name="cpf">
				</div>
 
				<div class="col-md-2 ">
					<font><b>Data Nacimento: </b></font><br>
					<input type="text" required="required" maxlength="8" class="form-control" name="dtNasc">
				</div>
				
				<div class="col-md-2">
					<font><b>Data 1ª CNH: </b></font><br> 
					<input type="text" required="required" class="form-control" name="dtPrimeiracnh">
				</div>
				
				<div class="col-md-2">
					<font><b>Telefone: </b></font><br> 
					<input type="text" required="required" class="form-control" name="telefone">
				</div>
				
				<div class="col-md-2 ">
					<font><b>Email: </b></font><br> 
					<input type="text" required="required"	class="form-control" name="email">
				</div>
				
				<div class="col-md-2 ">
					<font><b>Num CNH: </b></font><br> 
					<input type="text" required="required" class="form-control" name="numCnh">
				</div>
				
				<div class="col-md-2 ">
					<font><b>Estado Emissor: </b></font><br> 
					<input type="text" required="required" class="form-control" name="estadoEmissor">
				</div>
				
				<div class="col-md-2 ">
					<font><b>Validade Cnh: </b></font><br> 
					<input type="text" required="required" class="form-control" name="validadeCnh">
				</div>
				
				<div class="col-md-1 ">
					<font><b>Sexo: </b></font><br>
					<input type="text" required="required"	class="form-control" name="sexo">
				</div>
				
				<br><br><br><br><br>
				<hr>
				
				<div class="col-md-1">	
					<button type="submit" class="btn btn-default">
						<span class="glyphicon glyphicon-send" aria-hidden="true"></span> Salvar
					</button>
				</div>
				<div class="col-md-2">
					<a class="btn btn-default"
					   href="${pageContext.request.contextPath}/">
						<span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
						Cancelar
					</a>
				</div>
				

			</form>
	
	</div>
    
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="${pageContext.request.contextPath}/resources/bootstrap/js/bootstrap.min.js"></script>
  </body>
</html>
