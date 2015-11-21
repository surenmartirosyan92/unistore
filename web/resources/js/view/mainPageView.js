function MainPageView(){
	this.controler = undefined;
	this.element = $("#item_Container_Class");
	this.itemListView = new ItemListView();
}

MainPageView.prototype = {
	
	initialize : function(){
	
	},
	
	appendListElements : function(){
		var itemCountPerRow = 4;// solve this
		var elements = this.itemListView.get_element();
		var divRowContainers = [];
		for(var i = 0;i<(elements.length)/itemCountPerRow;i++){
			var div = document.createElement("div");
			for(var j = i*itemCountPerRow;j<i*itemCountPerRow+itemCountPerRow;j++){
				$(div).append(elements[j]);
			}
			$(div).addClass("divRow");
			divRowContainers.push(div)
		}
		for(var i = 0;i<divRowContainers.length;i++){
			this.element.append(divRowContainers[i])
		}
	}
}

