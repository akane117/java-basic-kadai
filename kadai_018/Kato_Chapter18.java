package kadai_018;

abstract public class Kato_Chapter18 {
	
	public String = familyName;//姓
	public String = givenName;//名
	public String = address;
	
	this.familyName = familyName;
	this.givenName = givenName;
	this.address = address;
	
			
	
	public void commonIntoroduce() {
		System.out.println("名前は"+ familyName + givenName +"です");
		System.out.println("住所は" + address +"です");
		
	}
	
	abstract public void eachIntroduce() ;
	
	public void execIntroduce () {
		commonIntroduce();
		eachIntroduce();
		
	}

}
