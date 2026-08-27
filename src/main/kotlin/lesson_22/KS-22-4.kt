package org.example.lesson_22

data class MainScreenState(
    val data: String = "",
    val isLoading: Boolean = false
)

class MainScreenViewModel {
    var state = MainScreenState()
        private set

    fun loadData() {
        state = state.copy(isLoading = true)
        println("Состояние: ${state.data}, Загрузка: ${state.isLoading}")

        state = state.copy(
            data = "Загруженные данные с сервера",
            isLoading = false
        )
    }
}

fun main() {
    val viewModel = MainScreenViewModel()

    println("Начальное состояние")
    println("Состояние: ${viewModel.state.data}, Загрузка: ${viewModel.state.isLoading}")
    println()

    println("Звгрузка")
    viewModel.loadData()

    println()
    println("Итоговое состояние")
    println("Состояние: ${viewModel.state.data}, Загрузка: ${viewModel.state.isLoading}")
}
