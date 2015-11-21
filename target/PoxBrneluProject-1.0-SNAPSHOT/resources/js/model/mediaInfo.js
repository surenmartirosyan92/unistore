function MediaInformation(){
	this.avatarPictureUrl = undefined;
	this.model3D = [];//for3d modelling
}

MediaInformation.prototype = {

	initialize : function(){
		//
	},
	
	setAvatarPicture : function(pictureUrl){
		this.avatarPictureUrl = pictureUrl;
	},
	
	getAvatarPicture : function(){
		return this.avatarPictureUrl;
	},
	//comm needed
	set3dModel : function(model3d){
		this.model3D = model3d;	
	},
	
	//comm needed
	get3dModel : function(){
		return this.model3d;
	}
}