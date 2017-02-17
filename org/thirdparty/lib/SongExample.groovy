package org.thirdparty.lib

import org.acme.groovy.Song

class SongExample {
 static void main(args) {

 	def sng = new Song(name:'yanghai',artist:'artist',genre:'genre')

 	println sng

 	//可以初始化随意个的属性值
	def sng2 = new Song(name:"Kung Fu Fighting", genre:"Disco")
	//这里出现了NULL异常
	//println sng2.artist.toUpperCase()
	//在某个对象调用方法之前，添加一个'?',可以处理null的异常
	//也就是说，可以防止在 null 对象上调用方法。
	println sng2.artist?.toUpperCase()
	println sng2
	println '''
	//这里出现了NULL异常
	//println sng2.artist.toUpperCase()
	//在某个对象调用方法之前，添加一个'?',可以处理null的异常
	//也就是说，可以防止在 null 对象上调用方法。
	'''
	def sng3 = new Song()
	sng3.name = "Funkytown"
	sng3.artist = "Lipps Inc."
	sng3.setGenre("Disco")
	assert sng3.getArtist() == "Lipps Inc."



	sng3.setGenre "Disco"
	assert sng3.genre == "Disco"

	println sng3

	assert sng3.genre == "Disco"

	

 }
}