import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond {

    val date: LocalDateTime

    constructor(date: LocalDate) {
        this.date = date.atStartOfDay().plusSeconds(1_000_000_000)
    }

    constructor(date: LocalDateTime) {
        this.date = date.plusSeconds(1_000_000_000)
    }
}
