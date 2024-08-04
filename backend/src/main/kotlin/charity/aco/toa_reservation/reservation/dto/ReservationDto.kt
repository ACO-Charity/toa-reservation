package charity.aco.toa_reservation.reservation.dto

import java.util.*

data class ReservationDto(
    val id: UUID? = null,
    val firstName: String,
    val lastName: String,
    val email: String
)
