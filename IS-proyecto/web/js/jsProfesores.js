 $.ajax({
        type: "get",
        url: "profesores_servlet",
       success: function(msg){
           $("#agregar").html(msg);
       }
   });
   
$(document).ready(function(){

	$("#btnregistrar").click(function(){
		$( location ).attr("href", "registrar.html");
	});

	$(".visualizar").click(function(){
		var id = $(this).attr('iduser');
		$( location ).attr("href", "visualizar.html?id="+id);
	});

	$(".editar").click(function(){
		var id = $(this).attr('iduser');
		$( location ).attr("href", "editar.html?id="+id);
	});

	$(".eliminar").click(function(){
		var id = $(this).attr('iduser');
		$('#modal1').modal();
    	$('#modal1').modal('open');
		$("#eliminarid").click(function(){
			alert("mandar a eliminar "+id);
			location.reload();
		});
	});

});