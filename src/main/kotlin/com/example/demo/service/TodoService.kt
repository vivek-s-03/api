package com.example.demo.service

import com.example.demo.model.Todo
import com.example.demo.model.TodoDTO
import com.example.demo.repository.TodoRepository
import jakarta.persistence.EntityNotFoundException
import org.springframework.stereotype.Service

@Service
class TodoService(private val repo: TodoRepository) {

    fun all(): List<Todo> = repo.findAll()

    fun find(id: Long): Todo = repo.findById(id)
        .orElseThrow { EntityNotFoundException("Todo $id not found") }

    fun create(dto: TodoDTO): Todo = repo.save(
        Todo(title = dto.title, completed = dto.completed)
    )

    fun update(id: Long, dto: TodoDTO): Todo =
        repo.findById(id).map {
            it.title = dto.title
            it.completed = dto.completed
            repo.save(it)
        }.orElseThrow { EntityNotFoundException("Todo $id not found") }

    fun delete(id: Long) = repo.deleteById(id)
}