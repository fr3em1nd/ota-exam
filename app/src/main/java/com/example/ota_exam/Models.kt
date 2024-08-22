data class LevelResponse(
    val levels: List<Level>
)

data class Level(
    val level: String,
    val title: String,
    val description: String,
    val state: String,
    val activities: List<Activity>
)

data class Activity(
    val id: String,
    val challengeId: String,
    val type: String,
    val title: String
)
