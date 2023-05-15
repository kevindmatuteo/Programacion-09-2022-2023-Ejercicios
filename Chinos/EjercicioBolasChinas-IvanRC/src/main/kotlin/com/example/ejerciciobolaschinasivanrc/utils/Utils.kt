package com.example.ejerciciobolaschinasivanrc.utils

import com.example.ejerciciobolaschinasivanrc.routes.RoutesManager
import java.io.InputStream
import java.net.URL

fun getResource(resource: String): URL {
    return RoutesManager.app::class.java.getResource(resource)
        ?: throw RuntimeException("No se ha encontrado el recurso: $resource")
}

fun getResourceAsStream(resource: String): InputStream {
    return RoutesManager.app::class.java.getResourceAsStream(resource)
        ?: throw RuntimeException("No se ha encontrado el recurso como stream: $resource")
}