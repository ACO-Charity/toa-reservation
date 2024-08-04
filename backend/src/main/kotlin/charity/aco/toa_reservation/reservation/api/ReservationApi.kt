package charity.aco.toa_reservation.reservation.api

import charity.aco.toa_reservation.reservation.dto.ReservationDto
import charity.aco.toa_reservation.reservation.service.ReservationService
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@Tag(name = "Reservation API")
@RequestMapping("/api/reservation")
class ReservationApi(private val reservationService: ReservationService) {

    @GetMapping
    fun getReservations(): ResponseEntity<List<ReservationDto>> {
        val result = this.reservationService.findAll()
        return ResponseEntity.ok(result)
    }

    @GetMapping("/{id}")
    fun findReservationById(@PathVariable id: UUID): ResponseEntity<ReservationDto> {
        val result = this.reservationService.findById(id)
        return ResponseEntity.ok(result)
    }

    @PostMapping
    fun createOrUpdateReservation(@RequestBody reservationDto: ReservationDto): ResponseEntity<ReservationDto> {
        val result = this.reservationService.createOrUpdate(reservationDto)
        return ResponseEntity.ok(result)
    }

    @DeleteMapping("/{id}")
    fun deleteReservationById(@PathVariable id: UUID): ResponseEntity<Void> {
        this.reservationService.deleteById(id)
        return ResponseEntity.noContent().build()
    }
}