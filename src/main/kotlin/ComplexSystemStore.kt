class ComplexSystemStore(val filePath:String) {
    init {
        println("Reading data from file $filePath")
    }

    val store = HashMap<String,String>()

    fun store(key:String, payLoad:String) {
        store.put(key, payLoad)
    }

    fun read(key:String):String = store[key]?:""

    fun commit() = println("Storing cached data $store to $filePath ")
}