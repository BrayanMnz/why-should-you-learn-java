public enum TalkLevel{
	BEGINNER,
	INTERMEDIATE,
	PROFESSIONAL,
}

public enum TShirtSize{
	XS,
	S,
	M,
	L,
	XL
}

public record BarcampTalk(String title, String topic, TalkLevel level, Speaker speaker){}

public record Speaker(String name, String shortBio, TShirtSize tshirtSize){}





void main(){

	var speaker = new Speaker("Brayan M.", "Java developer that loves to spread the knowledge", TShirtSize.M);

	var talk = new BarcampTalk("Why Should you Learn Java", "JAVA", TalkLevel.BEGINNER, speaker);

	System.out.println(String.format(" TALK INFORMATION : \n Title - %s \n Topic - %s \n Talk Level - %s \n \n", 
				talk.title(), talk.topic(), talk.level()));

	System.out.println(String.format(" SPEAKER INFORMATION : \n Name - %s \n Biography - %s \n Tshirt size - %s", 
				talk.speaker().name(), talk.speaker().shortBio(), talk.speaker().tshirtSize()));
}



