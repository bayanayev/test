package com.kotlinspringvue.backend.controller

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import java.util.concurrent.atomic.AtomicLong
import org.springframework.web.bind.annotation.GetMapping
import com.kotlinspringvue.backend.data.Greeting

@RestController
@RequestMapping("/api")
class BackendController {
	val counter = AtomicLong()
	
	@GetMapping("/greeting")
	fun greeting(name: String) = Greeting(counter.incrementAndGet(), "Hello, $name")
	
}
