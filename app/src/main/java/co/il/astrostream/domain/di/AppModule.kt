package co.il.astrostream.domain.di

import co.il.astrostream.data.framework.AuthDataSourceImpl
import co.il.astrostream.data.repositories.AuthRepository
import co.il.astrostream.data.use_cases.SignInUseCase
import co.il.astrostream.data.use_cases.SignOutUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Singleton
    @Provides
    fun providesAuthDataSource() = AuthDataSourceImpl()

    @Singleton
    @Provides
    fun provideAuthRepository(authDataSource: AuthDataSourceImpl) = AuthRepository(authDataSource)

    @Singleton
    @Provides
    fun providesSignInUseCase(authRepository: AuthRepository) = SignInUseCase(authRepository)

    @Singleton
    @Provides
    fun providesSignOutUseCase(authRepository: AuthRepository) = SignOutUseCase(authRepository)
}