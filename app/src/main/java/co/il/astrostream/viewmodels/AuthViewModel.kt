package co.il.astrostream.viewmodels

import androidx.lifecycle.ViewModel
import co.il.astrostream.data.use_cases.SignInUseCase
import co.il.astrostream.data.use_cases.SignOutUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(
    private val signInUseCase: SignInUseCase,
    private val signOutUseCase: SignOutUseCase
) : ViewModel() {

    fun signInWithEmailAndPassword(email: String, password: String) = signInUseCase.invoke(email, password)

    fun signOut() = signOutUseCase.invoke()
}