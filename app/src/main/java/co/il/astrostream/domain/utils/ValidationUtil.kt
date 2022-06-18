package co.il.astrostream.domain.utils

import co.il.astrostream.domain.enums.EmailStatus
import co.il.astrostream.domain.enums.PasswordStatus

object ValidationUtil {

    fun validateEmail(email: String) : EmailStatus {
        return EmailStatus.GOOD
    }

    fun validatePassword(password: String) : PasswordStatus {
        return PasswordStatus.GOOD
    }
}