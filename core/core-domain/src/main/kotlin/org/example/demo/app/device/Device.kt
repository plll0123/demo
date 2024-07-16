package org.example.demo.app.device

data class Device(
    val id: Long = 0L,
    val memberId: Long,
    val uid: String,
    val pushToken: String,
    val deviceInfo: String,
) {

    override fun equals(other: Any?): Boolean {
        other ?: return false
        if (other !is Device) return false
        return this.pushToken == other.pushToken
            && this.memberId == other.memberId
    }

    override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + memberId.hashCode()
        result = 31 * result + pushToken.hashCode()
        return result
    }

}
