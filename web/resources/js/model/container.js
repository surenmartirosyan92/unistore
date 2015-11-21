function Container(){

	this.itemContainer = null;

}
Container.prototype = {
	
	initialize : function(){
	//demo this must load from db as json
	this.itemContainer = {
		"items":[
		{
		"item":{"storeId":"12123","additionalInfo":"-25 for all Products!!","categoryId":"sdsds2","itemPicture":"http://g03.a.alicdn.com/wsphoto/v2/1266235714_1/%D0%91%D0%B5%D1%81%D0%BF%D0%BB%D0%B0%D1%82%D0%BD%D0%B0%D1%8F-%D0%B4%D0%BE%D1%81%D1%82%D0%B0%D0%B2%D0%BA%D0%B0-2014-topsnew-%D0%B2%D0%B5%D1%81%D0%BD%D0%BE%D0%B9-%D0%BC%D1%83%D0%B6%D1%81%D0%BA%D0%BE%D0%B9-%D0%BF%D0%BB%D1%8E%D1%88%D0%B5%D0%B2%D1%8B%D0%B5-%D1%82%D0%BE%D0%BB%D1%81%D1%82%D1%8B%D0%B9-%D1%82%D0%B5%D0%BF%D0%BB%D1%8B%D0%B9-%D1%81%D0%B2%D0%B8%D1%82%D0%B5%D1%80-%D0%9A%D0%BE%D1%80%D0%B5%D1%8F-%D1%81%D0%BB%D1%83%D1%87%D0%B0%D0%B9%D0%BD%D1%8B%D0%B9-%D1%81%D0%B0%D0%BC%D0%BE%D1%81%D0%BE%D0%B2%D0%B5%D1%80%D1%88%D0%B5%D0%BD%D1%81%D1%82%D0%B2%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5-%D1%87%D0%B5%D0%BB%D0%BE%D0%B2%D0%B5%D0%BA-%D1%81%D0%B2%D0%B8%D1%82%D0%B5%D1%80-7colours.jpg_350x350.jpg"}
		},
		{
		"item":{"storeId":"d356","additionalInfo":"new winter collection","categoryId":"sdsds2","itemPicture":"http://gtms03.alicdn.com/tps/i3/TB145CnGpXXXXcAXVXXmxYvZVXX-320-180.jpg"}
		},
		{
		"item":{"storeId":"Mrt3","additionalInfo":"-10%","categoryId":"sdsds2","itemPicture":"http://gtms04.alicdn.com/tps/i4/TB1jYKYGpXXXXcVXVXXMNtd_pXX-236-235.jpg"}
		},
		{
		"item":{"storeId":"12er","additionalInfo":"winter/spring collection ","categoryId":"sdsds2","itemPicture":"http://gtms03.alicdn.com/tps/i3/TB1QWJiGpXXXXcuaXXXSutbFXXX.jpg"}
		},
		{
		"item":{"storeId":"vd45","additionalInfo":"new store","categoryId":"sdsds2","itemPicture":"http://gtms01.alicdn.com/tps/i1/TB1UBeWGpXXXXaQXVXXtD4t3FXX-296-296.jpg"}
		},
		{
		"item":{"storeId":"vd45","additionalInfo":"areq eli ara","categoryId":"sdsds2","itemPicture":"http://gtms04.alicdn.com/tps/i4/TB1geFtGXXXXXasapXXwu0bFXXX.png"}
		},
		{
		"item":{"storeId":"vd45","additionalInfo":"10 - 25% ","categoryId":"sdsds2","itemPicture":"http://gtms03.alicdn.com/tps/i3/TB1QWJiGpXXXXcuaXXXSutbFXXX.jpg"}
		},
		{
		"item":{"storeId":"vd45","additionalInfo":"new prices for all collection","categoryId":"sdsds2","itemPicture":"http://gtms01.alicdn.com/tps/i1/TB1rYjjGpXXXXa7XVXXwu0bFXXX.png"}
		}
		]
	
	};
	},

	getItems : function(){
		var items = [];
		for(var i = 0;i<this.itemContainer.items.length;i++){
			var item = new Item();
			item.setName("no name");
			item.setStoreId(this.itemContainer.items[i].item.storeId);
			item.setCategoryId(this.itemContainer.items[i].item.categoryId);
			item.setAdditionalInfo(this.itemContainer.items[i].item.additionalInfo);
			var media = new MediaInformation();
			media.setAvatarPicture(this.itemContainer.items[i].item.itemPicture);
			item.setMedia(media);//only pivture for now
			items.push(item);
		}
		
		//must be some by category or by store ordering
		return items;
	},
	
	fromJson : function(){
		//
	}


}