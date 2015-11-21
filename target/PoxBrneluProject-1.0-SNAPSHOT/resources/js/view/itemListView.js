function ItemListView(){

	this.items = undefined;
}

ItemListView.prototype = {
	
	get_element:function(){
	if(!this.items){	
	  var container = new Container();
	  container.initialize();
	  this.items = container.getItems();
	}
	
	var elements = [];
	for(var i = 0;i<this.items.length;i++){
		var div = document.createElement("div");
		var divInfoLabel = document.createElement("div");
		var link = document.createElement("a");
		var avatarPicture = document.createElement("img");
		$(div).addClass("divCell");// need to solve
		$(divInfoLabel).addClass("div_Info_Label");// need to solve
		$(link).addClass("fontSize14");// need to solve
		$(link).text(this.items[i].getAdditionalInfo());// need to solve .attr()
		$(link).attr('href',"https://www.google.ru/?gws_rd=ssl");// need to redirct to user page who added this item
		$(avatarPicture).attr("src" , this.items[i].getMedia().getAvatarPicture());
		$(avatarPicture).addClass("list_Image_Size");
		$(div).append(avatarPicture);
		$(divInfoLabel).append(link);
		$(div).append(divInfoLabel);
		elements.push(div);
	}
	
	return elements;
	}
}

