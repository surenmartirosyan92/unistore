function submmit(){
	var user ={
		//"userType":$("#userType option:selected").val(), never mind
		"fullName": $("#fullName").val(),
		"email": $("#email").val(),
		"password": $("#password2").val(),
		"repeatedPassword" : $("#password2").val()
	}

	if(validate(user)){
	// save this user
		function successCallback(response) {
			window.location.href = 'https://www.youtube.com/watch?v=CNDJiUDVLMg';// nya, es tox@ pti rad arvi aber :D
		}
			ajaxJSONPost('MyServlet', user, successCallback);
	 }else{
		console.log("cannot save");
	 }
}

function validate(user){

	var userType = user.userType;
	var fullName = user.fullName;
	var email = user.email;
	var password = user.password;
	var repeatedPassword = user.repeatedPassword;
	
	console.log(fullName);
	console.log(email);
	console.log(password);
	console.log(repeatedPassword);
	var isRegistrationAllowed = true;
	if(fullName === ""){
		alert("name is requid field")
		isRegistrationAllowed = false;
	}
	
	if(password !==repeatedPassword ){
		isRegistrationAllowed = false;
		alert("password fields are unequal");
	}else if(password.length < 6){
		isRegistrationAllowed = false;
		alert("password is too small , it must be at least 6 symbols");
	}
	var re = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    if(!re.test(email)){
		isRegistrationAllowed = false;
		alert("mail is invalid");
	}
  return isRegistrationAllowed;
}

function ajaxJSONPost(url, jsondata, callback){
	$.ajax({
		url: url,
		type: 'post',
		data : {
			data1 : JSON.stringify(jsondata)
		},
		dataType: "text",
		success: callback,
		error: function(){
			alert("error message");
		}
	});
}



