package com.example.core

object NavigatorWrapper {

    var navigator: Navigator? = null

    fun <T> getNavigator() = navigator!! as T

}