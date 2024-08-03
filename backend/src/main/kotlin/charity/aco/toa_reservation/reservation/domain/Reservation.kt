package charity.aco.toa_reservation.reservation.domain

import charity.aco.toa_reservation.common.domain.BaseEntity
import charity.aco.toa_reservation.reservation.dto.ReservationDto
import jakarta.persistence.Entity

@Entity
data class Reservation(
    private val firstName: String,
    private val lastName: String,
    private val email: String
) : BaseEntity() {

    fun toDto(): ReservationDto {
        return ReservationDto(firstName, lastName, email)
    }
}
