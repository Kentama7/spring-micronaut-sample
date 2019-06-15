package com.example.springmicronautsample

import org.springframework.stereotype.Service

@Service
class HelloService {

    fun hello(name: String) = "Hello, $name"
}