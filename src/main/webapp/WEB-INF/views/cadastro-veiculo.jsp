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
		
		<form action="${pageContext.request.contextPath}/saveVeiculo" method="post">

				<div class="col-md-2 ">
					<font><b>Placa: </b></font><br>
				    <input type="text" class="form-control" name="placa" required="required" maxlength="7"> 
				</div>
 
				<div class="col-md-2 ">
					<font><b>Grupo:  </b></font><br> 
					<input type="text" maxlength="9"  class="form-control" name="grupo" required="required">
				</div>

				<div class="col-md-2 ">
					<font><b>Acessorios: </b></font><br> <input type="text" required="required" class="form-control" name="acessorios">
				</div>
 
				<div class="col-md-2 ">
					<font><b>Chassi: </b></font><br>
					<input type="text" required="required" class="form-control" name="chassi">
				</div>
				
				<div class="col-md-2">
					<font><b>Cidade </b></font><br> 
					<input type="text" required="required" class="form-control" name="cidade">
				</div>
				
				<div class="col-md-2">
					<font><b>KM: </b></font><br> 
					<input type="text" required="required" class="form-control" name="km">
				</div>
				
				<div class="col-md-2 ">
					<font><b>Estado: </b></font><br> 
					<input type="text" required="required"	class="form-control" name="estado">
				</div>
				
				<div class="col-md-2 ">
					<font><b>Modelo: </b></font><br> 
					<input type="text" required="required" class="form-control" name="modelo">
				</div>
				
				<div class="col-md-2 ">
					<font><b>Fabricante: </b></font><br> 
					<input type="text" required="required" class="form-control" name="fabricante">
				</div>
				
				<div class="col-md-2 ">
					<font><b>Tarifa Livre R$: </b></font><br> 
					<input type="text" required="required" class="form-control" name="tarifaLivre">
				</div>
				
				<div class="col-md-2 ">
					<font><b>Tarifa Controlada R$: </b></font><br>
					<input type="text" required="required"	class="form-control" name="tarifaControlada">
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
