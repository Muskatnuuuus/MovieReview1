package at.fh.swengb.redjaian.moviereview

object MovieRepository {
    private val movies: List<Movie>

    init {
        val directorMiyzaki = Person("Hayao Miyazaki", "05.01.1941")
        val actorAnderson = Person("Gillian Leigh Anderson", "09.08.1968")
        val actorCrudup = Person("Billy Crudup", "08.07.1968")
        val actorChase = Person("Daveigh Elizabeth Chase", "24-07-1990")
        val actorMarsden = Person("Jason Christopher Marsden", "03.01.1975")
        val actorBale = Person("Christian Bale", "30.01.1974")
        val actorMortimer = Person("Emily Mortimer", "01.12.1971")
        val actorCyrus = Person("Noah Lindsey Cyrus", "08.01.2000")
        val actorJonas = Person("Frankie Jonas", "28.09.2000")
        movies = listOf(
            Movie("0",
                "Princess Mononoke",
                "1997",
                "In the 14th century, the harmony that humans, animals and gods have enjoyed begins to crumble. The protagonist, young Ashitaka - infected by an animal attack, seeks a cure from the deer-like god Shishigami. In his travels, he sees humans ravaging the earth, bringing down the wrath of wolf god Moro and his human companion Princess Mononoke. Hiskattempts to broker peace between her and the humans brings only conflict.",
                MovieGenre.DRAMA,
                directorMiyzaki,
                listOf( actorAnderson, actorCrudup ),
                mutableListOf()
            ),
            Movie("1",
                "Spirited Away",
                "2001",
                "In this animated feature by noted Japanese director Hayao Miyazaki, 10-year-old Chihiro (Rumi Hiiragi) and her parents (Takashi Naitô, Yasuko Sawaguchi) stumble upon a seemingly abandoned amusement park. After her mother and father are turned into giant pigs, Chihiro meets the mysterious Haku (Miyu Irino), who explains that the park is a resort for supernatural beings who need a break from their time spent in the earthly realm, and that she must work there to free herself and her parents.",
                MovieGenre.MYSTERY,
                directorMiyzaki,
                listOf( actorChase, actorMarsden ),
                mutableListOf()
            ),
            Movie("2",
                "Howl's Moving Castle",
                "2004",
                "Sophie (Emily Mortimer) has an uneventful life at her late father's hat shop, but all that changes when she befriends wizard Howl (Christian Bale), who lives in a magical flying castle. However, the evil Witch of Waste (Lauren Bacall) takes issue with their budding relationship and casts a spell on young Sophie, which ages her prematurely. Now Howl must use all his magical talents to battle the jealous hag and return Sophie to her former youth and beauty.",
                MovieGenre.DRAMA,
                directorMiyzaki,
                listOf( actorBale, actorMortimer ),
                mutableListOf()
            ),
            Movie("3",
                "Ponyo On The Cliff",
                "2008",
                "During a forbidden excursion to see the surface world, a goldfish princess encounters a human boy named Sosuke, who gives her the name Ponyo. Ponyo longs to become human, and as her friendship with Sosuke grows, she becomes more humanlike. Ponyo's father brings her back to their ocean kingdom, but so strong is Ponyo's wish to live on the surface that she breaks free, and in the process, spills a collection of magical elixirs that endanger Sosuke's village.",
                MovieGenre.DRAMA,
                directorMiyzaki,
                listOf( actorCyrus, actorJonas ),
                mutableListOf()
            ),
            Movie("4",
                "Princess Mononoke 2",
                "1997",
                "In the 14th century, the harmony that humans, animals and gods have enjoyed begins to crumble. The protagonist, young Ashitaka - infected by an animal attack, seeks a cure from the deer-like god Shishigami. In his travels, he sees humans ravaging the earth, bringing down the wrath of wolf god Moro and his human companion Princess Mononoke. Hiskattempts to broker peace between her and the humans brings only conflict.",
                MovieGenre.DRAMA,
                directorMiyzaki,
                listOf( actorAnderson, actorCrudup ),
                mutableListOf()
            ),
            Movie("5",
                "Spirited Away 2",
                "2001",
                "In this animated feature by noted Japanese director Hayao Miyazaki, 10-year-old Chihiro (Rumi Hiiragi) and her parents (Takashi Naitô, Yasuko Sawaguchi) stumble upon a seemingly abandoned amusement park. After her mother and father are turned into giant pigs, Chihiro meets the mysterious Haku (Miyu Irino), who explains that the park is a resort for supernatural beings who need a break from their time spent in the earthly realm, and that she must work there to free herself and her parents.",
                MovieGenre.MYSTERY,
                directorMiyzaki,
                listOf( actorChase, actorMarsden ),
                mutableListOf()
            ),
            Movie("6",
                "Howl's Moving Castle 2",
                "2004",
                "Sophie (Emily Mortimer) has an uneventful life at her late father's hat shop, but all that changes when she befriends wizard Howl (Christian Bale), who lives in a magical flying castle. However, the evil Witch of Waste (Lauren Bacall) takes issue with their budding relationship and casts a spell on young Sophie, which ages her prematurely. Now Howl must use all his magical talents to battle the jealous hag and return Sophie to her former youth and beauty.",
                MovieGenre.HORROR,
                directorMiyzaki,
                listOf( actorBale, actorMortimer ),
                mutableListOf()
            ),
            Movie("7",
                "Ponyo On The Cliff 2",
                "2008",
                "During a forbidden excursion to see the surface world, a goldfish princess encounters a human boy named Sosuke, who gives her the name Ponyo. Ponyo longs to become human, and as her friendship with Sosuke grows, she becomes more humanlike. Ponyo's father brings her back to their ocean kingdom, but so strong is Ponyo's wish to live on the surface that she breaks free, and in the process, spills a collection of magical elixirs that endanger Sosuke's village.",
                MovieGenre.DRAMA,
                directorMiyzaki,
                listOf( actorCyrus, actorJonas ),
                mutableListOf()
            ),
            Movie("8",
                "Princess Mononoke 3",
                "1997",
                "In the 14th century, the harmony that humans, animals and gods have enjoyed begins to crumble. The protagonist, young Ashitaka - infected by an animal attack, seeks a cure from the deer-like god Shishigami. In his travels, he sees humans ravaging the earth, bringing down the wrath of wolf god Moro and his human companion Princess Mononoke. Hiskattempts to broker peace between her and the humans brings only conflict.",
                MovieGenre.DRAMA,
                directorMiyzaki,
                listOf( actorAnderson, actorCrudup ),
                mutableListOf()
            ),
            Movie("9",
                "Spirited Away 3",
                "2001",
                "In this animated feature by noted Japanese director Hayao Miyazaki, 10-year-old Chihiro (Rumi Hiiragi) and her parents (Takashi Naitô, Yasuko Sawaguchi) stumble upon a seemingly abandoned amusement park. After her mother and father are turned into giant pigs, Chihiro meets the mysterious Haku (Miyu Irino), who explains that the park is a resort for supernatural beings who need a break from their time spent in the earthly realm, and that she must work there to free herself and her parents.",
                MovieGenre.MYSTERY,
                directorMiyzaki,
                listOf( actorChase, actorMarsden ),
                mutableListOf()
            ),
            Movie("10",
                "Howl's Moving Castle 3",
                "2004",
                "Sophie (Emily Mortimer) has an uneventful life at her late father's hat shop, but all that changes when she befriends wizard Howl (Christian Bale), who lives in a magical flying castle. However, the evil Witch of Waste (Lauren Bacall) takes issue with their budding relationship and casts a spell on young Sophie, which ages her prematurely. Now Howl must use all his magical talents to battle the jealous hag and return Sophie to her former youth and beauty.",
                MovieGenre.ACTION,
                directorMiyzaki,
                listOf( actorBale, actorMortimer ),
                mutableListOf()
            ),
            Movie("11",
                "Ponyo On The Cliff 3",
                "2008",
                "During a forbidden excursion to see the surface world, a goldfish princess encounters a human boy named Sosuke, who gives her the name Ponyo. Ponyo longs to become human, and as her friendship with Sosuke grows, she becomes more humanlike. Ponyo's father brings her back to their ocean kingdom, but so strong is Ponyo's wish to live on the surface that she breaks free, and in the process, spills a collection of magical elixirs that endanger Sosuke's village.",
                MovieGenre.DRAMA,
                directorMiyzaki,
                listOf( actorCyrus, actorJonas ),
                mutableListOf()
            ),
            Movie("12",
                "Princess Mononoke 4",
                "1997",
                "In the 14th century, the harmony that humans, animals and gods have enjoyed begins to crumble. The protagonist, young Ashitaka - infected by an animal attack, seeks a cure from the deer-like god Shishigami. In his travels, he sees humans ravaging the earth, bringing down the wrath of wolf god Moro and his human companion Princess Mononoke. Hiskattempts to broker peace between her and the humans brings only conflict.",
                MovieGenre.DRAMA,
                directorMiyzaki,
                listOf( actorAnderson, actorCrudup ),
                mutableListOf()
            ),
            Movie("13",
                "Spirited Away 4",
                "2001",
                "In this animated feature by noted Japanese director Hayao Miyazaki, 10-year-old Chihiro (Rumi Hiiragi) and her parents (Takashi Naitô, Yasuko Sawaguchi) stumble upon a seemingly abandoned amusement park. After her mother and father are turned into giant pigs, Chihiro meets the mysterious Haku (Miyu Irino), who explains that the park is a resort for supernatural beings who need a break from their time spent in the earthly realm, and that she must work there to free herself and her parents.",
                MovieGenre.MYSTERY,
                directorMiyzaki,
                listOf( actorChase, actorMarsden ),
                mutableListOf()
            ),
            Movie("14",
                "Howl's Moving Castle 4",
                "2004",
                "Sophie (Emily Mortimer) has an uneventful life at her late father's hat shop, but all that changes when she befriends wizard Howl (Christian Bale), who lives in a magical flying castle. However, the evil Witch of Waste (Lauren Bacall) takes issue with their budding relationship and casts a spell on young Sophie, which ages her prematurely. Now Howl must use all his magical talents to battle the jealous hag and return Sophie to her former youth and beauty.",
                MovieGenre.ROMANCE,
                directorMiyzaki,
                listOf( actorBale, actorMortimer ),
                mutableListOf()
            )
        )
    }

    fun moviesList(): List<Movie> {
        return movies
    }

    fun movieById(id: String): Movie? {
        return movies.find { it.id == id }
    }

    fun rateMovie(id: String, review: Review) {
        movieById(id)?.reviews?.add(review)
    }
}