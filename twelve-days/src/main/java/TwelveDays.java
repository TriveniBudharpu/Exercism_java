public class TwelveDays {
    private final String[] dayWiseLyrics={
            "a Partridge in a Pear Tree.\n",
            "two Turtle Doves, and a Partridge in a Pear Tree.\n",
            "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n",
            "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n",
            "five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n",
            "six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n",
            "seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n",
            "eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n",
            "nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n",
            "ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n",
            "eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n",
            "twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n"
    };
    private final String lyricsBeforeToBeAdded=" day of Christmas my true love gave to me: ";
    private String[] days={
            "first","second","third","fourth","fifth","sixth",
            "seventh","eighth","ninth","tenth","eleventh","twelfth"
    };
    String verse(int verseNumber) {
        String lyricsOnThisDay="On the "+days[verseNumber-1]+lyricsBeforeToBeAdded+dayWiseLyrics[verseNumber-1];
        return lyricsOnThisDay;
    }

    String verses(int startVerse, int endVerse) {
        String lyricsOfThisDays="";
        for (int index = startVerse; index <endVerse ; index++) {
            lyricsOfThisDays=lyricsOfThisDays+verse(index)+"\n";
        }
        lyricsOfThisDays+=verse(endVerse);
        return  lyricsOfThisDays;
    }

    String sing() {
        String song=verses(1,12);
        return song;
    }
}