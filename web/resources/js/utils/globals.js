
/**
 * utility functions, global modules
 * @author Karlen Mkrthcyan
 *
 */
var serverPath = "http://localhost:8080/"
var MODULES = {
	SIGN_IN:'sign_in',
	USER_PAGE:"user_page"
}

function sendAjaxRequest(url,requestMethod,dataType,data,successCalback,errorCallback){
	$.ajax({
	    url: url,
	    type: requestMethod,
	    data: data,
	    dataType: dataType,
	    success: function (xhr, ajaxOptions, thrownError) {
	    	if(successCalback){
	    		successCalback(xhr);
	    	}
	    },
	    error: function (xhr, ajaxOptions, thrownError) {
	    		successCalback(xhr);
	    		//errorCallback(xhr);
	    	}
	});
}

function getCookie(key) {
	  var matches = document.cookie.match(new RegExp(
	    "(?:^|; )" + key.replace(/([\.$?*|{}\(\)\[\]\\\/\+^])/g, '\\$1') + "=([^;]*)"
	  ));
	  return matches ? decodeURIComponent(matches[1]) : undefined;
	}

function deleteCookie(name) {
	  document.cookie = name + "=" + "; expires=Thu, 01 Jan 1970 00:00:01 GMT";
}

function writeToCookie(key, value){
	document.cookie = (key + "=" + value);
}