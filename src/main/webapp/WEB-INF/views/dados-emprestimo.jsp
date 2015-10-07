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
		
			<form action="${pageContext.request.contextPath}/saveEmprestimo" method="post">

				<div class="col-md-2 ">
					<font><b>ID veiculo: </b></font><br>
				    <input type="text" class="form-control" name="idVeiculo" required="required" value="${idveiculo}" disabled="disabled"> 
				</div>
 
				<div class="col-md-2 ">
					<font><b>ID Cliente: </b></font><br> 
					<input type="text" maxlength="9"  class="form-control" name="idCliente" required="required">
				</div>

				<div class="col-md-3 ">
					<font><b>Data Emprestimo: </b></font><br> <input type="text" required="required" maxlength="11"	class="form-control" name="data">
				</div>
 
				<div class="col-md-3 ">
					<font><b>Data Devolução: </b></font><br>
					<input type="text" required="required" maxlength="8" class="form-control" name="dataDevolucao">
				</div>
				
				<div class="col-md-2">
					<font><b>Data : </b></font><br> 
					<input type="text" required="required" class="form-control" name="data">
				</div>
				
				<div class="col-md-2">
					<font><b>Motorista CPF: </b></font><br> 
					<input type="text" required="required" class="form-control" name="cpf">
				</div>
				
				<div class="col-md-1 ">
					<font><b>Email: </b></font><br> 
					<input type="text" required="required"	class="form-control" name="email">
				</div>
				
				<div class="col-md-3 ">
					<font><b>Local Emprestimo: </b></font><br> 
					<input type="text" required="required" class="form-control" name="localEmp">
				</div>
				
				<div class="col-md-3 ">
					<font><b>Local Devolução: </b></font><br> 
					<input type="text" required="required" class="form-control" name="localDev">
				</div>
				
				<div class="col-md-2 ">
					<font><b>Tarifa: </b></font><br> 
					<input type="text" required="required" class="form-control" name="tarifa">
				</div>
				
				<div class="col-md-1 ">
					<font><b>Pagamento: </b></font><br>
					<input type="text" required="required"	class="form-control" name="formaPagamento">
				</div>
				
				<br><br><br><br><br>
				<hr>
				
				<div class="pull-right">
					<div class="col-md-8">	
						<button type="submit" class="btn btn-default">
							<span class="glyphicon glyphicon-send" aria-hidden="true"></span> Finalizar          
						</button>
					</div>
					<div class="col-md-2">
						<a class="btn btn-default"
						   href="${pageContext.request.contextPath}/">
							<span class="glyphicon glyphicon-remove" aria-hidden="true"></span> Cancelar
						</a>
					</div>
				</div>
				
			</form>
	
	</div>
    
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="${pageContext.request.contextPath}/resources/bootstrap/js/bootstrap.min.js"></script>
  </body>
</html>
