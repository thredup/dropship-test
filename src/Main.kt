import repository.EventRepo
import kotlin.system.measureTimeMillis

fun main() {
    val eventRepo = EventRepo()
    val eventProcessor = EventProcessor("Single processor")
    val timeInMillis = measureTimeMillis {
        eventRepo.getAllEvents().forEach { eventProcessor.process(it) }
    }
    println("Total time: $timeInMillis ms")
}