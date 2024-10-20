package ts.warming.praktikgentong

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ts.warming.praktikgentong.adapter.CityAdapter
import ts.warming.praktikgentong.model.City


class MainActivity : AppCompatActivity() {

    lateinit var recyclerViewCity: RecyclerView
    lateinit var cityAdapter: CityAdapter
    var listCity = ArrayList<City>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerViewCity = findViewById(R.id.recyclerViewCity)
        cityAdapter = CityAdapter(this, listCity)

        recyclerViewCity.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        recyclerViewCity.adapter = cityAdapter
        populateData()
    }

    private fun populateData() {
        val citiesInIndonesia = listOf(
            City("Jakarta", "The capital city, known for its bustling urban life and rich history."),
            City("Surabaya", "The second-largest city, a major trade center with a vibrant cultural scene."),
            City("Bandung", "Known for its cooler climate and beautiful landscapes, popular for fashion and culinary tourism."),
            City("Medan", "The largest city in Sumatra, famous for its diverse cuisine and as a gateway to Lake Toba."),
            City("Bali", "An island province renowned for its stunning beaches, rice terraces, and vibrant arts scene."),
            City("Semarang", "A port city known for its blend of Javanese and Chinese cultures and colonial architecture."),
            City("Palembang", "Famous for its culinary delights, particularly the dish pempek, and the Musi River."),
            City("Makassar", "The largest city in Eastern Indonesia, known for its maritime culture and delicious seafood."),
            City("Yogyakarta", "A cultural hub known for its traditional arts, batik, and the nearby Borobudur Temple."),
            City("Batam", "An industrial city close to Singapore, known for its economic zones and beaches."),
            City("Bandar Lampung", "The capital of Lampung province, known for its tropical beaches and wayang (puppet shows)."),
            City("Denpasar", "The capital of Bali, a gateway to the island's tourist attractions and cultural sites."),
            City("Tangerang", "Part of the Greater Jakarta area, known for its modern amenities and shopping centers."),
            City("Malang", "A city known for its cooler climate, beautiful parks, and as a base for Mount Bromo."),
            City("Samarinda", "The capital of East Kalimantan, located by the Mahakam River, known for its natural beauty.")
        )

        listCity.addAll(citiesInIndonesia)
        cityAdapter.notifyDataSetChanged()

    }
}