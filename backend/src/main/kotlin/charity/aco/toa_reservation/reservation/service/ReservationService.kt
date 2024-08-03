package charity.aco.toa_reservation.reservation.service

import charity.aco.toa_reservation.reservation.dto.ReservationDto
import charity.aco.toa_reservation.reservation.repository.ReservationRepository
import org.springframework.stereotype.Service

@Service
class ReservationService(private val reservationRepository: ReservationRepository) {

    fun findAll(): List<ReservationDto> {
        return this.reservationRepository.findAll().map { it.toDto() }
    }
}