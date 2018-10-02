$(document).ready(function(){
            
        $("#registrar").click( function(){
            event.preventDefault();
                $.ajax({
                     type: "get",
                     url: "index_servlet", 
                     data: $("#registrarform").serialize(),
                    success: function(msg){
                         alert(msg);
                    }
                });
           });
    
});


