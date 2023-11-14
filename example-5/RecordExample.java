
enum TalkLevel {
    BEGINNER,
    INTERMEDIATE,
    PROFESSIONAL,
}

enum TShirtSize {
    XS,
    S,
    M,
    L,
    XL
}

record BarcampTalk(String title, String topic, TalkLevel level, Speaker speaker) {

}

record Speaker(String name, String shortBio, TShirtSize tshirtSize) {

}

public class RecordExample {

    public static void main(String[] args) {

        var speaker = new Speaker("Brayan M.", "Java developer that loves to spread the knowledge", TShirtSize.M);

        var talk = new BarcampTalk("Why Should you Learn Java", "JAVA", TalkLevel.BEGINNER, speaker);

        System.out.println(String.format(" TALK INFORMATION : \n Title - %s \n Topic - %s \n Talk Level - %s \n \n",
                talk.title(), talk.topic(), talk.level()));

        System.out.println(String.format(" SPEAKER INFORMATION : \n Name - %s \n Biography - %s \n Tshirt size - %s",
                talk.speaker().name(), talk.speaker().shortBio(), talk.speaker().tshirtSize()));
    }
}
