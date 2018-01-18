package com.asti.csd


import grails.rest.*

@Resource(uri = '/todos', readOnly = false, formats = ['json', 'xml'])
class Todo {
	String description
	boolean done
}