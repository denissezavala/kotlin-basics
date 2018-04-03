import java.time.LocalDateTime

data class CoolUser(
        var name: String,
        var nickname: String,
        var age: Int,
        var isAdmin: Boolean,
        var isManager: Boolean,
        var createdAt: LocalDateTime,
        var updatedAt: LocalDateTime
)
