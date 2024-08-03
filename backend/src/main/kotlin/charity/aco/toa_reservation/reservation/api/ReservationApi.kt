package charity.aco.toa_reservation.reservation.api

import charity.aco.toa_reservation.reservation.dto.ReservationDto
import charity.aco.toa_reservation.reservation.service.ReservationService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/reservation")
class ReservationApi(private val reservationService: ReservationService) {

    @GetMapping
    fun getReservations(): ResponseEntity<List<ReservationDto>> {
        val result = this.reservationService.findAll()
        return ResponseEntity.ok(result)
    }
}