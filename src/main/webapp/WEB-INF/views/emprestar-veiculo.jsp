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
		<table class="table table-hover table-bordered table-condensed table-striped " id="table">
			<thead>
				<tr> 
					<th></th> <th>ID veiculo</th> <th>Placa</th> <th>Fabricante</th>  <th>Modelo</th> <th>Grupo</th> <th>Cidade</th> 
				</tr>
			</thead>
			<tbody id="idbodyVeiculos">
<%-- 				<c:forEach var="i" items="${lista}"> --%>
<%-- 					<tr id="${i.id}"> --%>
<%-- 						<td><input type="checkbox" class="chamados-checkbox" name="${i.id}"></td> --%>
<%-- 						<td>${i.id}</td> --%>
<%-- 						<td>${i.placa}</td> --%>
<%-- 						<td>${i.fabricante}</td> --%>
<%-- 						<td>${i.modelo}</td> --%>
<%-- 						<td>${i.grupo}</td> --%>
<%-- 						<td>${i.cidade}</td> --%>
<!-- 					</tr> -->
<%-- 				</c:forEach> --%>
			</tbody>
		</table>
		
		<div>
			<div class="col-md-2 ">
				<font><b>Placa: </b></font><br>
				<input type="text" id="txtPlaca" required="required" maxlength="8" class="form-control" name="placa">
			</div>
			
			<div class="col-md-2 ">
				<font><b>Modelo: </b></font><br>
				<input type="text" id="txtModelo" required="required" maxlength="8" class="form-control" name="modelo">
			</div>
			
			<div class="col-md-2 ">
				<font><b>Tarifa: </b></font><br>
				<input type="text" id="txtTarifa" required="required" maxlength="8" class="form-control" name="tarifa">
			</div>
			
			<div class="pull-right">
				<div class="col-md-5">	
					<br>
					<button type="submit" class="btn btn-default" id="btn_alugar">
						<span class="glyphicon glyphicon-send" aria-hidden="true"></span> Alugar      
					</button>
				</div>
				
				<div class="col-md-1">
					<br>
					<a class="btn btn-default" href="${pageContext.request.contextPath}/">
						<span class="glyphicon glyphicon-remove" aria-hidden="true"></span>	Cancelar
					</a>
			     </div>
			</div>
		</div>
		
    </div>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="${pageContext.request.contextPath}/resources/bootstrap/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/tdv/js/controller/emprestar-veiculo-controller.js"></script>
  </body>
</html>
