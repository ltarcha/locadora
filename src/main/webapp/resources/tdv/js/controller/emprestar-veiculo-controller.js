var SERVER_APP = '/locadora'

$(function(){
	
	var veiculosList = [];
	
	$.getJSON('/locadora/get/veiculos').success(function(data) {
		veiculosList = data;
		console.log(data);
		$.each(data, function(i, v) {
			var body = "<tr>";
			//		body    += 		"<td><input type=""checkbox"" name="""+ v.id + "></td>";
					body    += 		"<td><input type='checkbox' class='veiculos-checkbox' name='"+v.id +"'></td>";
					body    += 		"<td>"+v.id+"</td>";
					body    += 		"<td>"+v.placa+"</td>";
					body    += 		"<td>"+v.fabricante+"</td>";
					body    += 		"<td>"+v.modelo+"</td>";
					body    += 		"<td>"+v.grupo+"</td>";
					body    += 		"<td>"+v.cidade+"</td>";
					body    += "</tr>";
			$('#idbodyVeiculos').append(body);
		});
	}).fail(function(error) {
		alert(error.responseText);
	});
	
$("#txtPlaca").keyup(function(){
		
		var texto = $(this).val().toLowerCase();
		
		$('#idbodyVeiculos').empty();
		$.each(veiculosList, function(i, v) {
			
			if(v.placa.toLowerCase().indexOf(texto) > -1) {
				var body = "<tr>";
		//		body    += 		"<td><input type=""checkbox"" name="""+ v.id + "></td>";
				body    += 		"<td><input type='checkbox' class='veiculos-checkbox' name='"+v.id +"'></td>";
				body    += 		"<td>"+v.id+"</td>";
				body    += 		"<td>"+v.placa+"</td>";
				body    += 		"<td>"+v.fabricante+"</td>";
				body    += 		"<td>"+v.modelo+"</td>";
				body    += 		"<td>"+v.grupo+"</td>";
				body    += 		"<td>"+v.cidade+"</td>";
				body    += "</tr>";
				$('#idbodyVeiculos').append(body);
			}
		});

	});

$("#txtModelo").keyup(function(){
	
	var texto = $(this).val().toLowerCase();
	
	$('#idbodyVeiculos').empty();
	$.each(veiculosList, function(i, v) {
		if(v.modelo.toLowerCase().indexOf(texto) > -1) {
			var body = "<tr>";
	//		body    += 		"<td><input type=""checkbox"" name="""+ v.id + "></td>";
			body    += 		"<td><input type='checkbox' class='veiculos-checkbox' name='"+v.id +"'></td>";
			body    += 		"<td>"+v.id+"</td>";
			body    += 		"<td>"+v.placa+"</td>";
			body    += 		"<td>"+v.fabricante+"</td>";
			body    += 		"<td>"+v.modelo+"</td>";
			body    += 		"<td>"+v.grupo+"</td>";
			body    += 		"<td>"+v.cidade+"</td>";
			body    += "</tr>";
			$('#idbodyVeiculos').append(body);
		}
	});

});

//$("#txtTarifa").keyup(function(){
//	
//	var texto = $(this).val();
//	
//	$('#idbodyVeiculos').empty();
//	$.each(veiculosList, function(i, v) {
//		if(v.tarifa.indexOf(texto) > -1) {
//			var body = "<tr>";
//	//		body    += 		"<td><input type=""checkbox"" name="""+ v.id + "></td>";
//			body    += 		"<td>"+v.id+"</td>";
//			body    += 		"<td>"+v.id+"</td>";
//			body    += 		"<td>"+v.placa+"</td>";
//			body    += 		"<td>"+v.fabricante+"</td>";
//			body    += 		"<td>"+v.modelo+"</td>";
//			body    += 		"<td>"+v.grupo+"</td>";
//			body    += 		"<td>"+v.cidade+"</td>";
//			body    += "</tr>";
//			$('#idbodyVeiculos').append(body);
//		}
//	});
//
//});

$('#btn_alugar').click(function(e) {
	var i = 0;
	var codigoVeiculo = "";
	$('input[type=checkbox].veiculos-checkbox').each(function () {
		if (this.checked) { 
			i++;
			codigoVeiculo = $(this).attr('name');
		}
	});
	if (i == 1) {
		window.location.href = SERVER_APP+'/emprestar/dados/'+codigoVeiculo;
	} else {
		alert('Selecione um Veiculo!');
	}
});

});

