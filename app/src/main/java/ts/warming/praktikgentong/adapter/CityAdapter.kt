package ts.warming.praktikgentong.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ts.warming.praktikgentong.DetailCityActivity
import ts.warming.praktikgentong.R
import ts.warming.praktikgentong.model.City

class CityAdapter(var context: Context, var listCity: ArrayList<City>) :
    RecyclerView.Adapter<CityAdapter.ViewHolder>() {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var title = itemView.findViewById<TextView>(R.id.tvCityName)
        var image = itemView.findViewById<ImageView>(R.id.ivCity)

        fun initView(city: City) {
            title.setText(city.cityName)
//            image.setText(city.cityName)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_city, parent, false))
    }

    override fun getItemCount(): Int {
        return listCity.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data= listCity[position]
        holder.initView(data)
        holder.itemView.setOnClickListener {
            val intent = Intent(context, DetailCityActivity::class.java)
            intent.putExtra("city_image",data.cityImage)
            intent.putExtra("city_name",data.cityName)
            intent.putExtra("city_description",data.cityDescription)
            context.startActivity(intent)
        }
    }
}