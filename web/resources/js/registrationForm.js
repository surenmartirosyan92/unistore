
var userRegitrationForm = function(){
//	

}


userRegitrationForm.prototype= {
		
	init:function(){
		
		
		return this.getElement();
	},		
	submit: function(){
		var user ={
			//"userType":$("#userType option:selected").val(), never mind
			"userName": $("#fullName").val(),
			"email": $("#email").val(),
			"password": $("#password1").val(),
			"repeatedPassword" : $("#password2").val()
		}

		 if(this.validate(user)){
			// save this user
			 function successCallback(response) {
					alert("sax normala")// 
				}
			 this.ajaxJSONPost("/register","POST",user, successCallback);// to utils
		 }else{
			console.log("cannot save");
		 }

},

validate : function(user){

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
},

ajaxJSONPost : function(url,requestMethod,jsondata, callback){
	sendAjaxRequest(url,requestMethod,'application/json',{data:JSON.stringify(jsondata)},callback);
},

	/**
	user.login
	user.password
	*/
	request_Login:function(userJson){
		var container = new Container();
		container.initialize();
		if(container.login_for(userJson)){
			var user = new User();
			user.setName(userJson.login);
			var pageView = new MainPageView();
			pageView.setUser(user);
			pageView.appendListElements();	
		}
	},

	getElement: function(){
		var element = '<div id="container"></div>'
			//
		return element;	
	}
}

var UserRegitrationForm = new userRegitrationForm();

