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
		<form action="${pageContext.request.contextPath}/saveDevolucao" method="post">
			<div class="row">
					<div class="col-md-2 ">
						<font><b>ID Emprestimo: </b></font><br>
					    <input type="text" class="form-control" name="idEmprestimo" required="required" maxlength="7"> 
					</div>
		
					<div class="col-md-2 ">
						<font><b>Data Devolução:  </b></font><br> 
						<input type="text" maxlength="9"  class="form-control" name="data" required="required">
					</div>
		
					<div class="col-md-2 ">
						<font><b>Local: </b></font><br> <input type="text" required="required" class="form-control" name="local">
					</div>
		
					<div class="col-md-2 ">
						<font><b>KM: </b></font><br>
						<input type="text" required="required" class="form-control" name="km">
					</div>
			</div>
			
			<br>
			
			<div class="row">
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
			</div>
		</form>		
		
		<hr>
		
		<h4>Multa/Adicionais</h4>
		
		<div style="width:100%; height:350px; overflow: auto;" class="table-responsive">
			<table class="table table-hover table-bordered table-condensed table-striped ">
			
				<thead>
					<tr> 
						<th>ID Viagem</th> <th>Tp Multa/Adicional</th> <th>Valor</th>
					</tr>
				</thead>
				
				<tbody>
					<c:forEach var="i" items="${lista}">
						<tr>
							<td>${i.id}</td>
							<td>${i.motivo}</td>
							<td>${i.valor}</td>
							
						</tr>	
					</c:forEach>
				</tbody>
				
			</table>
			<div class="col-md-1">	
				<button type="submit" class="btn btn-default">
					<span class="glyphicon glyphicon-send" aria-hidden="true"></span> Pagar
				</button>
			</div>
			<div class="col-md-2">
				<a class="btn btn-default"href="${pageContext.request.contextPath}/">
					<span class="glyphicon glyphicon-remove" aria-hidden="true"></span>	Cancelar
				</a>
			</div>
		</div>	
	</div>
    
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="${pageContext.request.contextPath}/resources/bootstrap/js/bootstrap.min.js"></script>
  </body>
</html>
