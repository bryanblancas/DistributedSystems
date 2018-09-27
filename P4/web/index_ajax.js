$(document).ready(function(){
      
    $(".afterlogin").hide();
    
     $('#log').click(function (){
        event.preventDefault();
        $.ajax({
            type: "get",
            url: "registrarAjax", 
            data: $("#registro").serialize(),
            success: function(msg){    
                $("#b").val(msg);
                $(".afterlogin").show();
                 $(".login").hide();
            }
        });
    });
       
    $('#carta').click(function (){
        event.preventDefault();
        $.ajax({
            type: "get",
            url: "indexAjax", 
            data: $("#registro").serialize(),
            success: function(msg){   
                if(msg==="popo"){
                    alert("juego acabado") ;
                    location.reload();
                }
                else  
                    $("#img").html(msg);
            }
        });
    });
 
});
