package io.craigmiller160.oauth2.client

// TODO might not need this
data class AuthServerClientRequest(
        val url: String,
        val clientKey: String,
        val clientSecret: String,
        val body: Map<String,String>
)