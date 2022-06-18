package co.il.astrostream.data.use_cases

import co.il.astrostream.data.repositories.AuthRepository

class SignOutUseCase(private val authRepository: AuthRepository) {

    operator fun invoke() = authRepository.signOut()

}