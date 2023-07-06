class Song{
	String title;
	String artist;
	int year;
	String country;
	
	
	Song(String title,String artist,int year,String country){
		this.artist = artist;
		this.country = country;
		this.title = title;
		this.year = year;
	}
	void show() {
		System.out.println(year+"년 "+country+" 국적의 "+artist+"가 부른 "+title);
	}
	
}

public class Abba {

	public static void main(String[] args) {
		Song singer = new Song("DancingQueen","ABBA",1978,"Sweden");
		singer.show();
		
		singer = new Song("Let it be,Hey jude","비틀즈",1970,"England");
		singer.show();

	}

}
