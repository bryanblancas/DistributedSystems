$(document).ready(function(){

    $("#btnlogin").click(function(){
           event.preventDefault();
            
            $.ajax({
                 type: "get",
                 url: "index_servlet", 
                data: $("#login").serialize(),
                success: function(msg){
                   if(msg.includes("exito") == true){
                         $( location ).attr("href", "profesores.html");
                    }
                    $('#modal1').modal();
                    $("#mensajestatus").text(msg);
                    $('#modal1').modal('open');
                }
            });
           
    });

});