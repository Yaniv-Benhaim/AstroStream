package co.il.astrostream.data.framework

import co.il.astrostream.domain.enums.EmailStatus
import co.il.astrostream.domain.enums.PasswordStatus
import co.il.astrostream.domain.utils.ValidationUtil
import co.il.astrostream.data.datasources.AuthDataSource
import co.il.astrostream.data.results.LoginResult


class AuthDataSourceImpl : AuthDataSource {




    override fun signInWithEmailAndPassword(email: String, password: String): LoginResult {


        val loginResult = LoginResult()


        when(ValidationUtil.validateEmail(email)) {
            EmailStatus.GOOD -> { }
            else -> { loginResult.emailError = true }
        }

        when(ValidationUtil.validatePassword(password)) {
            PasswordStatus.GOOD -> {}
            else -> { loginResult.passwordError = true }
        }

//        auth.createUserWithEmailAndPassword(email, password)
//            .addOnCompleteListener(this) { task ->
//                if (task.isSuccessful) {
//                    // Sign in success, update UI with the signed-in user's information
//                    //Log.d(TAG, "createUserWithEmail:success")
//                   // val user = auth.currentUser
//                    //updateUI(user)
//                } else {
//                    // If sign in fails, display a message to the user.
////                    Log.w(TAG, "createUserWithEmail:failure", task.exception)
////                    Toast.makeText(baseContext, "Authentication failed.",
////                        Toast.LENGTH_SHORT).show()
////                    updateUI(null)
//                }
//            }


        return LoginResult(success = true, emailError = false, passwordError = false, connectionError = false, null)
    }

    override fun signOut(): Boolean {
        return true
    }
}