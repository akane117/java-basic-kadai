package kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18{

	
	public KatoTaro_Chapter18 () {
		familiName = "加藤";
		givenName = "一郎";
		address = "東京都中野区〇×";
	}
	
	public void setGivenName (String name) {
		this.givenName = name;
	}
	
	void eachIntroduce() {
		System.out.println("好きな食べ物はリンゴです");
	}
}


