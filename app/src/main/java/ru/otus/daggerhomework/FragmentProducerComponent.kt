package ru.otus.daggerhomework

import dagger.Component
import javax.inject.Scope

@FragmentScope
@Component(dependencies = [MainActivityComponent::class])
interface FragmentProducerComponent {
    fun inject(fragment: FragmentProducer)
}

@Scope
annotation class FragmentScope