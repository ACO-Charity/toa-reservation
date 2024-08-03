package charity.aco.toa_reservation.reservation.repository

import charity.aco.toa_reservation.reservation.domain.Reservation
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface ReservationRepository : JpaRepository<Reservation, UUID> {
}