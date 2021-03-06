package io.craigmiller160.oauth2.exception

import java.lang.RuntimeException

class BadAuthenticationException(msg: String, cause: Throwable?) : RuntimeException(msg, cause)