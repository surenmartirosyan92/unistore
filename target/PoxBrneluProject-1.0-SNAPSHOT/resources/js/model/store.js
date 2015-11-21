function Store(){
	this.name = undefined,
	this.media = undefined,//avatar picture
	this.storeId = undefined;
	this.itemList = [];//all items of this store
	this.email = undefined;
	this.moblieNumber = undefined;
	this.deliverySupport = true; // if this store give its delivery function to website , then this parameter is true 
	this.addresses = [] // there may be few addresses for 1 store 
	this.description = undefined; // short description of product ans service of store
}

Store.prototype = {

	
}