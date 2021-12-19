package edu.upb.hciproject.model

import java.io.Serializable

data class Chat(val from: String,
                val message: String,
                val date: String,
                val imageUrl: String): Serializable
