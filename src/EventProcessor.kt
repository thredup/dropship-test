import repository.SyncEvent

class EventProcessor(private val context: String) {
    fun process(event: SyncEvent): Boolean {
        val delay = (700..1300).random()
        Thread.sleep(delay.toLong())
        val success = (0..9).random() < 8
        if (success) {
            println("[$context] Event processed: $event, delay: $delay ms")
        } else {
            println("[$context] Event failed: $event, delay: $delay ms")
        }
        return success
    }
}