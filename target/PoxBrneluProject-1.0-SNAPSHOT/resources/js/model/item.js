function Item(){
	this.name = undefined,
	this.itemStoreId = undefined;
	this.itemPercent = undefined;
	this.itemCategory = undefined;
	this.mediaInfo = undefined;
	this.additionalInfo = undefined;//text field from store to this item
}

Item.prototype = {

	
	setMedia: function(media){
		this.mediaInfo = media
	},
	
	getMedia: function(){
		return this.mediaInfo;
	},
	
	getName:function(){
		return this.name;
	},
	
	setName:function(itemName){
		this.name = itemName;
	},
	
	getStoreID:function(){
		return this.itemStoreId;
	},
	
	setStoreId:function(storeID){
		this.itemStoreId = storeID;
	},
	
	setCategoryId:function(id){
		this.categoryId = id;
	},
	
	getCategoryId:function(){
		return this.categoryId;
	},
	
	// zexch i tokos
	setPercent:function(percent){
		this.itemPercent = percent;
	},
	
	setAdditionalInfo : function(info){
		this.additionalInfo = info;
	},
	
	getAdditionalInfo:function(){
		return this.additionalInfo;
	}
		
}