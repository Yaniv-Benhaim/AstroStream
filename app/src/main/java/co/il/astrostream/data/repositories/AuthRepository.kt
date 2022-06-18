package co.il.astrostream.data.repositories

import co.il.astrostream.data.datasources.AuthDataSource

class AuthRepository(private val authDataSource: AuthDataSource) {

    fun signInWithEmailAndPassword(email: String, password: String) = authDataSource.signInWithEmailAndPassword(email, password)

    fun signOut() = authDataSource.signOut()
}