package org.acme.groovy
class Song{
	def name
	def artist
	def genre
	
	def getGenre(){
	 genre?.toUpperCase()
	}
	
	String toString(){
		"$name,$artist,$genre"
	}
}