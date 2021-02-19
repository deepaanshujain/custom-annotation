package com.example.service;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.example.annotations.LogExecutionTime;

@Service
public class MainService {
	
	@LogExecutionTime
	public HashMap<Integer, String> testAnnotation() {
		HashMap<Integer, String> map = new HashMap<>();
		int counter =0;
		while(counter< 100) {
			map.put(counter, "Value-"+counter);
			counter++;
		}
		return map;
	}
}
