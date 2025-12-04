package kr.ac.kumho.s20220053.w25w11mongodbbackend.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "songs")
data class Maple(
    @Id val id: String? = null,
    val ocid: String,
    val character_name: String,
    val world_name: String,
    val character_class: String,
    val character_level: Int,
)
