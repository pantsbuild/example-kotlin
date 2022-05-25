package org.pantsbuild.example.json

import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import java.nio.charset.StandardCharsets
import java.nio.file.Files
import java.nio.file.Paths

@Serializable
data class User(
    val name: String,
    val email: String,
)

fun decodeUser(file: String) {
    val contentBytes = Files.readAllBytes(Paths.get(file))
    val content = String(contentBytes, StandardCharsets.UTF_8)
    val user = Json.decodeFromString<User>(content)

    println("Name: ${user.name}")
    println("Email: ${user.email}")
}

fun encodeUser(name: String, email: String) {
    val user = User(name, email)
    println(Json.encodeToString(user))
}

fun main(args: Array<String>) {
    when (args.size) {
        1 -> decodeUser(args[0])
        2 -> encodeUser(args[0], args[1])
        else -> throw IllegalArgumentException("invalid number of parameters")
    }
}
