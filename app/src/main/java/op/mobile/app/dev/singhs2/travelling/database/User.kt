package op.mobile.app.dev.singhs2.travelling.database

/**
 * Imports to migrate library and project dependencies.
 */
import androidx.room.Entity
import androidx.room.PrimaryKey
/**
 * user data class - Using @Entity annotation and creating the quiz_score
 * table to store the highest score data.
 * @PrimaryKey - makes sure the entry is auto generated to void any entry conflicts
 * and then storing the data
 */
@Entity(tableName = "quiz_score")
data class User(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val quizScore: Int
)
