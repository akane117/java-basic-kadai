package kadai_018;

public  abstract class Kato_Chapter18 {
	
	public String  familyName ="加藤";//姓
	public String  givenName = "";//名
	public String  address ="東京都中野区〇×";
	
	public void commonIntroduce() {
		System.out.println("名前は"+ familyName + givenName +"です");
		System.out.println("住所は" + address +"です");
	}
	
	public abstract  void eachIntroduce() ;
	
	public void execIntroduce () {
		commonIntroduce();
		eachIntroduce();
		
	}

}

