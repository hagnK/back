package kr.ac.kumho.s20220053.w25w11mongodbbackend.repository

import kr.ac.kumho.s20220053.w25w11mongodbbackend.model.Maple
import org.springframework.data.mongodb.repository.MongoRepository

interface MapleRepository : MongoRepository<Maple, String> {
}