package charity.aco.toa_reservation.reservation.domain

import charity.aco.toa_reservation.common.domain.BaseEntity
import charity.aco.toa_reservation.reservation.dto.ReservationDto
import jakarta.persistence.Entity

@Entity
data class Reservation(
    var firstName: String = "",
    var lastName: String = "",
    var email: String = ""
) : BaseEntity() {

    fun toDto(): ReservationDto {
        return ReservationDto(
            id = id,
            firstName = firstName,
            lastName = lastName,
            email = email
        )
    }
}
