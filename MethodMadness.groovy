def repeat(val){
	for(i in 1..5){
		println val
		}
}

repeat('adfada')

//默认的缺省值
def repeat1(val = 'hello groovy',repeat = 5){
		for(i in 0..repeat){
			println val
		}
}

repeat1("Hello World", 2)
repeat1("Goodbye sunshine", 4)
repeat1("foo")