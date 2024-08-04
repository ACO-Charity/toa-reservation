package charity.aco.toa_reservation.reservation.service

import charity.aco.toa_reservation.reservation.domain.Reservation
import charity.aco.toa_reservation.reservation.dto.ReservationDto
import charity.aco.toa_reservation.reservation.repository.ReservationRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class ReservationService(private val reservationRepository: ReservationRepository) {

    fun findAll(): List<ReservationDto> {
        return this.reservationRepository.findAll().map { it.toDto() }
    }

    fun findById(id: UUID): ReservationDto {
        return this.reservationRepository.findById(id).get().toDto()
    }

    fun createOrUpdate(reservationDto: ReservationDto): ReservationDto {
        val toSave = if (reservationDto.id != null) {
            this.reservationRepository.findById(reservationDto.id).get()
        } else {
            Reservation()
        }

        toSave.firstName = reservationDto.firstName
        toSave.lastName = reservationDto.lastName
        toSave.email = reservationDto.email

        val saved = this.reservationRepository.save(toSave)
        return saved.toDto()
    }

    fun deleteById(id: UUID) {
        this.reservationRepository.deleteById(id)
    }
}