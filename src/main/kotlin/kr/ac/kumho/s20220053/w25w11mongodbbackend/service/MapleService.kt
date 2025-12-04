package kr.ac.kumho.s20220053.w25w11mongodbbackend.service

import kr.ac.kumho.s20220053.w25w11mongodbbackend.model.Maple
import kr.ac.kumho.s20220053.w25w11mongodbbackend.repository.MapleRepository
import org.springframework.stereotype.Service

@Service
class MapleService(
    private val repository: MapleRepository
) {
    fun getAllSongs(): List<Maple> = repository.findAll()
}