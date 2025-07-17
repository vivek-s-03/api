package com.example.demo.controller

import com.example.demo.model.TodoDTO
import com.example.demo.service.TodoService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/todos")
class TodoController(private val svc: TodoService) {

    @GetMapping
    fun all() = svc.all()

    @GetMapping("/{id}")
    fun one(@PathVariable id: Long) = svc.find(id)

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody dto: TodoDTO) = svc.create(dto)

    @PutMapping("/{id}")
    fun update(@PathVariable id: Long, @RequestBody dto: TodoDTO) = svc.update(id, dto)

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun delete(@PathVariable id: Long) = svc.delete(id)
}