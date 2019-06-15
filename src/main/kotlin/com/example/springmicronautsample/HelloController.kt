package com.example.springmicronautsample

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class HelloController(
        private val service: HelloService
) {
    @GetMapping("/hello/{name}")
    @ResponseBody
    fun hello(@PathVariable name: String): String {
        return service.hello(name)
    }
}