package charity.aco.toa_reservation.common.domain

import jakarta.persistence.Column
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.MappedSuperclass
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import org.hibernate.annotations.UuidGenerator
import java.time.LocalDateTime
import java.util.*

@MappedSuperclass
abstract class BaseEntity {
    @Id
    @GeneratedValue(generator = "UUID")
    @UuidGenerator
    val id: UUID = UUID.randomUUID()

    @Column(nullable = false, updatable = false)
    @CreationTimestamp
    lateinit var created: LocalDateTime

    @UpdateTimestamp
    lateinit var updated: LocalDateTime
}
