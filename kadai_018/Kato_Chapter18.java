package kadai_018;

abstract public class Kato_Chapter18 {
	
	public String = familyName;//姓
	public String = givenName;//名
	public String = address;
	
	this.familyName = "加藤";
	this.givenName = setGivenName;
	this.address = "東京都中野区〇×";
	
			
	
	public void commonIntroduce() {
		System.out.println("名前は"+ familyName + setGivenName +"です");
		System.out.println("住所は" + address +"です");
		
	}
	
	abstract public void eachIntroduce() ;
	
	public void execIntroduce () {
		commonIntroduce();
		eachIntroduce();
		
	}

}

