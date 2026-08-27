package org.example.lesson_22

class MainScreenViewModel {
    data class MainScreenState(
        val data: String = "",
        val isLoading: Boolean = false
    )

    var mainScreenState = MainScreenState()
        private set

    fun loadData() {
        mainScreenState = mainScreenState.copy(isLoading = true)
        println("Состояние: ${mainScreenState.data}, Загрузка: ${mainScreenState.isLoading}")

        mainScreenState = mainScreenState.copy(
            data = "Загруженные данные с сервера",
            isLoading = false
        )
    }
}

fun main() {
    val viewModel = MainScreenViewModel()

    println("Начальное состояние")
    println("Состояние: ${viewModel.mainScreenState.data}, Загрузка: ${viewModel.mainScreenState.isLoading}")
    println()

    println("Загрузка")
    viewModel.loadData()

    println()
    println("Итоговое состояние")
    println("Состояние: ${viewModel.mainScreenState.data}, Загрузка: ${viewModel.mainScreenState.isLoading}")
}
