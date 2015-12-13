
var userRegitrationForm = function(){
//	

}

/**
 * registration for manager
 * @author Karlen Mkrthcyan
 *
 */
userRegitrationForm.prototype= {
		
	init:function(){
		
		
		return this.getElement();
	},		
	register: function(){
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
					alert("register called")// 
				}
			 this.ajaxJSONPost("register","POST",user, successCallback);// to utils
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
		var element = '';
			//
		
		element += '<title>Login,Register</title>';
		    element += '<head>';
		    element +=  '<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet">';
		    element +=	'</head>';
		    element +=	'<body>';
		    element +=	'<div class="container">';
	
		    element += '<div class="row centered-form">';
		    element +=  '<div class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">';
		    element +=  '<div class="panel panel-default">';
		    element +=	    '<div class="panel-heading">';
		    element +=     '<h3 class="panel-title">Unistore</h3>';
		    element +=    '</div>';
		    element +=  '<div class="panel-body">';
		    element +=        '<div class="form-group">';
		    element +=	         '<input type="text" name="username" id="fullName" class="form-control input-sm glowing-border" placeholder="User Name">';
		    element +=		        '</div>';
	
		    element +=		      '<div class="form-group">';
		    element +=	       '<input type="email" name="email" id="email" class="form-control input-sm glowing border" placeholder="Email Address">';
		    element +=		      '</div>';
	
		    element +=	      '<div class="form-group">';
		    element +=	       '<input type="password" name="password" id="password1" class="form-control input-sm glowing border" placeholder="Password">';
		    element +=	      '</div>';
		    element +=	      '<div class="form-group">';
		    element +=		       '<input type="password" name="repeate_password" id="password2" class="form-control input-sm glowing border" placeholder="Repeate Password">';
		    element +=	      '</div>';
		    element +=	      '<input type="button" value="Register" onclick="UserRegitrationForm.register();" class="btn btn-info btn-block">';
		    element +=    '</div>';
		    element +=	  '</div>';
		    element +=	  '</div>';
		    element +=	 '</div>';
		    element +=	'</div>';
		    element +=		'</body>';
		
	   return element;	
	}
}

var UserRegitrationForm = new userRegitrationForm();

