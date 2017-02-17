def range = 0..4
println range.class
assert range instanceof List

Collection<String> coll = new ArrayList<String>();
coll.add("Groovy");
coll.add("Java");
coll.add("Ruby");
coll.add("Python")
coll << "Smalltalk"
coll[5] = "Perl"


//Groovy 还允许在集合中增加或去掉集合，
def numbers0 = [1,2,3,4]
assert numbers0 + 5 == [1,2,3,4,5]
assert numbers0 - [2,3] == [1,4]


println '.........魔法方法0'
def numbers = [1,2,3,4]
assert numbers.join(",") == "1,2,3,4" 
assert [1,2,3,4,3].count(3) == 2

numbers.each{value ->
	println value
}
println '.........魔法方法1'
assert ["JAVA", "GROOVY"] == ["Java","Groovy"]*.toUpperCase()


println '.........Map集合-java'
Map<String, String>map = new HashMap<String, String>();
map.put("name", "Andy");
map.put("VPN-#","45");

println '.........Map集合-Groovy'
def hash0 = [name:"Andy", "VPN-#":45]
//请注意，Groovy 映射中的键不必是 String。在这个示例中，name 看起来像一个变量，但是在幕后，Groovy 会将它变成 String。

hash0.put("id", 23)
assert hash0.get("name") == "Andy"
//通过.赋值
hash0.dob = "01/29/76"
//. 符号还可以用来获取项
assert hash0.dob == "01/29/76"


println '.........闭包-Groovy'

def hash = [name:"Andy", "VPN-#":45]
//请注意，Groovy 映射中的键不必是 String。在这个示例中，name 看起来像一个变量，但是在幕后，Groovy 会将它变成 String。

hash.put("id", 23)
assert hash.get("name") == "Andy"
//通过.赋值
hash.dob = "01/29/76"
//. 符号还可以用来获取项
assert hash.dob == "01/29/76"

println '.........闭包-写法1'
hash.each{key,value->
	println "$key = $value"
}


println '.........闭包-写法2'
hash.each({key,value->
	println "$key = $value"
})


println '.........闭包-写法3'
//闭包中的 it 变量是一个关键字，指向被调用的外部集合的每个值 — 它是默认值，可以用传递给闭包的参数覆盖它。
def call0 = {it ->
	println "$it.key = $it.value"
	}
hash.each(call0)


println '.........闭包-写法4'
def call = {
	println "$it.key = $it.value"
	}

hash.each(call)



println "验证key 和value的定义"
def maps =[name:'yagnhai','age':'25']
maps.each{key1,value1 ->
	println "$key1 = $value1"
}

maps.each{
	println "$it.key = $it.value"
}


println "使用List验证key 和value的定义"

def acoll = ['yagnhai','xiaoyun','huagnmei']

acoll.each{
	println "value = $it.value"
}

println "使用List验证key 和value的定义value = it.value1"
acoll.each{
	println "value = ${it.value}"
}


println "测试迭代"

"ITERATION".each{
 println it.toLowerCase()
}

println "处理闭包的其他用法"

def excite0 = { word ->
 return "${word}!!"
}

assert "Groovy!!" == excite0("Groovy")
assert "Java!!" == excite0.call("Java")


println "闭包的最后一行作为返回值"
def excite1 = { word ->
  "${word}!!"
}

assert "Groovy!!" == excite1("Groovy")
assert "Java!!" == excite1.call("Java")


println "........................."
println "闭包的最后一行作为返回值,必然有一个返回值,闭包代码的测试"
println "........................."
def excite = { word,value ->
  "${word}!!$value"
}

assert "Groovy!!yanghai" == excite("Groovy","yanghai")
assert "Java!!yanghai" == excite.call("Java","yanghai")












































