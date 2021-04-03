fun main(args: Array<String>) {
    val userRepository = UserRepository()
    val user = User("Dragon Dogowski")

    userRepository.save(user)

    val resultUser = userRepository.findFirst()
    println("Found stored user $resultUser")
}