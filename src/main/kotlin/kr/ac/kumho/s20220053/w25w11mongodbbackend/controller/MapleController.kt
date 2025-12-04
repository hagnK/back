package kr.ac.kumho.s20220053.w25w11mongodbbackend.controller

import kr.ac.kumho.s20220053.w25w11mongodbbackend.model.Maple
import kr.ac.kumho.s20220053.w25w11mongodbbackend.service.MapleService
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/maples")
@CrossOrigin(origins = ["http://localhost:5173", "https://hagnk.github.io"])
class MapleController(
    private val service: MapleService
) {
    @GetMapping
    fun getAllMaple():List<Maple> = service.getAllSongs()
}