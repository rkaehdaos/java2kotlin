package dev.haja.java2kotlin.repository

import dev.haja.java2kotlin.domain.Memo
import org.springframework.data.jpa.repository.JpaRepository

interface MemoRepository : JpaRepository<Memo, Long>
