/**
 * Created by garik on 12/12/2015.
 */
$(document).ready(function() {
	
	
    console.log("aaaaaaaaa");
    
    $("#sign_up").on('click', function(){
        $("html").html(UserRegitrationForm.getElement());
    });
    
    
});