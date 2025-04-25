package vcmsa.ci.calculator
import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var tvInput: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvInput = findViewById(R.id.tvInput)
    }

    fun onDigit(view: View) {
        tvInput.append((view as Button).text)
    }

    fun onOperator(view: View) {
        tvInput.append(" ${(view as Button).text} ")
    }

    @SuppressLint("SetTextI18n")
    fun onEqual(view: View) {
        try {
            tvInput.text.toString()
            val result = ExpressionBuilder().build().toString()
            tvInput.text = result
        } catch (e: Exception) {
            tvInput.text = "Error"
        }
    }

}

class ExpressionBuilder {
    fun build() {

    }

}                 