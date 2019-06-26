package io.kaen.dagger

class BadSyntaxException(msg: String = "Bad Syntax") : Exception(msg)

class DomainException(msg: String = "Domain Error") : Exception(msg)

class ImaginaryException(msg:String = "Imaginary Number not supported"):Exception(msg)

class BaseNotFoundException(msg: String = "Base Not Found"):Exception(msg)