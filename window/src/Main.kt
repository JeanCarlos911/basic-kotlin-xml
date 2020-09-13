import javax.swing.JFrame

fun main() {
    println("Hi, kotlin !!!")
    val window = Main()
}

class Main {
    constructor(){
        val frame = JFrame()
        frame.setSize(800, 600)
        frame.setLocationRelativeTo(null)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
        frame.setVisible(true)
    }
}