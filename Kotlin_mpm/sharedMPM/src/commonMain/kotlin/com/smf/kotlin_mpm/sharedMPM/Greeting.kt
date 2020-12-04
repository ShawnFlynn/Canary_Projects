package com.smf.kotlin_mpm.sharedMPM


class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}
