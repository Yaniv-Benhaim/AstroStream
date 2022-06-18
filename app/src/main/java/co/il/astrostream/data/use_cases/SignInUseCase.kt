package co.il.astrostream.data.use_cases

import co.il.astrostream.data.repositories.AuthRepository

class SignInUseCase(private val authRepository: AuthRepository) {

    operator fun invoke(email: String, password: String) = authRepository.signInWithEmailAndPassword(email, password)

}