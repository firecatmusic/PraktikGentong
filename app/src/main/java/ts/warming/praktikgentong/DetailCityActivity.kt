package ts.warming.praktikgentong

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailCityActivity : AppCompatActivity() {

    private lateinit var ivCity: ImageView
    private lateinit var tvCity: TextView
    private lateinit var tvCityDescription: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_city)

        ivCity = findViewById(R.id.ivCity)
        tvCity = findViewById(R.id.tvCity)
        tvCityDescription = findViewById(R.id.tvCityDescription)

        tvCity.text = intent.getStringExtra("city_name")
        tvCityDescription.text = intent.getStringExtra("city_description")
    }
}