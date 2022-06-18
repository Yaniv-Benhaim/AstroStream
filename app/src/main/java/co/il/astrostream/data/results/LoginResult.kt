package co.il.astrostream.data.results

import co.il.astrostream.domain.models.User

data class LoginResult(
    var success: Boolean = false,
    var emailError: Boolean = false,
    var passwordError: Boolean = false,
    var connectionError: Boolean = false,
    var user: User? = null
) {
}