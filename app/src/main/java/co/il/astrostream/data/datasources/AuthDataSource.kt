package co.il.astrostream.data.datasources

import co.il.astrostream.data.results.LoginResult

interface AuthDataSource {

    fun signInWithEmailAndPassword(email: String, password: String) : LoginResult

    fun signOut() : Boolean
}