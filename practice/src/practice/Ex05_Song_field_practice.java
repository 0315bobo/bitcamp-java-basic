package practice;
//곡명, 가수, 앨범 이름, 노래가 속한 앨범 트랙 번호를 나타내보자

public class Ex05_Song_field_practice {
	
	String songName;
	String singer;
	String albumName;
	int trackNumber;
		

	public static void main(String[] args) {
		
		Ex05_Song_field_practice s = new Ex05_Song_field_practice();
		s.songName = "Mad Love";
		s.singer ="Sean Paul";
		s.albumName ="Mad Love The Prequel";
		s.trackNumber = 3;
		
		
		System.out.println("[songName="+s.songName+
				           ", singer="+s.singer+
				            ", albumName="+s.albumName+
				            ", trackNumer = "+s.trackNumber+"]" );

	}

}
